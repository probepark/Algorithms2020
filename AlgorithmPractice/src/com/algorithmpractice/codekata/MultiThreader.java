package com.algorithmpractice.codekata;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class MultiThreader {

	public void runTheThing(ExecutorService executor) {
		executor.submit(() -> {
			String threadName = Thread.currentThread().getName();
			System.out.println("Hello " + threadName);
		});
	}
	
	public void runTheThingFuture(ExecutorService executor) throws InterruptedException, ExecutionException {
		Future<String> future = executor.submit(task);

		System.out.println("future done? " + future.isDone());

		String result = future.get();

		System.out.println("future done? " + future.isDone());
		System.out.print("result: " + result);
	}

	public Future<String> runTheThingFuture(ExecutorService executor, Integer i) throws InterruptedException, ExecutionException {
		return executor.submit(()->{
			System.out.println(i.toString());
			return i.toString(); 
		});
	}
	
	public void getResult(Future future) throws InterruptedException, ExecutionException {
		while (!future.isDone()) {
			System.out.println("Calculating...");
			Thread.sleep(300);
		}

		System.out.println("result = " + future.get().toString());
	}
	
	Callable<String> task = () -> {
	        return Thread.currentThread().getName();
	};

	public void shutItDown(ExecutorService executor) {
		try {
			System.out.println("attempt to shutdown executor");
			executor.shutdown();
			executor.awaitTermination(5, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			System.err.println("tasks interrupted");
		} finally {
			if (!executor.isTerminated()) {
				System.err.println("cancel non-finished tasks");
			}
			executor.shutdownNow();
			System.out.println("shutdown finished");
		}
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		MultiThreader mtp = new MultiThreader();
//		ExecutorService executor = Executors.newSingleThreadExecutor();
		ExecutorService executor = Executors.newFixedThreadPool(3);
		
//		mtp.runTheThing(executor);
//		mtp.runTheThing(executor);
//		mtp.runTheThing(executor);
//		mtp.runTheThing(executor);
//		mtp.runTheThing(executor);
		List<Future> futures = new ArrayList<>();
		for(int i=0; i<5; i++) {
			futures.add(mtp.runTheThingFuture(executor,i));
		}
		futures.forEach( f -> {
			try {
				mtp.getResult(f);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}
		);

		mtp.shutItDown(executor);
	}

}

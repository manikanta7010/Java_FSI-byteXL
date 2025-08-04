// package com.java.threads;

public class Deamon implements Runnable {

	@Override
	public void run() {

		if (Thread.currentThread().isDaemon()) {
			System.out.println("run() method called by the DAEMON Thread");
		} else {
			System.out.println("run() methode called by NORMAL Thread");
		}

	}

	public static void main(String[] args) {

		Thread t = new Thread(new Deamon());
		t.setDaemon(true);
		t.start();
	}

}

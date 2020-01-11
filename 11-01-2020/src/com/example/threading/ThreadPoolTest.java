package com.example.threading;

public class ThreadPoolTest {
public static void main(String[] args)
{
	new ThreadPriorityTest("Thread 1").start();
	new ThreadPriorityTest("Thread 2").start();
	new ThreadPriorityTest("Thread 3").start();
	ThreadGroup tg = Thread.currentThread().getThreadGroup();
	System.out.println("Active Threads: "+tg.activeCount());
	Thread[] t = new Thread[10];
	int size = tg.enumerate(t);
	for(int a =0;a<size;a++)
	{
		System.out.println(t[a].getName());
	}
}
}

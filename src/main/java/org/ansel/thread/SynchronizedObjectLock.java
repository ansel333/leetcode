package org.ansel.thread;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class SynchronizedObjectLock implements Runnable{
    static SynchronizedObjectLock instance = new SynchronizedObjectLock();

    @Override
    public void run() {
        synchronized (this) {
            System.out.println("I am the thread: " + Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("The thread " + Thread.currentThread().getName() + " is ended.");
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance);
        t1.start();
        t2.start();
    }
}

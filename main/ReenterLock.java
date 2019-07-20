package main;

import java.util.concurrent.locks.ReentrantLock;

public class ReenterLock implements Runnable {

    public static ReentrantLock lock = new ReentrantLock();
    public static int i = 0;
    @Override
    public void run() {
        for(int j=0;j<1000000;j++){
            // lock与unlock的次数必须一致;否知锁不被释放或出现异常
            lock.lock();
            try{
                i++;
            }finally {
                lock.unlock();
            }
        }
    }
    public static void main(String[] args)throws Exception{
        ReenterLock a = new ReenterLock();
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(a);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(i);
    }
}

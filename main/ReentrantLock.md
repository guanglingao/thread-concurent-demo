#### lock() : 获得锁，如果锁已经被占用，则等待。
#### lockInterruptibly() : 获得锁，但优先相应中断。
#### tryLock() : 尝试获得锁，如果成功，返回true，失败返回false。该方法不等待，立即返回。
#### tryLock(long time,TimeUnit unit) : 在给定时间内尝试获得锁。
#### unlock() : 释放锁
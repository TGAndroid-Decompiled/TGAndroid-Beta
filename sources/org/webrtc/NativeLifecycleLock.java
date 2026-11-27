package org.webrtc;

import java.util.concurrent.locks.ReentrantReadWriteLock;
public class NativeLifecycleLock {
    private final String className;
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private long nativePointer;

    public interface NativeCallable<T> {
        T call();
    }

    public interface NativeDisposer {
        void dispose(long j);
    }

    public interface NativePointerCallable<T> {
        T call(long j);
    }

    public interface NativePointerRunnable {
        void run(long j);
    }

    public interface NativeRunnable {
        void run();
    }

    public NativeLifecycleLock(String str, long j) {
        this.className = str;
        this.nativePointer = j;
    }

    private void checkNotDisposed() {
        if (this.nativePointer != 0) {
            return;
        }
        grb.i(c00.k(new StringBuilder(), this.className, " has been disposed."));
    }

    public <T> T call(NativePointerCallable<T> nativePointerCallable) {
        this.lock.readLock().lock();
        try {
            checkNotDisposed();
            return nativePointerCallable.call(this.nativePointer);
        } finally {
            this.lock.readLock().unlock();
        }
    }

    public <T> T callOrDefault(NativeCallable<T> nativeCallable, T t) {
        this.lock.readLock().lock();
        try {
            if (this.nativePointer == 0) {
                String str = this.className;
                Logging.w(str, this.className + " has been disposed.");
                return t;
            }
            return nativeCallable.call();
        } finally {
            this.lock.readLock().unlock();
        }
    }

    public void dispose(NativeDisposer nativeDisposer) {
        if (isDisposed()) {
            return;
        }
        this.lock.writeLock().lock();
        try {
            long j = this.nativePointer;
            if (j != 0) {
                nativeDisposer.dispose(j);
                this.nativePointer = 0L;
            }
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    public long getNativePointer() {
        this.lock.readLock().lock();
        try {
            checkNotDisposed();
            return this.nativePointer;
        } finally {
            this.lock.readLock().unlock();
        }
    }

    public boolean isDisposed() {
        boolean z;
        this.lock.readLock().lock();
        try {
            if (this.nativePointer == 0) {
                z = true;
            } else {
                z = false;
            }
            return z;
        } finally {
            this.lock.readLock().unlock();
        }
    }

    public void run(NativePointerRunnable nativePointerRunnable) {
        this.lock.readLock().lock();
        try {
            checkNotDisposed();
            nativePointerRunnable.run(this.nativePointer);
        } finally {
            this.lock.readLock().unlock();
        }
    }

    public boolean runIfAlive(NativeRunnable nativeRunnable) {
        this.lock.readLock().lock();
        try {
            if (this.nativePointer == 0) {
                String str = this.className;
                Logging.w(str, this.className + " has been disposed.");
                this.lock.readLock().unlock();
                return false;
            }
            nativeRunnable.run();
            this.lock.readLock().unlock();
            return true;
        } catch (Throwable th) {
            this.lock.readLock().unlock();
            throw th;
        }
    }

    public void run(NativeRunnable nativeRunnable) {
        this.lock.readLock().lock();
        try {
            checkNotDisposed();
            nativeRunnable.run();
        } finally {
            this.lock.readLock().unlock();
        }
    }

    public <T> T call(NativeCallable<T> nativeCallable) {
        this.lock.readLock().lock();
        try {
            checkNotDisposed();
            return nativeCallable.call();
        } finally {
            this.lock.readLock().unlock();
        }
    }

    public <T> T callOrDefault(NativePointerCallable<T> nativePointerCallable, T t) {
        this.lock.readLock().lock();
        try {
            long j = this.nativePointer;
            if (j == 0) {
                String str = this.className;
                Logging.w(str, this.className + " has been disposed.");
                return t;
            }
            return nativePointerCallable.call(j);
        } finally {
            this.lock.readLock().unlock();
        }
    }

    public boolean runIfAlive(NativePointerRunnable nativePointerRunnable) {
        this.lock.readLock().lock();
        try {
            long j = this.nativePointer;
            if (j == 0) {
                String str = this.className;
                Logging.w(str, this.className + " has been disposed.");
                this.lock.readLock().unlock();
                return false;
            }
            nativePointerRunnable.run(j);
            this.lock.readLock().unlock();
            return true;
        } catch (Throwable th) {
            this.lock.readLock().unlock();
            throw th;
        }
    }
}

package org.webrtc;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
public class ThreadUtils {

    public class C1CaughtException {
        Exception f44066e;
    }

    public class C1Result {
        public V value;
    }

    public interface BlockingOperation {
        void run();
    }

    public static class ThreadChecker {
        private Thread thread = Thread.currentThread();

        public void checkIsOnValidThread() {
            if (this.thread == null) {
                this.thread = Thread.currentThread();
            }
            if (Thread.currentThread() == this.thread) {
                return;
            }
            throw new IllegalStateException("Wrong thread");
        }

        public void detachThread() {
            this.thread = null;
        }
    }

    public static void awaitUninterruptibly(final CountDownLatch countDownLatch) {
        executeUninterruptibly(new BlockingOperation() {
            @Override
            public void run() {
                countDownLatch.await();
            }
        });
    }

    public static void checkIsOnMainThread() {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return;
        }
        throw new IllegalStateException("Not on main thread!");
    }

    public static StackTraceElement[] concatStackTraces(StackTraceElement[] stackTraceElementArr, StackTraceElement[] stackTraceElementArr2) {
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[stackTraceElementArr.length + stackTraceElementArr2.length];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr3, 0, stackTraceElementArr.length);
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, stackTraceElementArr.length, stackTraceElementArr2.length);
        return stackTraceElementArr3;
    }

    public static void executeUninterruptibly(BlockingOperation blockingOperation) {
        boolean z4 = false;
        while (true) {
            try {
                blockingOperation.run();
                break;
            } catch (InterruptedException unused) {
                z4 = true;
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
    }

    public static <V> V invokeAtFrontUninterruptibly(Handler handler, final Callable<V> callable) {
        if (handler.getLooper().getThread() == Thread.currentThread()) {
            try {
                return callable.call();
            } catch (Exception e6) {
                throw new RuntimeException(e6);
            }
        }
        final C1Result c1Result = new C1Result();
        final C1CaughtException c1CaughtException = new C1CaughtException();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        handler.post(new Runnable() {
            @Override
            public void run() {
                try {
                    C1Result.this.value = callable.call();
                } catch (Exception e10) {
                    c1CaughtException.f44066e = e10;
                }
                countDownLatch.countDown();
            }
        });
        awaitUninterruptibly(countDownLatch);
        if (c1CaughtException.f44066e == null) {
            return c1Result.value;
        }
        RuntimeException runtimeException = new RuntimeException(c1CaughtException.f44066e);
        runtimeException.setStackTrace(concatStackTraces(c1CaughtException.f44066e.getStackTrace(), runtimeException.getStackTrace()));
        throw runtimeException;
    }

    public static boolean joinUninterruptibly(Thread thread, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z4 = false;
        long j11 = j10;
        while (j11 > 0) {
            try {
                thread.join(j11);
                break;
            } catch (InterruptedException unused) {
                j11 = j10 - (SystemClock.elapsedRealtime() - elapsedRealtime);
                z4 = true;
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
        return !thread.isAlive();
    }

    public static boolean awaitUninterruptibly(CountDownLatch countDownLatch, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z4 = false;
        long j11 = j10;
        boolean z10 = false;
        do {
            try {
                z4 = countDownLatch.await(j11, TimeUnit.MILLISECONDS);
                break;
            } catch (InterruptedException unused) {
                j11 = j10 - (SystemClock.elapsedRealtime() - elapsedRealtime);
                z10 = true;
                if (j11 <= 0) {
                }
            }
        } while (j11 <= 0);
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return z4;
    }

    public static void joinUninterruptibly(final Thread thread) {
        executeUninterruptibly(new BlockingOperation() {
            @Override
            public void run() {
                thread.join();
            }
        });
    }

    public static void invokeAtFrontUninterruptibly(Handler handler, final Runnable runnable) {
        invokeAtFrontUninterruptibly(handler, new Callable<Void>() {
            @Override
            public Void call() {
                runnable.run();
                return null;
            }
        });
    }
}

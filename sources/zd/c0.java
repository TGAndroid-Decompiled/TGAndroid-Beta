package zd;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
public final class c0 extends s0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final c0 f60057s;
    public static final long f60058w;

    static {
        Long l10;
        ?? s0Var = new s0();
        f60057s = s0Var;
        s0Var.i(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f60058w = timeUnit.toNanos(l10.longValue());
    }

    @Override
    public final l0 a(long j3, y1 y1Var, id.h hVar) {
        long j10 = 0;
        if (j3 > 0) {
            if (j3 >= 9223372036854L) {
                j10 = Long.MAX_VALUE;
            } else {
                j10 = 1000000 * j3;
            }
        }
        if (j10 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            p0 p0Var = new p0(j10 + nanoTime, y1Var);
            q(nanoTime, p0Var);
            return p0Var;
        }
        return p1.f60106a;
    }

    @Override
    public final Thread h() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setContextClassLoader(f60057s.getClass().getClassLoader());
                    thread.setDaemon(true);
                    thread.start();
                }
            }
            return thread;
        }
        return thread2;
    }

    @Override
    public final void l(long j3, q0 q0Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override
    public final void m(Runnable runnable) {
        if (debugStatus != 4) {
            super.m(runnable);
            return;
        }
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void r() {
        boolean z9;
        int i7 = debugStatus;
        if (i7 != 2 && i7 != 3) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (!z9) {
            return;
        }
        debugStatus = 3;
        s0.h.set(this, null);
        s0.f60111n.set(this, null);
        notifyAll();
    }

    @Override
    public final void run() {
        boolean z9;
        boolean z10;
        boolean p10;
        v1.f60123a.set(this);
        try {
            synchronized (this) {
                int i7 = debugStatus;
                if (i7 != 2 && i7 != 3) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (z9) {
                    if (!p10) {
                        return;
                    }
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j3 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long j10 = j();
                    if (j10 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j3 == Long.MAX_VALUE) {
                            j3 = f60058w + nanoTime;
                        }
                        long j11 = j3 - nanoTime;
                        if (j11 <= 0) {
                            _thread = null;
                            r();
                            if (!p()) {
                                h();
                                return;
                            }
                            return;
                        } else if (j10 > j11) {
                            j10 = j11;
                        }
                    } else {
                        j3 = Long.MAX_VALUE;
                    }
                    if (j10 > 0) {
                        int i10 = debugStatus;
                        if (i10 != 2 && i10 != 3) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (z10) {
                            _thread = null;
                            r();
                            if (!p()) {
                                h();
                                return;
                            }
                            return;
                        }
                        LockSupport.parkNanos(this, j10);
                    }
                }
            }
        } finally {
            _thread = null;
            r();
            if (!p()) {
                h();
            }
        }
    }

    @Override
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override
    public final String toString() {
        return "DefaultExecutor";
    }
}

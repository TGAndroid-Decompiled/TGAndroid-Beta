package wd;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
public final class c0 extends s0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final c0 f57476s;
    public static final long f57477w;

    static {
        Long l10;
        ?? s0Var = new s0();
        f57476s = s0Var;
        s0Var.i(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f57477w = timeUnit.toNanos(l10.longValue());
    }

    @Override
    public final l0 b(long j10, y1 y1Var, fd.h hVar) {
        long j11 = 0;
        if (j10 > 0) {
            if (j10 >= 9223372036854L) {
                j11 = Long.MAX_VALUE;
            } else {
                j11 = 1000000 * j10;
            }
        }
        if (j11 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            p0 p0Var = new p0(j11 + nanoTime, y1Var);
            q(nanoTime, p0Var);
            return p0Var;
        }
        return p1.f57525a;
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
                    thread.setContextClassLoader(f57476s.getClass().getClassLoader());
                    thread.setDaemon(true);
                    thread.start();
                }
            }
            return thread;
        }
        return thread2;
    }

    @Override
    public final void l(long j10, q0 q0Var) {
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
        boolean z10;
        int i3 = debugStatus;
        if (i3 != 2 && i3 != 3) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return;
        }
        debugStatus = 3;
        s0.h.set(this, null);
        s0.f57530n.set(this, null);
        notifyAll();
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        boolean p10;
        v1.f57542a.set(this);
        try {
            synchronized (this) {
                int i3 = debugStatus;
                if (i3 != 2 && i3 != 3) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    if (!p10) {
                        return;
                    }
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j10 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long j11 = j();
                    if (j11 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j10 == Long.MAX_VALUE) {
                            j10 = f57477w + nanoTime;
                        }
                        long j12 = j10 - nanoTime;
                        if (j12 <= 0) {
                            _thread = null;
                            r();
                            if (!p()) {
                                h();
                                return;
                            }
                            return;
                        } else if (j11 > j12) {
                            j11 = j12;
                        }
                    } else {
                        j10 = Long.MAX_VALUE;
                    }
                    if (j11 > 0) {
                        int i10 = debugStatus;
                        if (i10 != 2 && i10 != 3) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (z11) {
                            _thread = null;
                            r();
                            if (!p()) {
                                h();
                                return;
                            }
                            return;
                        }
                        LockSupport.parkNanos(this, j11);
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

package zd;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
public final class f0 extends v0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final f0 f48011s;
    public static final long v;

    static {
        Long l4;
        ?? v0Var = new v0();
        f48011s = v0Var;
        v0Var.h(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l4 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l4 = 1000L;
        }
        v = timeUnit.toNanos(l4.longValue());
    }

    @Override
    public final o0 a(long j3, e2 e2Var, id.h hVar) {
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
            s0 s0Var = new s0(j10 + nanoTime, e2Var);
            o(nanoTime, s0Var);
            return s0Var;
        }
        return w1.f48062a;
    }

    @Override
    public final Thread g() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setContextClassLoader(f0.class.getClassLoader());
                    thread.setDaemon(true);
                    thread.start();
                }
            }
            return thread;
        }
        return thread2;
    }

    @Override
    public final void k(long j3, t0 t0Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override
    public final void l(Runnable runnable) {
        if (debugStatus != 4) {
            super.l(runnable);
            return;
        }
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void p() {
        boolean z10;
        int i10 = debugStatus;
        if (i10 != 2 && i10 != 3) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return;
        }
        debugStatus = 3;
        v0.h.set(this, null);
        v0.f48058n.set(this, null);
        notifyAll();
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        boolean n10;
        c2.f47993a.set(this);
        try {
            synchronized (this) {
                int i10 = debugStatus;
                if (i10 != 2 && i10 != 3) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    if (!n10) {
                        return;
                    }
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j3 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long i11 = i();
                    if (i11 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j3 == Long.MAX_VALUE) {
                            j3 = v + nanoTime;
                        }
                        long j10 = j3 - nanoTime;
                        if (j10 <= 0) {
                            _thread = null;
                            p();
                            if (!n()) {
                                g();
                                return;
                            }
                            return;
                        } else if (i11 > j10) {
                            i11 = j10;
                        }
                    } else {
                        j3 = Long.MAX_VALUE;
                    }
                    if (i11 > 0) {
                        int i12 = debugStatus;
                        if (i12 != 2 && i12 != 3) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (z11) {
                            _thread = null;
                            p();
                            if (!n()) {
                                g();
                                return;
                            }
                            return;
                        }
                        LockSupport.parkNanos(this, i11);
                    }
                }
            }
        } finally {
            _thread = null;
            p();
            if (!n()) {
                g();
            }
        }
    }

    @Override
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}

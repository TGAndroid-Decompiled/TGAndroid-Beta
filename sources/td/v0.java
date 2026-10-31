package td;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
public abstract class v0 extends w0 implements j0 {
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(v0.class, Object.class, "_queue$volatile");
    public static final AtomicReferenceFieldUpdater f48672n = AtomicReferenceFieldUpdater.newUpdater(v0.class, Object.class, "_delayed$volatile");
    public static final AtomicIntegerFieldUpdater f48673r = AtomicIntegerFieldUpdater.newUpdater(v0.class, "_isCompleted$volatile");
    private volatile Object _delayed$volatile;
    private volatile int _isCompleted$volatile = 0;
    private volatile Object _queue$volatile;

    @Override
    public final void a(long j10, m mVar) {
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
            r0 r0Var = new r0(this, j11 + nanoTime, mVar);
            o(nanoTime, r0Var);
            mVar.v(new j(r0Var, 2));
        }
    }

    public o0 b(long j10, f2 f2Var, cd.h hVar) {
        return g0.f48629a.b(j10, f2Var, hVar);
    }

    @Override
    public final void c(cd.h hVar, Runnable runnable) {
        l(runnable);
    }

    @Override
    public final long i() {
        throw new UnsupportedOperationException("Method not decompiled: td.v0.i():long");
    }

    public void l(Runnable runnable) {
        if (m(runnable)) {
            Thread g10 = g();
            if (Thread.currentThread() != g10) {
                LockSupport.unpark(g10);
                return;
            }
            return;
        }
        f0.f48624s.l(runnable);
    }

    public final boolean m(java.lang.Runnable r7) {
        throw new UnsupportedOperationException("Method not decompiled: td.v0.m(java.lang.Runnable):boolean");
    }

    public final boolean n() {
        throw new UnsupportedOperationException("Method not decompiled: td.v0.n():boolean");
    }

    public final void o(long j10, t0 t0Var) {
        int c10;
        Thread g10;
        int i10 = f48673r.get(this);
        t0 t0Var2 = null;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f48672n;
        if (i10 != 0) {
            c10 = 1;
        } else {
            u0 u0Var = (u0) atomicReferenceFieldUpdater.get(this);
            if (u0Var == null) {
                ?? obj = new Object();
                obj.f48667c = j10;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, obj) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                kotlin.jvm.internal.i.b(obj2);
                u0Var = (u0) obj2;
            }
            c10 = t0Var.c(j10, u0Var, this);
        }
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
            k(j10, t0Var);
            return;
        }
        u0 u0Var2 = (u0) atomicReferenceFieldUpdater.get(this);
        if (u0Var2 != null) {
            t0Var2 = u0Var2.b();
        }
        if (t0Var2 == t0Var && Thread.currentThread() != (g10 = g())) {
            LockSupport.unpark(g10);
        }
    }

    @Override
    public void shutdown() {
        t0 t0Var;
        d2.f48609a.set(null);
        f48673r.set(this, 1);
        ea.a aVar = e0.f48614c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, aVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                break loop0;
            } else if (obj instanceof yd.n) {
                ((yd.n) obj).b();
                break;
            } else if (obj != aVar) {
                yd.n nVar = new yd.n(8, true);
                nVar.a((Runnable) obj);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                break loop0;
            } else {
                break;
            }
        }
        do {
        } while (i() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            u0 u0Var = (u0) f48672n.get(this);
            if (u0Var != null) {
                synchronized (u0Var) {
                    if (yd.x.f54424b.get(u0Var) > 0) {
                        t0Var = u0Var.d(0);
                    } else {
                        t0Var = null;
                    }
                }
                if (t0Var != null) {
                    k(nanoTime, t0Var);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}

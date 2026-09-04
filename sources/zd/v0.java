package zd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
public abstract class v0 extends w0 implements j0 {
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(v0.class, Object.class, "_queue$volatile");
    public static final AtomicReferenceFieldUpdater f51608n = AtomicReferenceFieldUpdater.newUpdater(v0.class, Object.class, "_delayed$volatile");
    public static final AtomicIntegerFieldUpdater f51609r = AtomicIntegerFieldUpdater.newUpdater(v0.class, "_isCompleted$volatile");
    private volatile Object _delayed$volatile;
    private volatile int _isCompleted$volatile = 0;
    private volatile Object _queue$volatile;

    public o0 a(long j3, e2 e2Var, id.h hVar) {
        return g0.f51555a.a(j3, e2Var, hVar);
    }

    @Override
    public final void b(long j3, m mVar) {
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
            r0 r0Var = new r0(this, j10 + nanoTime, mVar);
            o(nanoTime, r0Var);
            mVar.v(new j(r0Var, 2));
        }
    }

    @Override
    public final void c(id.h hVar, Runnable runnable) {
        l(runnable);
    }

    @Override
    public final long i() {
        throw new UnsupportedOperationException("Method not decompiled: zd.v0.i():long");
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
        f0.f51550s.l(runnable);
    }

    public final boolean m(java.lang.Runnable r7) {
        throw new UnsupportedOperationException("Method not decompiled: zd.v0.m(java.lang.Runnable):boolean");
    }

    public final boolean n() {
        throw new UnsupportedOperationException("Method not decompiled: zd.v0.n():boolean");
    }

    public final void o(long j3, t0 t0Var) {
        int c10;
        Thread g10;
        int i10 = f51609r.get(this);
        t0 t0Var2 = null;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f51608n;
        if (i10 != 0) {
            c10 = 1;
        } else {
            u0 u0Var = (u0) atomicReferenceFieldUpdater.get(this);
            if (u0Var == null) {
                ?? obj = new Object();
                obj.f51603c = j3;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, obj) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                kotlin.jvm.internal.i.b(obj2);
                u0Var = (u0) obj2;
            }
            c10 = t0Var.c(j3, u0Var, this);
        }
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
            k(j3, t0Var);
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
        c2.f51528a.set(null);
        f51609r.set(this, 1);
        d9.f fVar = e0.f51537c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, fVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                break loop0;
            } else if (obj instanceof ee.n) {
                ((ee.n) obj).b();
                break;
            } else if (obj != fVar) {
                ee.n nVar = new ee.n(8, true);
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
            u0 u0Var = (u0) f51608n.get(this);
            if (u0Var != null) {
                synchronized (u0Var) {
                    if (ee.x.f9098b.get(u0Var) > 0) {
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

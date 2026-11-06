package zd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
public abstract class s0 extends t0 implements g0 {
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(s0.class, Object.class, "_queue$volatile");
    public static final AtomicReferenceFieldUpdater f60012n = AtomicReferenceFieldUpdater.newUpdater(s0.class, Object.class, "_delayed$volatile");
    public static final AtomicIntegerFieldUpdater f60013r = AtomicIntegerFieldUpdater.newUpdater(s0.class, "_isCompleted$volatile");
    private volatile Object _delayed$volatile;
    private volatile int _isCompleted$volatile = 0;
    private volatile Object _queue$volatile;

    public l0 a(long j3, y1 y1Var, id.h hVar) {
        return d0.f59962a.a(j3, y1Var, hVar);
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
            o0 o0Var = new o0(this, j10 + nanoTime, mVar);
            q(nanoTime, o0Var);
            mVar.v(new j(o0Var, 2));
        }
    }

    @Override
    public final void c(id.h hVar, Runnable runnable) {
        m(runnable);
    }

    @Override
    public final long j() {
        q0 q0Var;
        Runnable runnable;
        long j3;
        com.google.android.gms.internal.clearcut.e eVar = b0.f59947c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        if (!k()) {
            n();
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                q0Var = null;
                if (obj == null) {
                    break;
                } else if (obj instanceof ee.m) {
                    ee.m mVar = (ee.m) obj;
                    Object d = mVar.d();
                    if (d != ee.m.f10788g) {
                        runnable = (Runnable) d;
                        break;
                    }
                    ee.m c10 = mVar.c();
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c10) && atomicReferenceFieldUpdater.get(this) == obj) {
                    }
                } else if (obj != eVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    runnable = (Runnable) obj;
                    break loop0;
                } else {
                    break;
                }
            }
            runnable = null;
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            hd.d dVar = this.f60016e;
            if (dVar == null || dVar.isEmpty()) {
                j3 = Long.MAX_VALUE;
            } else {
                j3 = 0;
            }
            if (j3 != 0) {
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof ee.m) {
                        long j10 = ee.m.f10787f.get((ee.m) obj2);
                        if (((int) (1073741823 & j10)) != ((int) ((j10 & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == eVar) {
                        return Long.MAX_VALUE;
                    }
                }
                r0 r0Var = (r0) f60012n.get(this);
                if (r0Var != null) {
                    synchronized (r0Var) {
                        q0[] q0VarArr = r0Var.f10798a;
                        if (q0VarArr != null) {
                            q0Var = q0VarArr[0];
                        }
                    }
                    if (q0Var != null) {
                        long nanoTime = q0Var.f60009a - System.nanoTime();
                        if (nanoTime >= 0) {
                            return nanoTime;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    public void m(Runnable runnable) {
        n();
        if (o(runnable)) {
            Thread h7 = h();
            if (Thread.currentThread() != h7) {
                LockSupport.unpark(h7);
                return;
            }
            return;
        }
        c0.f59958s.m(runnable);
    }

    public final void n() {
        q0 q0Var;
        q0 q0Var2;
        boolean z9;
        r0 r0Var = (r0) f60012n.get(this);
        if (r0Var == null || ee.u.f10797b.get(r0Var) == 0) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            synchronized (r0Var) {
                try {
                    q0[] q0VarArr = r0Var.f10798a;
                    q0Var = null;
                    if (q0VarArr != null) {
                        q0Var2 = q0VarArr[0];
                    } else {
                        q0Var2 = null;
                    }
                    if (q0Var2 == null) {
                        continue;
                    } else {
                        if (nanoTime - q0Var2.f60009a >= 0) {
                            z9 = o(q0Var2);
                        } else {
                            z9 = false;
                        }
                        if (z9) {
                            q0Var = r0Var.c(0);
                        }
                        continue;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (q0Var != null);
    }

    public final boolean o(java.lang.Runnable r7) {
        throw new UnsupportedOperationException("Method not decompiled: zd.s0.o(java.lang.Runnable):boolean");
    }

    public final boolean p() {
        throw new UnsupportedOperationException("Method not decompiled: zd.s0.p():boolean");
    }

    public final void q(long j3, q0 q0Var) {
        int c10;
        Thread h7;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f60012n;
        q0 q0Var2 = null;
        if (f60013r.get(this) != 0) {
            c10 = 1;
        } else {
            r0 r0Var = (r0) atomicReferenceFieldUpdater.get(this);
            if (r0Var == null) {
                ?? obj = new Object();
                obj.f60011c = j3;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, obj) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                kotlin.jvm.internal.j.b(obj2);
                r0Var = (r0) obj2;
            }
            c10 = q0Var.c(j3, r0Var, this);
        }
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
            l(j3, q0Var);
            return;
        }
        r0 r0Var2 = (r0) atomicReferenceFieldUpdater.get(this);
        if (r0Var2 != null) {
            synchronized (r0Var2) {
                q0[] q0VarArr = r0Var2.f10798a;
                if (q0VarArr != null) {
                    q0Var2 = q0VarArr[0];
                }
            }
        }
        if (q0Var2 == q0Var && Thread.currentThread() != (h7 = h())) {
            LockSupport.unpark(h7);
        }
    }

    @Override
    public void shutdown() {
        q0 q0Var;
        v1.f60024a.set(null);
        f60013r.set(this, 1);
        com.google.android.gms.internal.clearcut.e eVar = b0.f59947c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, eVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                break loop0;
            } else if (obj instanceof ee.m) {
                ((ee.m) obj).b();
                break;
            } else if (obj != eVar) {
                ee.m mVar = new ee.m(8, true);
                mVar.a((Runnable) obj);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
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
        } while (j() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            r0 r0Var = (r0) f60012n.get(this);
            if (r0Var != null) {
                synchronized (r0Var) {
                    if (ee.u.f10797b.get(r0Var) > 0) {
                        q0Var = r0Var.c(0);
                    } else {
                        q0Var = null;
                    }
                }
                if (q0Var != null) {
                    l(nanoTime, q0Var);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}

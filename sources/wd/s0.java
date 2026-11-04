package wd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
public abstract class s0 extends t0 implements g0 {
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(s0.class, Object.class, "_queue$volatile");
    public static final AtomicReferenceFieldUpdater f57530n = AtomicReferenceFieldUpdater.newUpdater(s0.class, Object.class, "_delayed$volatile");
    public static final AtomicIntegerFieldUpdater f57531r = AtomicIntegerFieldUpdater.newUpdater(s0.class, "_isCompleted$volatile");
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
            o0 o0Var = new o0(this, j11 + nanoTime, mVar);
            q(nanoTime, o0Var);
            mVar.v(new j(o0Var, 2));
        }
    }

    public l0 b(long j10, y1 y1Var, fd.h hVar) {
        return d0.f57480a.b(j10, y1Var, hVar);
    }

    @Override
    public final void c(fd.h hVar, Runnable runnable) {
        m(runnable);
    }

    @Override
    public final long j() {
        q0 q0Var;
        Runnable runnable;
        long j10;
        be.t tVar = b0.f57465c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        if (!k()) {
            n();
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                q0Var = null;
                if (obj == null) {
                    break;
                } else if (obj instanceof be.m) {
                    be.m mVar = (be.m) obj;
                    Object d = mVar.d();
                    if (d != be.m.f3276g) {
                        runnable = (Runnable) d;
                        break;
                    }
                    be.m c2 = mVar.c();
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2) && atomicReferenceFieldUpdater.get(this) == obj) {
                    }
                } else if (obj != tVar) {
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
            ed.e eVar = this.f57534e;
            if (eVar == null || eVar.isEmpty()) {
                j10 = Long.MAX_VALUE;
            } else {
                j10 = 0;
            }
            if (j10 != 0) {
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof be.m) {
                        long j11 = be.m.f3275f.get((be.m) obj2);
                        if (((int) (1073741823 & j11)) != ((int) ((j11 & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == tVar) {
                        return Long.MAX_VALUE;
                    }
                }
                r0 r0Var = (r0) f57530n.get(this);
                if (r0Var != null) {
                    synchronized (r0Var) {
                        q0[] q0VarArr = r0Var.f3288a;
                        if (q0VarArr != null) {
                            q0Var = q0VarArr[0];
                        }
                    }
                    if (q0Var != null) {
                        long nanoTime = q0Var.f57527a - System.nanoTime();
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
        c0.f57476s.m(runnable);
    }

    public final void n() {
        q0 q0Var;
        q0 q0Var2;
        boolean z10;
        r0 r0Var = (r0) f57530n.get(this);
        if (r0Var == null || be.v.f3287b.get(r0Var) == 0) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            synchronized (r0Var) {
                try {
                    q0[] q0VarArr = r0Var.f3288a;
                    q0Var = null;
                    if (q0VarArr != null) {
                        q0Var2 = q0VarArr[0];
                    } else {
                        q0Var2 = null;
                    }
                    if (q0Var2 == null) {
                        continue;
                    } else {
                        if (nanoTime - q0Var2.f57527a >= 0) {
                            z10 = o(q0Var2);
                        } else {
                            z10 = false;
                        }
                        if (z10) {
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
        throw new UnsupportedOperationException("Method not decompiled: wd.s0.o(java.lang.Runnable):boolean");
    }

    public final boolean p() {
        throw new UnsupportedOperationException("Method not decompiled: wd.s0.p():boolean");
    }

    public final void q(long j10, q0 q0Var) {
        int c2;
        Thread h7;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f57530n;
        q0 q0Var2 = null;
        if (f57531r.get(this) != 0) {
            c2 = 1;
        } else {
            r0 r0Var = (r0) atomicReferenceFieldUpdater.get(this);
            if (r0Var == null) {
                ?? obj = new Object();
                obj.f57529c = j10;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, obj) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                kotlin.jvm.internal.j.b(obj2);
                r0Var = (r0) obj2;
            }
            c2 = q0Var.c(j10, r0Var, this);
        }
        if (c2 != 0) {
            if (c2 != 1) {
                if (c2 != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
            l(j10, q0Var);
            return;
        }
        r0 r0Var2 = (r0) atomicReferenceFieldUpdater.get(this);
        if (r0Var2 != null) {
            synchronized (r0Var2) {
                q0[] q0VarArr = r0Var2.f3288a;
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
        v1.f57542a.set(null);
        f57531r.set(this, 1);
        be.t tVar = b0.f57465c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, tVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                break loop0;
            } else if (obj instanceof be.m) {
                ((be.m) obj).b();
                break;
            } else if (obj != tVar) {
                be.m mVar = new be.m(8, true);
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
            r0 r0Var = (r0) f57530n.get(this);
            if (r0Var != null) {
                synchronized (r0Var) {
                    if (be.v.f3287b.get(r0Var) > 0) {
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

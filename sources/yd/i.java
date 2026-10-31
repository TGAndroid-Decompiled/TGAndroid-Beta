package yd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import td.a0;
import td.f2;
import td.g0;
import td.j0;
import td.o0;
import td.z1;
public final class i extends a0 implements j0 {
    public static final AtomicIntegerFieldUpdater f54404n = AtomicIntegerFieldUpdater.newUpdater(i.class, "runningWorkers$volatile");
    public final a0 f54405c;
    public final int d;
    public final j0 e;
    public final l f54406f;
    public final Object h;
    private volatile int runningWorkers$volatile;

    public i(a0 a0Var, int i10) {
        j0 j0Var;
        this.f54405c = a0Var;
        this.d = i10;
        if (a0Var instanceof j0) {
            j0Var = (j0) a0Var;
        } else {
            j0Var = null;
        }
        this.e = j0Var == null ? g0.f48629a : j0Var;
        this.f54406f = new l();
        this.h = new Object();
    }

    @Override
    public final void a(long j10, td.m mVar) {
        this.e.a(j10, mVar);
    }

    @Override
    public final o0 b(long j10, f2 f2Var, cd.h hVar) {
        return this.e.b(j10, f2Var, hVar);
    }

    @Override
    public final void c(cd.h hVar, Runnable runnable) {
        this.f54406f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f54404n;
        if (atomicIntegerFieldUpdater.get(this) < this.d) {
            synchronized (this.h) {
                if (atomicIntegerFieldUpdater.get(this) >= this.d) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable f7 = f();
                if (f7 != null) {
                    this.f54405c.c(this, new z1(this, f7, false, 13));
                }
            }
        }
    }

    public final Runnable f() {
        while (true) {
            Runnable runnable = (Runnable) this.f54406f.d();
            if (runnable == null) {
                synchronized (this.h) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f54404n;
                    atomicIntegerFieldUpdater.decrementAndGet(this);
                    if (this.f54406f.c() == 0) {
                        return null;
                    }
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                }
            } else {
                return runnable;
            }
        }
    }
}

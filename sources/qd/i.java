package qd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import ld.a0;
import ld.e2;
import ld.g0;
import ld.j0;
import ld.o0;
import org.telegram.ui.zy;
public final class i extends a0 implements j0 {
    public static final AtomicIntegerFieldUpdater f44803n = AtomicIntegerFieldUpdater.newUpdater(i.class, "runningWorkers$volatile");
    public final a0 f44804c;
    public final int d;
    public final j0 f44805e;
    public final l f44806f;
    public final Object h;
    private volatile int runningWorkers$volatile;

    public i(a0 a0Var, int i10) {
        j0 j0Var;
        this.f44804c = a0Var;
        this.d = i10;
        if (a0Var instanceof j0) {
            j0Var = (j0) a0Var;
        } else {
            j0Var = null;
        }
        this.f44805e = j0Var == null ? g0.f12316a : j0Var;
        this.f44806f = new l();
        this.h = new Object();
    }

    @Override
    public final o0 a(long j10, e2 e2Var, uc.h hVar) {
        return this.f44805e.a(j10, e2Var, hVar);
    }

    @Override
    public final void b(long j10, ld.m mVar) {
        this.f44805e.b(j10, mVar);
    }

    @Override
    public final void c(uc.h hVar, Runnable runnable) {
        this.f44806f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f44803n;
        if (atomicIntegerFieldUpdater.get(this) < this.d) {
            synchronized (this.h) {
                if (atomicIntegerFieldUpdater.get(this) >= this.d) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable f10 = f();
                if (f10 != null) {
                    this.f44804c.c(this, new zy(7, this, f10));
                }
            }
        }
    }

    public final Runnable f() {
        while (true) {
            Runnable runnable = (Runnable) this.f44806f.d();
            if (runnable == null) {
                synchronized (this.h) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f44803n;
                    atomicIntegerFieldUpdater.decrementAndGet(this);
                    if (this.f44806f.c() == 0) {
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

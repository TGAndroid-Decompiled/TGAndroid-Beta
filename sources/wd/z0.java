package wd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public final class z0 extends e1 {
    public static final AtomicIntegerFieldUpdater f57554f = AtomicIntegerFieldUpdater.newUpdater(z0.class, "_invoked$volatile");
    private volatile int _invoked$volatile = 0;
    public final od.l f57555e;

    public z0(od.l lVar) {
        this.f57555e = lVar;
    }

    @Override
    public final boolean i() {
        return true;
    }

    @Override
    public final void j(Throwable th2) {
        if (f57554f.compareAndSet(this, 0, 1)) {
            this.f57555e.invoke(th2);
        }
    }
}

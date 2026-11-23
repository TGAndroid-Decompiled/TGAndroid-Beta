package zd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public final class z0 extends e1 {
    public static final AtomicIntegerFieldUpdater f61953f = AtomicIntegerFieldUpdater.newUpdater(z0.class, "_invoked$volatile");
    private volatile int _invoked$volatile = 0;
    public final rd.l f61954e;

    public z0(rd.l lVar) {
        this.f61954e = lVar;
    }

    @Override
    public final boolean i() {
        return true;
    }

    @Override
    public final void j(Throwable th2) {
        if (f61953f.compareAndSet(this, 0, 1)) {
            this.f61954e.invoke(th2);
        }
    }
}

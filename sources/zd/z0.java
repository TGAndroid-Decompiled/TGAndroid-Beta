package zd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public final class z0 extends e1 {
    public static final AtomicIntegerFieldUpdater f60142f = AtomicIntegerFieldUpdater.newUpdater(z0.class, "_invoked$volatile");
    private volatile int _invoked$volatile = 0;
    public final rd.l f60143e;

    public z0(rd.l lVar) {
        this.f60143e = lVar;
    }

    @Override
    public final boolean i() {
        return true;
    }

    @Override
    public final void j(Throwable th2) {
        if (f60142f.compareAndSet(this, 0, 1)) {
            this.f60143e.invoke(th2);
        }
    }
}

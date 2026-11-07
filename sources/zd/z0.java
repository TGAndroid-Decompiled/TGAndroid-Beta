package zd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public final class z0 extends e1 {
    public static final AtomicIntegerFieldUpdater f60041f = AtomicIntegerFieldUpdater.newUpdater(z0.class, "_invoked$volatile");
    private volatile int _invoked$volatile = 0;
    public final rd.l f60042e;

    public z0(rd.l lVar) {
        this.f60042e = lVar;
    }

    @Override
    public final boolean i() {
        return true;
    }

    @Override
    public final void j(Throwable th2) {
        if (f60041f.compareAndSet(this, 0, 1)) {
            this.f60042e.invoke(th2);
        }
    }
}

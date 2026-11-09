package zd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public final class z0 extends e1 {
    public static final AtomicIntegerFieldUpdater f60144f = AtomicIntegerFieldUpdater.newUpdater(z0.class, "_invoked$volatile");
    private volatile int _invoked$volatile = 0;
    public final rd.l f60145e;

    public z0(rd.l lVar) {
        this.f60145e = lVar;
    }

    @Override
    public final boolean i() {
        return true;
    }

    @Override
    public final void j(Throwable th2) {
        if (f60144f.compareAndSet(this, 0, 1)) {
            this.f60145e.invoke(th2);
        }
    }
}

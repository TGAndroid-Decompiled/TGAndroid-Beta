package zd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public final class h0 extends ee.q {
    public static final AtomicIntegerFieldUpdater f60075e = AtomicIntegerFieldUpdater.newUpdater(h0.class, "_decision$volatile");
    private volatile int _decision$volatile;

    @Override
    public final void g(Object obj) {
        h(obj);
    }

    @Override
    public final void h(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f60075e;
            int i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 != 0) {
                if (i7 == 1) {
                    ee.a.h(c8.u0.b(this.d), b0.s(obj));
                    return;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}

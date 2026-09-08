package zd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import v7.t8;
public final class k0 extends ee.s {
    public static final AtomicIntegerFieldUpdater f51595e = AtomicIntegerFieldUpdater.newUpdater(k0.class, "_decision$volatile");
    private volatile int _decision$volatile;

    @Override
    public final void f(Object obj) {
        g(obj);
    }

    @Override
    public final void g(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f51595e;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1) {
                    ee.a.g(e0.r(obj), t8.b(this.d));
                    return;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}

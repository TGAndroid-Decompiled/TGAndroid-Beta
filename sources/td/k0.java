package td;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import v7.w6;
public final class k0 extends yd.s {
    public static final AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(k0.class, "_decision$volatile");
    private volatile int _decision$volatile;

    @Override
    public final void b(Object obj) {
        g(obj);
    }

    @Override
    public final void g(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = e;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1) {
                    yd.a.g(e0.r(obj), w6.b(this.d));
                    return;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}

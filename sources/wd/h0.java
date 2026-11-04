package wd;

import b8.jc;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public final class h0 extends be.q {
    public static final AtomicIntegerFieldUpdater f57495e = AtomicIntegerFieldUpdater.newUpdater(h0.class, "_decision$volatile");
    private volatile int _decision$volatile;

    @Override
    public final void g(Object obj) {
        h(obj);
    }

    @Override
    public final void h(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f57495e;
            int i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 != 0) {
                if (i3 == 1) {
                    be.a.h(jc.b(this.d), b0.s(obj));
                    return;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}

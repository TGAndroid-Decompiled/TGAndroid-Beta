package wd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public final class w1 extends e1 {
    public static final AtomicIntegerFieldUpdater h = AtomicIntegerFieldUpdater.newUpdater(w1.class, "_state$volatile");
    private volatile int _state$volatile;
    public final Thread f57546e = Thread.currentThread();
    public l0 f57547f;

    public static void l(int i3) {
        throw new IllegalStateException(("Illegal state " + i3).toString());
    }

    @Override
    public final boolean i() {
        return true;
    }

    @Override
    public final void j(Throwable th2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = h;
            i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 != 0) {
                if (i3 != 1 && i3 != 2 && i3 != 3) {
                    l(i3);
                    throw null;
                }
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 2));
        this.f57546e.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    public final void k() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h;
            int i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 != 0) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        l(i3);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i3, 1)) {
                l0 l0Var = this.f57547f;
                if (l0Var != null) {
                    l0Var.dispose();
                    return;
                }
                return;
            }
        }
    }
}

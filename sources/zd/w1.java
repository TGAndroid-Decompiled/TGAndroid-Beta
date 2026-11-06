package zd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public final class w1 extends e1 {
    public static final AtomicIntegerFieldUpdater h = AtomicIntegerFieldUpdater.newUpdater(w1.class, "_state$volatile");
    private volatile int _state$volatile;
    public final Thread f60028e = Thread.currentThread();
    public l0 f60029f;

    public static void l(int i7) {
        throw new IllegalStateException(("Illegal state " + i7).toString());
    }

    @Override
    public final boolean i() {
        return true;
    }

    @Override
    public final void j(Throwable th2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i7;
        do {
            atomicIntegerFieldUpdater = h;
            i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 != 0) {
                if (i7 != 1 && i7 != 2 && i7 != 3) {
                    l(i7);
                    throw null;
                }
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, 2));
        this.f60028e.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    public final void k() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h;
            int i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 != 0) {
                if (i7 != 2) {
                    if (i7 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        l(i7);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i7, 1)) {
                l0 l0Var = this.f60029f;
                if (l0Var != null) {
                    l0Var.dispose();
                    return;
                }
                return;
            }
        }
    }
}

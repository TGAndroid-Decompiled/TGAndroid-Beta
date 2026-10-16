package ug;

import java.util.concurrent.atomic.AtomicBoolean;
public final class e implements Runnable {
    public final int f46301a;
    public final AtomicBoolean f46302b;

    public e(AtomicBoolean atomicBoolean, int i10) {
        this.f46301a = i10;
        this.f46302b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f46301a) {
            case 0:
                this.f46302b.set(true);
                return;
            default:
                this.f46302b.set(true);
                return;
        }
    }
}

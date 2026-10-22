package ug;

import java.util.concurrent.atomic.AtomicBoolean;
public final class d implements Runnable {
    public final int f47670a;
    public final AtomicBoolean f47671b;

    public d(AtomicBoolean atomicBoolean, int i10) {
        this.f47670a = i10;
        this.f47671b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f47670a) {
            case 0:
                this.f47671b.set(true);
                return;
            default:
                this.f47671b.set(true);
                return;
        }
    }
}

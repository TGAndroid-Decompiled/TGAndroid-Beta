package ug;

import java.util.concurrent.atomic.AtomicBoolean;
public final class e implements Runnable {
    public final int f47136a;
    public final AtomicBoolean f47137b;

    public e(AtomicBoolean atomicBoolean, int i10) {
        this.f47136a = i10;
        this.f47137b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f47136a) {
            case 0:
                this.f47137b.set(true);
                return;
            default:
                this.f47137b.set(true);
                return;
        }
    }
}

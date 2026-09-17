package ug;

import java.util.concurrent.atomic.AtomicBoolean;
public final class e implements Runnable {
    public final int f47108a;
    public final AtomicBoolean f47109b;

    public e(AtomicBoolean atomicBoolean, int i10) {
        this.f47108a = i10;
        this.f47109b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f47108a) {
            case 0:
                this.f47109b.set(true);
                return;
            default:
                this.f47109b.set(true);
                return;
        }
    }
}

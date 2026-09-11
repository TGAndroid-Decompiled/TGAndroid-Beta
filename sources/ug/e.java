package ug;

import java.util.concurrent.atomic.AtomicBoolean;
public final class e implements Runnable {
    public final int f47107a;
    public final AtomicBoolean f47108b;

    public e(AtomicBoolean atomicBoolean, int i10) {
        this.f47107a = i10;
        this.f47108b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f47107a) {
            case 0:
                this.f47108b.set(true);
                return;
            default:
                this.f47108b.set(true);
                return;
        }
    }
}

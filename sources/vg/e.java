package vg;

import java.util.concurrent.atomic.AtomicBoolean;
public final class e implements Runnable {
    public final int f50199a;
    public final AtomicBoolean f50200b;

    public e(AtomicBoolean atomicBoolean, int i10) {
        this.f50199a = i10;
        this.f50200b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f50199a) {
            case 0:
                this.f50200b.set(true);
                return;
            default:
                this.f50200b.set(true);
                return;
        }
    }
}

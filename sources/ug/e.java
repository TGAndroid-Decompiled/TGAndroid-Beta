package ug;

import java.util.concurrent.atomic.AtomicBoolean;
public final class e implements Runnable {
    public final int f46302a;
    public final AtomicBoolean f46303b;

    public e(AtomicBoolean atomicBoolean, int i10) {
        this.f46302a = i10;
        this.f46303b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f46302a) {
            case 0:
                this.f46303b.set(true);
                return;
            default:
                this.f46303b.set(true);
                return;
        }
    }
}

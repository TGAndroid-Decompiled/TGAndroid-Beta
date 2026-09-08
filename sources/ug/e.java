package ug;

import java.util.concurrent.atomic.AtomicBoolean;
public final class e implements Runnable {
    public final int f47135a;
    public final AtomicBoolean f47136b;

    public e(AtomicBoolean atomicBoolean, int i10) {
        this.f47135a = i10;
        this.f47136b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f47135a) {
            case 0:
                this.f47136b.set(true);
                return;
            default:
                this.f47136b.set(true);
                return;
        }
    }
}

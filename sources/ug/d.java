package ug;

import java.util.concurrent.atomic.AtomicBoolean;
public final class d implements Runnable {
    public final int f47671a;
    public final AtomicBoolean f47672b;

    public d(AtomicBoolean atomicBoolean, int i10) {
        this.f47671a = i10;
        this.f47672b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f47671a) {
            case 0:
                this.f47672b.set(true);
                return;
            default:
                this.f47672b.set(true);
                return;
        }
    }
}

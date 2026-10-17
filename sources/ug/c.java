package ug;

import java.util.concurrent.atomic.AtomicBoolean;
public final class c implements Runnable {
    public final int f47679a;
    public final AtomicBoolean f47680b;

    public c(AtomicBoolean atomicBoolean, int i10) {
        this.f47679a = i10;
        this.f47680b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f47679a) {
            case 0:
                this.f47680b.set(true);
                return;
            default:
                this.f47680b.set(true);
                return;
        }
    }
}

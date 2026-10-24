package ug;

import java.util.concurrent.atomic.AtomicBoolean;
public final class c implements Runnable {
    public final int f48103a;
    public final AtomicBoolean f48104b;

    public c(AtomicBoolean atomicBoolean, int i10) {
        this.f48103a = i10;
        this.f48104b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f48103a) {
            case 0:
                this.f48104b.set(true);
                return;
            default:
                this.f48104b.set(true);
                return;
        }
    }
}

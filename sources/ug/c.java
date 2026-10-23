package ug;

import java.util.concurrent.atomic.AtomicBoolean;
public final class c implements Runnable {
    public final int f48104a;
    public final AtomicBoolean f48105b;

    public c(AtomicBoolean atomicBoolean, int i10) {
        this.f48104a = i10;
        this.f48105b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f48104a) {
            case 0:
                this.f48105b.set(true);
                return;
            default:
                this.f48105b.set(true);
                return;
        }
    }
}

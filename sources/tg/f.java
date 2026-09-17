package tg;

import java.util.concurrent.atomic.AtomicBoolean;
public final class f implements Runnable {
    public final int f43158a;
    public final AtomicBoolean f43159b;

    public f(AtomicBoolean atomicBoolean, int i10) {
        this.f43158a = i10;
        this.f43159b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f43158a) {
            case 0:
                this.f43159b.set(true);
                return;
            default:
                this.f43159b.set(true);
                return;
        }
    }
}

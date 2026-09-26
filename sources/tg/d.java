package tg;

import java.util.concurrent.atomic.AtomicBoolean;
public final class d implements Runnable {
    public final int f43389a;
    public final AtomicBoolean f43390b;

    public d(AtomicBoolean atomicBoolean, int i10) {
        this.f43389a = i10;
        this.f43390b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f43389a) {
            case 0:
                this.f43390b.set(true);
                return;
            default:
                this.f43390b.set(true);
                return;
        }
    }
}

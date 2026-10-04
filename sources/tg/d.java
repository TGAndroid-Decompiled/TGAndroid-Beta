package tg;

import java.util.concurrent.atomic.AtomicBoolean;
public final class d implements Runnable {
    public final int f46990a;
    public final AtomicBoolean f46991b;

    public d(AtomicBoolean atomicBoolean, int i10) {
        this.f46990a = i10;
        this.f46991b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f46990a) {
            case 0:
                this.f46991b.set(true);
                return;
            default:
                this.f46991b.set(true);
                return;
        }
    }
}

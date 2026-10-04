package tg;

import java.util.concurrent.atomic.AtomicBoolean;
public final class d implements Runnable {
    public final int f46989a;
    public final AtomicBoolean f46990b;

    public d(AtomicBoolean atomicBoolean, int i10) {
        this.f46989a = i10;
        this.f46990b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f46989a) {
            case 0:
                this.f46990b.set(true);
                return;
            default:
                this.f46990b.set(true);
                return;
        }
    }
}

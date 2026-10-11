package tg;

import java.util.concurrent.atomic.AtomicBoolean;
public final class d implements Runnable {
    public final int f48376a;
    public final AtomicBoolean f48377b;

    public d(AtomicBoolean atomicBoolean, int i10) {
        this.f48376a = i10;
        this.f48377b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f48376a) {
            case 0:
                this.f48377b.set(true);
                return;
            default:
                this.f48377b.set(true);
                return;
        }
    }
}

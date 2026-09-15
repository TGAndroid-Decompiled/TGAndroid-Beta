package tg;

import java.util.concurrent.atomic.AtomicBoolean;
public final class f implements Runnable {
    public final int f43136a;
    public final AtomicBoolean f43137b;

    public f(AtomicBoolean atomicBoolean, int i10) {
        this.f43136a = i10;
        this.f43137b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f43136a) {
            case 0:
                this.f43137b.set(true);
                return;
            default:
                this.f43137b.set(true);
                return;
        }
    }
}

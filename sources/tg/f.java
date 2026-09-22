package tg;

import java.util.concurrent.atomic.AtomicBoolean;
public final class f implements Runnable {
    public final int f43132a;
    public final AtomicBoolean f43133b;

    public f(AtomicBoolean atomicBoolean, int i10) {
        this.f43132a = i10;
        this.f43133b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f43132a) {
            case 0:
                this.f43133b.set(true);
                return;
            default:
                this.f43133b.set(true);
                return;
        }
    }
}

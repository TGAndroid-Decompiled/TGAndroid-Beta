package tg;

import java.util.concurrent.atomic.AtomicBoolean;
public final class f implements Runnable {
    public final int f43163a;
    public final AtomicBoolean f43164b;

    public f(AtomicBoolean atomicBoolean, int i10) {
        this.f43163a = i10;
        this.f43164b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f43163a) {
            case 0:
                this.f43164b.set(true);
                return;
            default:
                this.f43164b.set(true);
                return;
        }
    }
}

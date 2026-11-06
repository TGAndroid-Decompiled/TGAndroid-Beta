package wg;

import java.util.concurrent.atomic.AtomicBoolean;
public final class c implements Runnable {
    public final int f57612a;
    public final AtomicBoolean f57613b;

    public c(AtomicBoolean atomicBoolean, int i7) {
        this.f57612a = i7;
        this.f57613b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f57612a) {
            case 0:
                this.f57613b.set(true);
                return;
            default:
                this.f57613b.set(true);
                return;
        }
    }
}

package wg;

import java.util.concurrent.atomic.AtomicBoolean;
public final class c implements Runnable {
    public final int f57613a;
    public final AtomicBoolean f57614b;

    public c(AtomicBoolean atomicBoolean, int i7) {
        this.f57613a = i7;
        this.f57614b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f57613a) {
            case 0:
                this.f57614b.set(true);
                return;
            default:
                this.f57614b.set(true);
                return;
        }
    }
}

package wg;

import java.util.concurrent.atomic.AtomicBoolean;
public final class c implements Runnable {
    public final int f57588a;
    public final AtomicBoolean f57589b;

    public c(AtomicBoolean atomicBoolean, int i7) {
        this.f57588a = i7;
        this.f57589b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f57588a) {
            case 0:
                this.f57589b.set(true);
                return;
            default:
                this.f57589b.set(true);
                return;
        }
    }
}

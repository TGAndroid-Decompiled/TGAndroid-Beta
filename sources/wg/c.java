package wg;

import java.util.concurrent.atomic.AtomicBoolean;
public final class c implements Runnable {
    public final int f59140a;
    public final AtomicBoolean f59141b;

    public c(AtomicBoolean atomicBoolean, int i7) {
        this.f59140a = i7;
        this.f59141b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f59140a) {
            case 0:
                this.f59141b.set(true);
                return;
            default:
                this.f59141b.set(true);
                return;
        }
    }
}

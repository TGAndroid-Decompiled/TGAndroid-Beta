package wg;

import java.util.concurrent.atomic.AtomicBoolean;
public final class c implements Runnable {
    public final int f59765a;
    public final AtomicBoolean f59766b;

    public c(AtomicBoolean atomicBoolean, int i7) {
        this.f59765a = i7;
        this.f59766b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f59765a) {
            case 0:
                this.f59766b.set(true);
                return;
            default:
                this.f59766b.set(true);
                return;
        }
    }
}

package wg;

import java.util.concurrent.atomic.AtomicBoolean;
public final class c implements Runnable {
    public final int f59769a;
    public final AtomicBoolean f59770b;

    public c(AtomicBoolean atomicBoolean, int i7) {
        this.f59769a = i7;
        this.f59770b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f59769a) {
            case 0:
                this.f59770b.set(true);
                return;
            default:
                this.f59770b.set(true);
                return;
        }
    }
}

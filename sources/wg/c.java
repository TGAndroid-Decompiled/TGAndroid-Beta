package wg;

import java.util.concurrent.atomic.AtomicBoolean;
public final class c implements Runnable {
    public final int f59834a;
    public final AtomicBoolean f59835b;

    public c(AtomicBoolean atomicBoolean, int i7) {
        this.f59834a = i7;
        this.f59835b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f59834a) {
            case 0:
                this.f59835b.set(true);
                return;
            default:
                this.f59835b.set(true);
                return;
        }
    }
}

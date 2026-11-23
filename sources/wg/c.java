package wg;

import java.util.concurrent.atomic.AtomicBoolean;
public final class c implements Runnable {
    public final int f59734a;
    public final AtomicBoolean f59735b;

    public c(AtomicBoolean atomicBoolean, int i7) {
        this.f59734a = i7;
        this.f59735b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f59734a) {
            case 0:
                this.f59735b.set(true);
                return;
            default:
                this.f59735b.set(true);
                return;
        }
    }
}

package wg;

import java.util.concurrent.atomic.AtomicBoolean;
public final class c implements Runnable {
    public final int f57705a;
    public final AtomicBoolean f57706b;

    public c(AtomicBoolean atomicBoolean, int i7) {
        this.f57705a = i7;
        this.f57706b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f57705a) {
            case 0:
                this.f57706b.set(true);
                return;
            default:
                this.f57706b.set(true);
                return;
        }
    }
}

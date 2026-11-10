package wg;

import java.util.concurrent.atomic.AtomicBoolean;
public final class c implements Runnable {
    public final int f57702a;
    public final AtomicBoolean f57703b;

    public c(AtomicBoolean atomicBoolean, int i7) {
        this.f57702a = i7;
        this.f57703b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f57702a) {
            case 0:
                this.f57703b.set(true);
                return;
            default:
                this.f57703b.set(true);
                return;
        }
    }
}

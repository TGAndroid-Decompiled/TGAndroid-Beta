package wg;

import java.util.concurrent.atomic.AtomicBoolean;
public final class c implements Runnable {
    public final int f57703a;
    public final AtomicBoolean f57704b;

    public c(AtomicBoolean atomicBoolean, int i7) {
        this.f57703a = i7;
        this.f57704b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f57703a) {
            case 0:
                this.f57704b.set(true);
                return;
            default:
                this.f57704b.set(true);
                return;
        }
    }
}

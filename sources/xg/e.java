package xg;

import java.util.concurrent.atomic.AtomicBoolean;
public final class e implements Runnable {
    public final int f58669a;
    public final AtomicBoolean f58670b;

    public e(AtomicBoolean atomicBoolean, int i3) {
        this.f58669a = i3;
        this.f58670b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f58669a) {
            case 0:
                this.f58670b.set(true);
                return;
            default:
                this.f58670b.set(true);
                return;
        }
    }
}

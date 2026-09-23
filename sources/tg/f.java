package tg;

import java.util.concurrent.atomic.AtomicBoolean;
public final class f implements Runnable {
    public final int f43087a;
    public final AtomicBoolean f43088b;

    public f(AtomicBoolean atomicBoolean, int i10) {
        this.f43087a = i10;
        this.f43088b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f43087a) {
            case 0:
                this.f43088b.set(true);
                return;
            default:
                this.f43088b.set(true);
                return;
        }
    }
}

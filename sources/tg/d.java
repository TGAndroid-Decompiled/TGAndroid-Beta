package tg;

import java.util.concurrent.atomic.AtomicBoolean;
public final class d implements Runnable {
    public final int f48305a;
    public final AtomicBoolean f48306b;

    public d(AtomicBoolean atomicBoolean, int i10) {
        this.f48305a = i10;
        this.f48306b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f48305a) {
            case 0:
                this.f48306b.set(true);
                return;
            default:
                this.f48306b.set(true);
                return;
        }
    }
}

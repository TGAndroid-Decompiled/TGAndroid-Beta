package tg;

import java.util.concurrent.atomic.AtomicBoolean;
public final class d implements Runnable {
    public final int f48517a;
    public final AtomicBoolean f48518b;

    public d(AtomicBoolean atomicBoolean, int i10) {
        this.f48517a = i10;
        this.f48518b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f48517a) {
            case 0:
                this.f48518b.set(true);
                return;
            default:
                this.f48518b.set(true);
                return;
        }
    }
}

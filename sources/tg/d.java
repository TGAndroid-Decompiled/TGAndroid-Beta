package tg;

import java.util.concurrent.atomic.AtomicBoolean;
public final class d implements Runnable {
    public final int f48410a;
    public final AtomicBoolean f48411b;

    public d(AtomicBoolean atomicBoolean, int i10) {
        this.f48410a = i10;
        this.f48411b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f48410a) {
            case 0:
                this.f48411b.set(true);
                return;
            default:
                this.f48411b.set(true);
                return;
        }
    }
}

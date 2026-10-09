package tg;

import java.util.concurrent.atomic.AtomicBoolean;
public final class d implements Runnable {
    public final int f48303a;
    public final AtomicBoolean f48304b;

    public d(AtomicBoolean atomicBoolean, int i10) {
        this.f48303a = i10;
        this.f48304b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f48303a) {
            case 0:
                this.f48304b.set(true);
                return;
            default:
                this.f48304b.set(true);
                return;
        }
    }
}

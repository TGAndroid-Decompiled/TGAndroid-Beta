package tg;

import java.util.concurrent.atomic.AtomicBoolean;
public final class d implements Runnable {
    public final int f48544a;
    public final AtomicBoolean f48545b;

    public d(AtomicBoolean atomicBoolean, int i10) {
        this.f48544a = i10;
        this.f48545b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f48544a) {
            case 0:
                this.f48545b.set(true);
                return;
            default:
                this.f48545b.set(true);
                return;
        }
    }
}

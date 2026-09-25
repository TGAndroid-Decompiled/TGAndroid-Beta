package tg;

import java.util.concurrent.atomic.AtomicBoolean;
public final class d implements Runnable {
    public final int f43390a;
    public final AtomicBoolean f43391b;

    public d(AtomicBoolean atomicBoolean, int i10) {
        this.f43390a = i10;
        this.f43391b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f43390a) {
            case 0:
                this.f43391b.set(true);
                return;
            default:
                this.f43391b.set(true);
                return;
        }
    }
}

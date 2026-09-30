package tg;

import java.util.concurrent.atomic.AtomicBoolean;
public final class d implements Runnable {
    public final int f43391a;
    public final AtomicBoolean f43392b;

    public d(AtomicBoolean atomicBoolean, int i10) {
        this.f43391a = i10;
        this.f43392b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f43391a) {
            case 0:
                this.f43392b.set(true);
                return;
            default:
                this.f43392b.set(true);
                return;
        }
    }
}

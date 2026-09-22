package tg;

import java.util.concurrent.atomic.AtomicBoolean;
public final class d implements Runnable {
    public final int f43424a;
    public final AtomicBoolean f43425b;

    public d(AtomicBoolean atomicBoolean, int i10) {
        this.f43424a = i10;
        this.f43425b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f43424a) {
            case 0:
                this.f43425b.set(true);
                return;
            default:
                this.f43425b.set(true);
                return;
        }
    }
}

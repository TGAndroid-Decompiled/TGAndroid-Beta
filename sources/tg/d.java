package tg;

import java.util.concurrent.atomic.AtomicBoolean;
public final class d implements Runnable {
    public final int f43375a;
    public final AtomicBoolean f43376b;

    public d(AtomicBoolean atomicBoolean, int i10) {
        this.f43375a = i10;
        this.f43376b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f43375a) {
            case 0:
                this.f43376b.set(true);
                return;
            default:
                this.f43376b.set(true);
                return;
        }
    }
}

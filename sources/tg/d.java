package tg;

import java.util.concurrent.atomic.AtomicBoolean;
public final class d implements Runnable {
    public final int f43388a;
    public final AtomicBoolean f43389b;

    public d(AtomicBoolean atomicBoolean, int i10) {
        this.f43388a = i10;
        this.f43389b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f43388a) {
            case 0:
                this.f43389b.set(true);
                return;
            default:
                this.f43389b.set(true);
                return;
        }
    }
}

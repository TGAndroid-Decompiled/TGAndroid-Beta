package tg;

import java.util.concurrent.atomic.AtomicBoolean;
public final class d implements Runnable {
    public final int f46997a;
    public final AtomicBoolean f46998b;

    public d(AtomicBoolean atomicBoolean, int i10) {
        this.f46997a = i10;
        this.f46998b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f46997a) {
            case 0:
                this.f46998b.set(true);
                return;
            default:
                this.f46998b.set(true);
                return;
        }
    }
}

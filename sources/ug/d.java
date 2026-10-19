package ug;

import java.util.concurrent.atomic.AtomicBoolean;
public final class d implements Runnable {
    public final int f47662a;
    public final AtomicBoolean f47663b;

    public d(AtomicBoolean atomicBoolean, int i10) {
        this.f47662a = i10;
        this.f47663b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f47662a) {
            case 0:
                this.f47663b.set(true);
                return;
            default:
                this.f47663b.set(true);
                return;
        }
    }
}

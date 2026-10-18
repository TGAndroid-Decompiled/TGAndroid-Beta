package ug;

import java.util.concurrent.atomic.AtomicBoolean;
public final class d implements Runnable {
    public final int f47660a;
    public final AtomicBoolean f47661b;

    public d(AtomicBoolean atomicBoolean, int i10) {
        this.f47660a = i10;
        this.f47661b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f47660a) {
            case 0:
                this.f47661b.set(true);
                return;
            default:
                this.f47661b.set(true);
                return;
        }
    }
}

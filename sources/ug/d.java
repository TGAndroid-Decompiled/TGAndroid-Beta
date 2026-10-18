package ug;

import java.util.concurrent.atomic.AtomicBoolean;
public final class d implements Runnable {
    public final int f47707a;
    public final AtomicBoolean f47708b;

    public d(AtomicBoolean atomicBoolean, int i10) {
        this.f47707a = i10;
        this.f47708b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f47707a) {
            case 0:
                this.f47708b.set(true);
                return;
            default:
                this.f47708b.set(true);
                return;
        }
    }
}

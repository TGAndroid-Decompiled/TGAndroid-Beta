package tg;

import java.util.concurrent.atomic.AtomicBoolean;
public final class d implements Runnable {
    public final int f43359a;
    public final AtomicBoolean f43360b;

    public d(AtomicBoolean atomicBoolean, int i10) {
        this.f43359a = i10;
        this.f43360b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f43359a) {
            case 0:
                this.f43360b.set(true);
                return;
            default:
                this.f43360b.set(true);
                return;
        }
    }
}

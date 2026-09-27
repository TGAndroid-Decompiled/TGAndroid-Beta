package tg;

import java.util.concurrent.atomic.AtomicBoolean;
public final class d implements Runnable {
    public final int f43434a;
    public final AtomicBoolean f43435b;

    public d(AtomicBoolean atomicBoolean, int i10) {
        this.f43434a = i10;
        this.f43435b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f43434a) {
            case 0:
                this.f43435b.set(true);
                return;
            default:
                this.f43435b.set(true);
                return;
        }
    }
}

package sg;

import java.util.concurrent.atomic.AtomicBoolean;
public final class d implements Runnable {
    public final int f41900a;
    public final AtomicBoolean f41901b;

    public d(AtomicBoolean atomicBoolean, int i10) {
        this.f41900a = i10;
        this.f41901b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f41900a) {
            case 0:
                this.f41901b.set(true);
                return;
            default:
                this.f41901b.set(true);
                return;
        }
    }
}

package vg;

import java.util.concurrent.atomic.AtomicBoolean;
public final class e implements Runnable {
    public final int f50161a;
    public final AtomicBoolean f50162b;

    public e(AtomicBoolean atomicBoolean, int i10) {
        this.f50161a = i10;
        this.f50162b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f50161a) {
            case 0:
                this.f50162b.set(true);
                return;
            default:
                this.f50162b.set(true);
                return;
        }
    }
}

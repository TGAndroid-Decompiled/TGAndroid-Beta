package vg;

import java.util.concurrent.atomic.AtomicBoolean;
public final class e implements Runnable {
    public final int f50164a;
    public final AtomicBoolean f50165b;

    public e(AtomicBoolean atomicBoolean, int i10) {
        this.f50164a = i10;
        this.f50165b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f50164a) {
            case 0:
                this.f50165b.set(true);
                return;
            default:
                this.f50165b.set(true);
                return;
        }
    }
}

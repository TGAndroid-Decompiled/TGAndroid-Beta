package wg;

import java.util.concurrent.atomic.AtomicBoolean;
public final class c implements Runnable {
    public final int f59726a;
    public final AtomicBoolean f59727b;

    public c(AtomicBoolean atomicBoolean, int i7) {
        this.f59726a = i7;
        this.f59727b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f59726a) {
            case 0:
                this.f59727b.set(true);
                return;
            default:
                this.f59727b.set(true);
                return;
        }
    }
}

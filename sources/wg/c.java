package wg;

import java.util.concurrent.atomic.AtomicBoolean;
public final class c implements Runnable {
    public final int f59725a;
    public final AtomicBoolean f59726b;

    public c(AtomicBoolean atomicBoolean, int i7) {
        this.f59725a = i7;
        this.f59726b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f59725a) {
            case 0:
                this.f59726b.set(true);
                return;
            default:
                this.f59726b.set(true);
                return;
        }
    }
}

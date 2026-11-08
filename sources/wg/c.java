package wg;

import java.util.concurrent.atomic.AtomicBoolean;
public final class c implements Runnable {
    public final int f57704a;
    public final AtomicBoolean f57705b;

    public c(AtomicBoolean atomicBoolean, int i7) {
        this.f57704a = i7;
        this.f57705b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f57704a) {
            case 0:
                this.f57705b.set(true);
                return;
            default:
                this.f57705b.set(true);
                return;
        }
    }
}

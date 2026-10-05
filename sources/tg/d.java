package tg;

import java.util.concurrent.atomic.AtomicBoolean;
public final class d implements Runnable {
    public final int f47004a;
    public final AtomicBoolean f47005b;

    public d(AtomicBoolean atomicBoolean, int i10) {
        this.f47004a = i10;
        this.f47005b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f47004a) {
            case 0:
                this.f47005b.set(true);
                return;
            default:
                this.f47005b.set(true);
                return;
        }
    }
}

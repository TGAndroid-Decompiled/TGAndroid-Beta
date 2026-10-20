package ug;

import java.util.concurrent.atomic.AtomicBoolean;
public final class d implements Runnable {
    public final int f47667a;
    public final AtomicBoolean f47668b;

    public d(AtomicBoolean atomicBoolean, int i10) {
        this.f47667a = i10;
        this.f47668b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f47667a) {
            case 0:
                this.f47668b.set(true);
                return;
            default:
                this.f47668b.set(true);
                return;
        }
    }
}

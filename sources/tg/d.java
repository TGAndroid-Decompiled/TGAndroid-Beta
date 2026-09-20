package tg;

import java.util.concurrent.atomic.AtomicBoolean;
public final class d implements Runnable {
    public final int f43403a;
    public final AtomicBoolean f43404b;

    public d(AtomicBoolean atomicBoolean, int i10) {
        this.f43403a = i10;
        this.f43404b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f43403a) {
            case 0:
                this.f43404b.set(true);
                return;
            default:
                this.f43404b.set(true);
                return;
        }
    }
}

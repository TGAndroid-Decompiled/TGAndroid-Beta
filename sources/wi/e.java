package wi;

import org.telegram.messenger.g0;
public final class e implements Runnable {
    public final int f59374a;
    public final h f59375b;

    public e(h hVar, int i7) {
        this.f59374a = i7;
        this.f59375b = hVar;
    }

    @Override
    public final void run() {
        switch (this.f59374a) {
            case 0:
                h hVar = this.f59375b;
                hVar.q();
                if (hVar.f59382b.h()) {
                    g0.i3(this, 500L);
                    return;
                }
                return;
            default:
                h hVar2 = this.f59375b;
                if (hVar2.f59382b.q()) {
                    g0.i3(this, 1500L);
                    return;
                }
                hVar2.f59399u = false;
                hVar2.o(false);
                hVar2.f59400w = false;
                return;
        }
    }
}

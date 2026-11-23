package wi;

import org.telegram.messenger.g0;
public final class e implements Runnable {
    public final int f59949a;
    public final h f59950b;

    public e(h hVar, int i7) {
        this.f59949a = i7;
        this.f59950b = hVar;
    }

    @Override
    public final void run() {
        switch (this.f59949a) {
            case 0:
                h hVar = this.f59950b;
                hVar.q();
                if (hVar.f59957b.h()) {
                    g0.h3(this, 500L);
                    return;
                }
                return;
            default:
                h hVar2 = this.f59950b;
                if (hVar2.f59957b.s()) {
                    g0.h3(this, 1500L);
                    return;
                }
                hVar2.f59974u = false;
                hVar2.o(false);
                hVar2.f59975w = false;
                return;
        }
    }
}

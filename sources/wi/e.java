package wi;

import org.telegram.messenger.g0;
public final class e implements Runnable {
    public final int f59938a;
    public final h f59939b;

    public e(h hVar, int i7) {
        this.f59938a = i7;
        this.f59939b = hVar;
    }

    @Override
    public final void run() {
        switch (this.f59938a) {
            case 0:
                h hVar = this.f59939b;
                hVar.q();
                if (hVar.f59946b.h()) {
                    g0.h3(this, 500L);
                    return;
                }
                return;
            default:
                h hVar2 = this.f59939b;
                if (hVar2.f59946b.s()) {
                    g0.h3(this, 1500L);
                    return;
                }
                hVar2.f59963u = false;
                hVar2.o(false);
                hVar2.f59964w = false;
                return;
        }
    }
}

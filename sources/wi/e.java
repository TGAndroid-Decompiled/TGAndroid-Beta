package wi;

import org.telegram.messenger.g0;
public final class e implements Runnable {
    public final int f59939a;
    public final h f59940b;

    public e(h hVar, int i7) {
        this.f59939a = i7;
        this.f59940b = hVar;
    }

    @Override
    public final void run() {
        switch (this.f59939a) {
            case 0:
                h hVar = this.f59940b;
                hVar.q();
                if (hVar.f59947b.h()) {
                    g0.h3(this, 500L);
                    return;
                }
                return;
            default:
                h hVar2 = this.f59940b;
                if (hVar2.f59947b.s()) {
                    g0.h3(this, 1500L);
                    return;
                }
                hVar2.f59964u = false;
                hVar2.o(false);
                hVar2.f59965w = false;
                return;
        }
    }
}

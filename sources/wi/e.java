package wi;

import org.telegram.messenger.g0;
public final class e implements Runnable {
    public final int f59980a;
    public final h f59981b;

    public e(h hVar, int i7) {
        this.f59980a = i7;
        this.f59981b = hVar;
    }

    @Override
    public final void run() {
        switch (this.f59980a) {
            case 0:
                h hVar = this.f59981b;
                hVar.q();
                if (hVar.f59988b.h()) {
                    g0.h3(this, 500L);
                    return;
                }
                return;
            default:
                h hVar2 = this.f59981b;
                if (hVar2.f59988b.s()) {
                    g0.h3(this, 1500L);
                    return;
                }
                hVar2.f60005u = false;
                hVar2.o(false);
                hVar2.f60006w = false;
                return;
        }
    }
}

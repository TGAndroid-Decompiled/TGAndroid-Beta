package wi;

import org.telegram.messenger.g0;
public final class e implements Runnable {
    public final int f59984a;
    public final h f59985b;

    public e(h hVar, int i7) {
        this.f59984a = i7;
        this.f59985b = hVar;
    }

    @Override
    public final void run() {
        switch (this.f59984a) {
            case 0:
                h hVar = this.f59985b;
                hVar.q();
                if (hVar.f59992b.h()) {
                    g0.h3(this, 500L);
                    return;
                }
                return;
            default:
                h hVar2 = this.f59985b;
                if (hVar2.f59992b.s()) {
                    g0.h3(this, 1500L);
                    return;
                }
                hVar2.f60009u = false;
                hVar2.o(false);
                hVar2.f60010w = false;
                return;
        }
    }
}

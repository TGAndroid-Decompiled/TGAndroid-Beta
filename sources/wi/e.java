package wi;

import org.telegram.messenger.g0;
public final class e implements Runnable {
    public final int f60067a;
    public final h f60068b;

    public e(h hVar, int i7) {
        this.f60067a = i7;
        this.f60068b = hVar;
    }

    @Override
    public final void run() {
        switch (this.f60067a) {
            case 0:
                h hVar = this.f60068b;
                hVar.q();
                if (hVar.f60075b.j()) {
                    g0.h3(this, 500L);
                    return;
                }
                return;
            default:
                h hVar2 = this.f60068b;
                if (hVar2.f60075b.l0()) {
                    g0.h3(this, 1500L);
                    return;
                }
                hVar2.f60092u = false;
                hVar2.o(false);
                hVar2.f60093w = false;
                return;
        }
    }
}

package ti;

import org.telegram.messenger.g0;
public final class f implements Runnable {
    public final int f55958a;
    public final i f55959b;

    public f(i iVar, int i7) {
        this.f55958a = i7;
        this.f55959b = iVar;
    }

    @Override
    public final void run() {
        switch (this.f55958a) {
            case 0:
                i iVar = this.f55959b;
                iVar.q();
                if (iVar.f55966b.h()) {
                    g0.i3(this, 500L);
                    return;
                }
                return;
            default:
                i iVar2 = this.f55959b;
                if (iVar2.f55966b.u()) {
                    g0.i3(this, 1500L);
                    return;
                }
                iVar2.f55983u = false;
                iVar2.o(false);
                iVar2.f55984w = false;
                return;
        }
    }
}

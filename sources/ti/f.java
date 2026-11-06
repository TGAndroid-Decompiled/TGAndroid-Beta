package ti;

import org.telegram.messenger.g0;
public final class f implements Runnable {
    public final int f55983a;
    public final i f55984b;

    public f(i iVar, int i7) {
        this.f55983a = i7;
        this.f55984b = iVar;
    }

    @Override
    public final void run() {
        switch (this.f55983a) {
            case 0:
                i iVar = this.f55984b;
                iVar.q();
                if (iVar.f55991b.h()) {
                    g0.i3(this, 500L);
                    return;
                }
                return;
            default:
                i iVar2 = this.f55984b;
                if (iVar2.f55991b.u()) {
                    g0.i3(this, 1500L);
                    return;
                }
                iVar2.f56008u = false;
                iVar2.o(false);
                iVar2.f56009w = false;
                return;
        }
    }
}

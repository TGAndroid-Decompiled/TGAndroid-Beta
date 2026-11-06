package ti;

import org.telegram.messenger.g0;
public final class f implements Runnable {
    public final int f55982a;
    public final i f55983b;

    public f(i iVar, int i7) {
        this.f55982a = i7;
        this.f55983b = iVar;
    }

    @Override
    public final void run() {
        switch (this.f55982a) {
            case 0:
                i iVar = this.f55983b;
                iVar.q();
                if (iVar.f55990b.h()) {
                    g0.i3(this, 500L);
                    return;
                }
                return;
            default:
                i iVar2 = this.f55983b;
                if (iVar2.f55990b.u()) {
                    g0.i3(this, 1500L);
                    return;
                }
                iVar2.f56007u = false;
                iVar2.o(false);
                iVar2.f56008w = false;
                return;
        }
    }
}

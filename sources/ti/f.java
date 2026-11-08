package ti;

import org.telegram.messenger.g0;
public final class f implements Runnable {
    public final int f56074a;
    public final i f56075b;

    public f(i iVar, int i7) {
        this.f56074a = i7;
        this.f56075b = iVar;
    }

    @Override
    public final void run() {
        switch (this.f56074a) {
            case 0:
                i iVar = this.f56075b;
                iVar.q();
                if (iVar.f56082b.h()) {
                    g0.i3(this, 500L);
                    return;
                }
                return;
            default:
                i iVar2 = this.f56075b;
                if (iVar2.f56082b.u()) {
                    g0.i3(this, 1500L);
                    return;
                }
                iVar2.f56099u = false;
                iVar2.o(false);
                iVar2.f56100w = false;
                return;
        }
    }
}

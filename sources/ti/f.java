package ti;

import org.telegram.messenger.g0;
public final class f implements Runnable {
    public final int f56075a;
    public final i f56076b;

    public f(i iVar, int i7) {
        this.f56075a = i7;
        this.f56076b = iVar;
    }

    @Override
    public final void run() {
        switch (this.f56075a) {
            case 0:
                i iVar = this.f56076b;
                iVar.q();
                if (iVar.f56083b.h()) {
                    g0.i3(this, 500L);
                    return;
                }
                return;
            default:
                i iVar2 = this.f56076b;
                if (iVar2.f56083b.u()) {
                    g0.i3(this, 1500L);
                    return;
                }
                iVar2.f56100u = false;
                iVar2.o(false);
                iVar2.f56101w = false;
                return;
        }
    }
}

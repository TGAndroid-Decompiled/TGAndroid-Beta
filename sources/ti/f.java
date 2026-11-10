package ti;

import org.telegram.messenger.g0;
public final class f implements Runnable {
    public final int f56086a;
    public final i f56087b;

    public f(i iVar, int i7) {
        this.f56086a = i7;
        this.f56087b = iVar;
    }

    @Override
    public final void run() {
        switch (this.f56086a) {
            case 0:
                i iVar = this.f56087b;
                iVar.q();
                if (iVar.f56094b.h()) {
                    g0.i3(this, 500L);
                    return;
                }
                return;
            default:
                i iVar2 = this.f56087b;
                if (iVar2.f56094b.u()) {
                    g0.i3(this, 1500L);
                    return;
                }
                iVar2.f56111u = false;
                iVar2.o(false);
                iVar2.f56112w = false;
                return;
        }
    }
}

package ti;

import org.telegram.messenger.g0;
public final class f implements Runnable {
    public final int f56087a;
    public final i f56088b;

    public f(i iVar, int i7) {
        this.f56087a = i7;
        this.f56088b = iVar;
    }

    @Override
    public final void run() {
        switch (this.f56087a) {
            case 0:
                i iVar = this.f56088b;
                iVar.q();
                if (iVar.f56095b.h()) {
                    g0.i3(this, 500L);
                    return;
                }
                return;
            default:
                i iVar2 = this.f56088b;
                if (iVar2.f56095b.u()) {
                    g0.i3(this, 1500L);
                    return;
                }
                iVar2.f56112u = false;
                iVar2.o(false);
                iVar2.f56113w = false;
                return;
        }
    }
}

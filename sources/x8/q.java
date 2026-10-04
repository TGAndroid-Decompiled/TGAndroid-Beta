package x8;

import y8.l0;
public final class q implements Runnable {
    public final int f49772a;
    public final l0 f49773b;
    public final m f49774c;

    public q(m mVar, l0 l0Var, int i10) {
        this.f49772a = i10;
        this.f49774c = mVar;
        this.f49773b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f49772a) {
            case 0:
                this.f49774c.f49768c.onPeerConnected(this.f49773b);
                return;
            default:
                this.f49774c.f49768c.onPeerDisconnected(this.f49773b);
                return;
        }
    }
}

package x8;

import y8.l0;
public final class r implements Runnable {
    public final int f49678a;
    public final l0 f49679b;
    public final m f49680c;

    public r(m mVar, l0 l0Var, int i10) {
        this.f49678a = i10;
        this.f49680c = mVar;
        this.f49679b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f49678a) {
            case 0:
                this.f49680c.f49673c.onPeerConnected(this.f49679b);
                return;
            default:
                this.f49680c.f49673c.onPeerDisconnected(this.f49679b);
                return;
        }
    }
}

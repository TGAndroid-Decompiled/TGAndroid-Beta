package x8;

import y8.l0;
public final class q implements Runnable {
    public final int f51065a;
    public final l0 f51066b;
    public final m f51067c;

    public q(m mVar, l0 l0Var, int i10) {
        this.f51065a = i10;
        this.f51067c = mVar;
        this.f51066b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f51065a) {
            case 0:
                this.f51067c.f51061c.onPeerConnected(this.f51066b);
                return;
            default:
                this.f51067c.f51061c.onPeerDisconnected(this.f51066b);
                return;
        }
    }
}

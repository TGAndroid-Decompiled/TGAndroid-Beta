package x8;

import y8.l0;
public final class q implements Runnable {
    public final int f45722a;
    public final l0 f45723b;
    public final m f45724c;

    public q(m mVar, l0 l0Var, int i10) {
        this.f45722a = i10;
        this.f45724c = mVar;
        this.f45723b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f45722a) {
            case 0:
                this.f45724c.f45718c.onPeerConnected(this.f45723b);
                return;
            default:
                this.f45724c.f45718c.onPeerDisconnected(this.f45723b);
                return;
        }
    }
}

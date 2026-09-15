package x8;

import y8.l0;
public final class q implements Runnable {
    public final int f45699a;
    public final l0 f45700b;
    public final m f45701c;

    public q(m mVar, l0 l0Var, int i10) {
        this.f45699a = i10;
        this.f45701c = mVar;
        this.f45700b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f45699a) {
            case 0:
                this.f45701c.f45695c.onPeerConnected(this.f45700b);
                return;
            default:
                this.f45701c.f45695c.onPeerDisconnected(this.f45700b);
                return;
        }
    }
}

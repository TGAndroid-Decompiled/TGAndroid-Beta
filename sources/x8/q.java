package x8;

import y8.l0;
public final class q implements Runnable {
    public final int f51063a;
    public final l0 f51064b;
    public final m f51065c;

    public q(m mVar, l0 l0Var, int i10) {
        this.f51063a = i10;
        this.f51065c = mVar;
        this.f51064b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f51063a) {
            case 0:
                this.f51065c.f51059c.onPeerConnected(this.f51064b);
                return;
            default:
                this.f51065c.f51059c.onPeerDisconnected(this.f51064b);
                return;
        }
    }
}

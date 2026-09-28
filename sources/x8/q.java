package x8;

import y8.l0;
public final class q implements Runnable {
    public final int f45977a;
    public final l0 f45978b;
    public final m f45979c;

    public q(m mVar, l0 l0Var, int i10) {
        this.f45977a = i10;
        this.f45979c = mVar;
        this.f45978b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f45977a) {
            case 0:
                this.f45979c.f45973c.onPeerConnected(this.f45978b);
                return;
            default:
                this.f45979c.f45973c.onPeerDisconnected(this.f45978b);
                return;
        }
    }
}

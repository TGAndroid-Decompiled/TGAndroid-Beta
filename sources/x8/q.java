package x8;

import y8.l0;
public final class q implements Runnable {
    public final int f45978a;
    public final l0 f45979b;
    public final m f45980c;

    public q(m mVar, l0 l0Var, int i10) {
        this.f45978a = i10;
        this.f45980c = mVar;
        this.f45979b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f45978a) {
            case 0:
                this.f45980c.f45974c.onPeerConnected(this.f45979b);
                return;
            default:
                this.f45980c.f45974c.onPeerDisconnected(this.f45979b);
                return;
        }
    }
}

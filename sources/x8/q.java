package x8;

import y8.l0;
public final class q implements Runnable {
    public final int f45979a;
    public final l0 f45980b;
    public final m f45981c;

    public q(m mVar, l0 l0Var, int i10) {
        this.f45979a = i10;
        this.f45981c = mVar;
        this.f45980b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f45979a) {
            case 0:
                this.f45981c.f45975c.onPeerConnected(this.f45980b);
                return;
            default:
                this.f45981c.f45975c.onPeerDisconnected(this.f45980b);
                return;
        }
    }
}

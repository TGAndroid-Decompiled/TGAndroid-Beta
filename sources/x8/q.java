package x8;

import y8.l0;
public final class q implements Runnable {
    public final int f45727a;
    public final l0 f45728b;
    public final m f45729c;

    public q(m mVar, l0 l0Var, int i10) {
        this.f45727a = i10;
        this.f45729c = mVar;
        this.f45728b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f45727a) {
            case 0:
                this.f45729c.f45723c.onPeerConnected(this.f45728b);
                return;
            default:
                this.f45729c.f45723c.onPeerDisconnected(this.f45728b);
                return;
        }
    }
}

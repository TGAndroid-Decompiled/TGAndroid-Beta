package x8;

import y8.l0;
public final class q implements Runnable {
    public final int f45649a;
    public final l0 f45650b;
    public final m f45651c;

    public q(m mVar, l0 l0Var, int i10) {
        this.f45649a = i10;
        this.f45651c = mVar;
        this.f45650b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f45649a) {
            case 0:
                this.f45651c.f45645c.onPeerConnected(this.f45650b);
                return;
            default:
                this.f45651c.f45645c.onPeerDisconnected(this.f45650b);
                return;
        }
    }
}

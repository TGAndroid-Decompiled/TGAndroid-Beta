package x8;

import y8.l0;
public final class q implements Runnable {
    public final int f45963a;
    public final l0 f45964b;
    public final m f45965c;

    public q(m mVar, l0 l0Var, int i10) {
        this.f45963a = i10;
        this.f45965c = mVar;
        this.f45964b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f45963a) {
            case 0:
                this.f45965c.f45959c.onPeerConnected(this.f45964b);
                return;
            default:
                this.f45965c.f45959c.onPeerDisconnected(this.f45964b);
                return;
        }
    }
}

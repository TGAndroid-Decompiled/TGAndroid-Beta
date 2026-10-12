package x8;

import y8.l0;
public final class q implements Runnable {
    public final int f51294a;
    public final l0 f51295b;
    public final m f51296c;

    public q(m mVar, l0 l0Var, int i10) {
        this.f51294a = i10;
        this.f51296c = mVar;
        this.f51295b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f51294a) {
            case 0:
                this.f51296c.f51290c.onPeerConnected(this.f51295b);
                return;
            default:
                this.f51296c.f51290c.onPeerDisconnected(this.f51295b);
                return;
        }
    }
}

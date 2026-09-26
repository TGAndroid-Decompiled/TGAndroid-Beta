package x8;

import y8.l0;
public final class q implements Runnable {
    public final int f45976a;
    public final l0 f45977b;
    public final m f45978c;

    public q(m mVar, l0 l0Var, int i10) {
        this.f45976a = i10;
        this.f45978c = mVar;
        this.f45977b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f45976a) {
            case 0:
                this.f45978c.f45972c.onPeerConnected(this.f45977b);
                return;
            default:
                this.f45978c.f45972c.onPeerDisconnected(this.f45977b);
                return;
        }
    }
}

package x8;

import y8.l0;
public final class q implements Runnable {
    public final int f45997a;
    public final l0 f45998b;
    public final m f45999c;

    public q(m mVar, l0 l0Var, int i10) {
        this.f45997a = i10;
        this.f45999c = mVar;
        this.f45998b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f45997a) {
            case 0:
                this.f45999c.f45993c.onPeerConnected(this.f45998b);
                return;
            default:
                this.f45999c.f45993c.onPeerDisconnected(this.f45998b);
                return;
        }
    }
}

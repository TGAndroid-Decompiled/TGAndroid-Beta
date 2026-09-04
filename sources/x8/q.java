package x8;

import y8.l0;
public final class q implements Runnable {
    public final int f49290a;
    public final l0 f49291b;
    public final m f49292c;

    public q(m mVar, l0 l0Var, int i10) {
        this.f49290a = i10;
        this.f49292c = mVar;
        this.f49291b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f49290a) {
            case 0:
                this.f49292c.f49286c.onPeerConnected(this.f49291b);
                return;
            default:
                this.f49292c.f49286c.onPeerDisconnected(this.f49291b);
                return;
        }
    }
}

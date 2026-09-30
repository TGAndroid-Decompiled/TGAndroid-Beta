package x8;

import y8.l0;
public final class q implements Runnable {
    public final int f46085a;
    public final l0 f46086b;
    public final m f46087c;

    public q(m mVar, l0 l0Var, int i10) {
        this.f46085a = i10;
        this.f46087c = mVar;
        this.f46086b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f46085a) {
            case 0:
                this.f46087c.f46081c.onPeerConnected(this.f46086b);
                return;
            default:
                this.f46087c.f46081c.onPeerDisconnected(this.f46086b);
                return;
        }
    }
}

package x8;

import y8.l0;
public final class q implements Runnable {
    public final int f49787a;
    public final l0 f49788b;
    public final m f49789c;

    public q(m mVar, l0 l0Var, int i10) {
        this.f49787a = i10;
        this.f49789c = mVar;
        this.f49788b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f49787a) {
            case 0:
                this.f49789c.f49783c.onPeerConnected(this.f49788b);
                return;
            default:
                this.f49789c.f49783c.onPeerDisconnected(this.f49788b);
                return;
        }
    }
}

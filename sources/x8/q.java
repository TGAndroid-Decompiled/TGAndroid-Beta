package x8;

import y8.l0;
public final class q implements Runnable {
    public final int f46023a;
    public final l0 f46024b;
    public final m f46025c;

    public q(m mVar, l0 l0Var, int i10) {
        this.f46023a = i10;
        this.f46025c = mVar;
        this.f46024b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f46023a) {
            case 0:
                this.f46025c.f46019c.onPeerConnected(this.f46024b);
                return;
            default:
                this.f46025c.f46019c.onPeerDisconnected(this.f46024b);
                return;
        }
    }
}

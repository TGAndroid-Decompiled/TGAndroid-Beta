package x8;

import y8.l0;
public final class q implements Runnable {
    public final int f51153a;
    public final l0 f51154b;
    public final m f51155c;

    public q(m mVar, l0 l0Var, int i10) {
        this.f51153a = i10;
        this.f51155c = mVar;
        this.f51154b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f51153a) {
            case 0:
                this.f51155c.f51149c.onPeerConnected(this.f51154b);
                return;
            default:
                this.f51155c.f51149c.onPeerDisconnected(this.f51154b);
                return;
        }
    }
}

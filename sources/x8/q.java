package x8;

import y8.l0;
public final class q implements Runnable {
    public final int f51109a;
    public final l0 f51110b;
    public final m f51111c;

    public q(m mVar, l0 l0Var, int i10) {
        this.f51109a = i10;
        this.f51111c = mVar;
        this.f51110b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f51109a) {
            case 0:
                this.f51111c.f51105c.onPeerConnected(this.f51110b);
                return;
            default:
                this.f51111c.f51105c.onPeerDisconnected(this.f51110b);
                return;
        }
    }
}

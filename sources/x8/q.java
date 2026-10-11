package x8;

import y8.l0;
public final class q implements Runnable {
    public final int f51187a;
    public final l0 f51188b;
    public final m f51189c;

    public q(m mVar, l0 l0Var, int i10) {
        this.f51187a = i10;
        this.f51189c = mVar;
        this.f51188b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f51187a) {
            case 0:
                this.f51189c.f51183c.onPeerConnected(this.f51188b);
                return;
            default:
                this.f51189c.f51183c.onPeerDisconnected(this.f51188b);
                return;
        }
    }
}

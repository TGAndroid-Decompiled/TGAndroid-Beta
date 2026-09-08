package x8;

import y8.l0;
public final class q implements Runnable {
    public final int f49319a;
    public final l0 f49320b;
    public final m f49321c;

    public q(m mVar, l0 l0Var, int i10) {
        this.f49319a = i10;
        this.f49321c = mVar;
        this.f49320b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f49319a) {
            case 0:
                this.f49321c.f49315c.onPeerConnected(this.f49320b);
                return;
            default:
                this.f49321c.f49315c.onPeerDisconnected(this.f49320b);
                return;
        }
    }
}

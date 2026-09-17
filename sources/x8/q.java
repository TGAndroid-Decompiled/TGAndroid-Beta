package x8;

import y8.l0;
public final class q implements Runnable {
    public final int f49320a;
    public final l0 f49321b;
    public final m f49322c;

    public q(m mVar, l0 l0Var, int i10) {
        this.f49320a = i10;
        this.f49322c = mVar;
        this.f49321b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f49320a) {
            case 0:
                this.f49322c.f49316c.onPeerConnected(this.f49321b);
                return;
            default:
                this.f49322c.f49316c.onPeerDisconnected(this.f49321b);
                return;
        }
    }
}

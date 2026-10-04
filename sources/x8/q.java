package x8;

import y8.l0;
public final class q implements Runnable {
    public final int f49771a;
    public final l0 f49772b;
    public final m f49773c;

    public q(m mVar, l0 l0Var, int i10) {
        this.f49771a = i10;
        this.f49773c = mVar;
        this.f49772b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f49771a) {
            case 0:
                this.f49773c.f49767c.onPeerConnected(this.f49772b);
                return;
            default:
                this.f49773c.f49767c.onPeerDisconnected(this.f49772b);
                return;
        }
    }
}

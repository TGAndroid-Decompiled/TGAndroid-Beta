package x8;

import y8.l0;
public final class r implements Runnable {
    public final int f48270a;
    public final l0 f48271b;
    public final m f48272c;

    public r(m mVar, l0 l0Var, int i10) {
        this.f48270a = i10;
        this.f48272c = mVar;
        this.f48271b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f48270a) {
            case 0:
                this.f48272c.f48265c.onPeerConnected(this.f48271b);
                return;
            default:
                this.f48272c.f48265c.onPeerDisconnected(this.f48271b);
                return;
        }
    }
}

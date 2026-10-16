package x8;

import y8.l0;
public final class r implements Runnable {
    public final int f48269a;
    public final l0 f48270b;
    public final m f48271c;

    public r(m mVar, l0 l0Var, int i10) {
        this.f48269a = i10;
        this.f48271c = mVar;
        this.f48270b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f48269a) {
            case 0:
                this.f48271c.f48264c.onPeerConnected(this.f48270b);
                return;
            default:
                this.f48271c.f48264c.onPeerDisconnected(this.f48270b);
                return;
        }
    }
}

package x8;

import y8.l0;
public final class r implements Runnable {
    public final int f49655a;
    public final l0 f49656b;
    public final m f49657c;

    public r(m mVar, l0 l0Var, int i10) {
        this.f49655a = i10;
        this.f49657c = mVar;
        this.f49656b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f49655a) {
            case 0:
                this.f49657c.f49650c.onPeerConnected(this.f49656b);
                return;
            default:
                this.f49657c.f49650c.onPeerDisconnected(this.f49656b);
                return;
        }
    }
}

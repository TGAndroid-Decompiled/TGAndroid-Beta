package x8;

import y8.l0;
public final class r implements Runnable {
    public final int f49703a;
    public final l0 f49704b;
    public final m f49705c;

    public r(m mVar, l0 l0Var, int i10) {
        this.f49703a = i10;
        this.f49705c = mVar;
        this.f49704b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f49703a) {
            case 0:
                this.f49705c.f49698c.onPeerConnected(this.f49704b);
                return;
            default:
                this.f49705c.f49698c.onPeerDisconnected(this.f49704b);
                return;
        }
    }
}

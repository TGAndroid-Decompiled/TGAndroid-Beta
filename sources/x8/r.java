package x8;

import y8.l0;
public final class r implements Runnable {
    public final int f49657a;
    public final l0 f49658b;
    public final m f49659c;

    public r(m mVar, l0 l0Var, int i10) {
        this.f49657a = i10;
        this.f49659c = mVar;
        this.f49658b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f49657a) {
            case 0:
                this.f49659c.f49652c.onPeerConnected(this.f49658b);
                return;
            default:
                this.f49659c.f49652c.onPeerDisconnected(this.f49658b);
                return;
        }
    }
}

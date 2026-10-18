package x8;

import y8.l0;
public final class r implements Runnable {
    public final int f49656a;
    public final l0 f49657b;
    public final m f49658c;

    public r(m mVar, l0 l0Var, int i10) {
        this.f49656a = i10;
        this.f49658c = mVar;
        this.f49657b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f49656a) {
            case 0:
                this.f49658c.f49651c.onPeerConnected(this.f49657b);
                return;
            default:
                this.f49658c.f49651c.onPeerDisconnected(this.f49657b);
                return;
        }
    }
}

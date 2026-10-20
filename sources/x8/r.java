package x8;

import y8.l0;
public final class r implements Runnable {
    public final int f49662a;
    public final l0 f49663b;
    public final m f49664c;

    public r(m mVar, l0 l0Var, int i10) {
        this.f49662a = i10;
        this.f49664c = mVar;
        this.f49663b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f49662a) {
            case 0:
                this.f49664c.f49657c.onPeerConnected(this.f49663b);
                return;
            default:
                this.f49664c.f49657c.onPeerDisconnected(this.f49663b);
                return;
        }
    }
}

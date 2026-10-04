package x8;

import y8.l0;
public final class q implements Runnable {
    public final int f49780a;
    public final l0 f49781b;
    public final m f49782c;

    public q(m mVar, l0 l0Var, int i10) {
        this.f49780a = i10;
        this.f49782c = mVar;
        this.f49781b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f49780a) {
            case 0:
                this.f49782c.f49776c.onPeerConnected(this.f49781b);
                return;
            default:
                this.f49782c.f49776c.onPeerDisconnected(this.f49781b);
                return;
        }
    }
}

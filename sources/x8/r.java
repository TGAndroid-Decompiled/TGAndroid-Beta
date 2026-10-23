package x8;

import y8.l0;
public final class r implements Runnable {
    public final int f50108a;
    public final l0 f50109b;
    public final m f50110c;

    public r(m mVar, l0 l0Var, int i10) {
        this.f50108a = i10;
        this.f50110c = mVar;
        this.f50109b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f50108a) {
            case 0:
                this.f50110c.f50103c.onPeerConnected(this.f50109b);
                return;
            default:
                this.f50110c.f50103c.onPeerDisconnected(this.f50109b);
                return;
        }
    }
}

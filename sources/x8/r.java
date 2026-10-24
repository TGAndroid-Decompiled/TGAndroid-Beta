package x8;

import y8.l0;
public final class r implements Runnable {
    public final int f50107a;
    public final l0 f50108b;
    public final m f50109c;

    public r(m mVar, l0 l0Var, int i10) {
        this.f50107a = i10;
        this.f50109c = mVar;
        this.f50108b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f50107a) {
            case 0:
                this.f50109c.f50102c.onPeerConnected(this.f50108b);
                return;
            default:
                this.f50109c.f50102c.onPeerDisconnected(this.f50108b);
                return;
        }
    }
}

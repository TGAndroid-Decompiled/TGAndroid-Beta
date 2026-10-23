package x8;

import y8.l0;
public final class r implements Runnable {
    public final int f49666a;
    public final l0 f49667b;
    public final m f49668c;

    public r(m mVar, l0 l0Var, int i10) {
        this.f49666a = i10;
        this.f49668c = mVar;
        this.f49667b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f49666a) {
            case 0:
                this.f49668c.f49661c.onPeerConnected(this.f49667b);
                return;
            default:
                this.f49668c.f49661c.onPeerDisconnected(this.f49667b);
                return;
        }
    }
}

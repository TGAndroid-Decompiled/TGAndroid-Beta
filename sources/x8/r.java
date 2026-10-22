package x8;

import y8.l0;
public final class r implements Runnable {
    public final int f49665a;
    public final l0 f49666b;
    public final m f49667c;

    public r(m mVar, l0 l0Var, int i10) {
        this.f49665a = i10;
        this.f49667c = mVar;
        this.f49666b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f49665a) {
            case 0:
                this.f49667c.f49660c.onPeerConnected(this.f49666b);
                return;
            default:
                this.f49667c.f49660c.onPeerDisconnected(this.f49666b);
                return;
        }
    }
}

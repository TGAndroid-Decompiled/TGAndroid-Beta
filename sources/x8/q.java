package x8;

import y8.l0;
public final class q implements Runnable {
    public final int f45950a;
    public final l0 f45951b;
    public final m f45952c;

    public q(m mVar, l0 l0Var, int i10) {
        this.f45950a = i10;
        this.f45952c = mVar;
        this.f45951b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f45950a) {
            case 0:
                this.f45952c.f45946c.onPeerConnected(this.f45951b);
                return;
            default:
                this.f45952c.f45946c.onPeerDisconnected(this.f45951b);
                return;
        }
    }
}

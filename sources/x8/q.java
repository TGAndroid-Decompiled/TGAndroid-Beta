package x8;

import y8.l0;
public final class q implements Runnable {
    public final int f45695a;
    public final l0 f45696b;
    public final m f45697c;

    public q(m mVar, l0 l0Var, int i10) {
        this.f45695a = i10;
        this.f45697c = mVar;
        this.f45696b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f45695a) {
            case 0:
                this.f45697c.f45691c.onPeerConnected(this.f45696b);
                return;
            default:
                this.f45697c.f45691c.onPeerDisconnected(this.f45696b);
                return;
        }
    }
}

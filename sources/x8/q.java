package x8;

import y8.l0;
public final class q implements Runnable {
    public final int f46018a;
    public final l0 f46019b;
    public final m f46020c;

    public q(m mVar, l0 l0Var, int i10) {
        this.f46018a = i10;
        this.f46020c = mVar;
        this.f46019b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f46018a) {
            case 0:
                this.f46020c.f46014c.onPeerConnected(this.f46019b);
                return;
            default:
                this.f46020c.f46014c.onPeerDisconnected(this.f46019b);
                return;
        }
    }
}

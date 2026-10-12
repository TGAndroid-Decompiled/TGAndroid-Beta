package x8;

import y8.l0;
public final class q implements Runnable {
    public final int f51302a;
    public final l0 f51303b;
    public final m f51304c;

    public q(m mVar, l0 l0Var, int i10) {
        this.f51302a = i10;
        this.f51304c = mVar;
        this.f51303b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f51302a) {
            case 0:
                this.f51304c.f51298c.onPeerConnected(this.f51303b);
                return;
            default:
                this.f51304c.f51298c.onPeerDisconnected(this.f51303b);
                return;
        }
    }
}

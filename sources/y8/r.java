package y8;

import z8.m0;
public final class r implements Runnable {
    public final int f52465a;
    public final m0 f52466b;
    public final m f52467c;

    public r(m mVar, m0 m0Var, int i10) {
        this.f52465a = i10;
        this.f52467c = mVar;
        this.f52466b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f52465a) {
            case 0:
                this.f52467c.f52460c.onPeerConnected(this.f52466b);
                return;
            default:
                this.f52467c.f52460c.onPeerDisconnected(this.f52466b);
                return;
        }
    }
}

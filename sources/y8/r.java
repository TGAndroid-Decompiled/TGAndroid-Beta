package y8;

import z8.m0;
public final class r implements Runnable {
    public final int f52404a;
    public final m0 f52405b;
    public final m f52406c;

    public r(m mVar, m0 m0Var, int i10) {
        this.f52404a = i10;
        this.f52406c = mVar;
        this.f52405b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f52404a) {
            case 0:
                this.f52406c.f52399c.onPeerConnected(this.f52405b);
                return;
            default:
                this.f52406c.f52399c.onPeerDisconnected(this.f52405b);
                return;
        }
    }
}

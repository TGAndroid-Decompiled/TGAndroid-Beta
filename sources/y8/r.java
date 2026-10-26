package y8;

import z8.m0;
public final class r implements Runnable {
    public final int f52407a;
    public final m0 f52408b;
    public final m f52409c;

    public r(m mVar, m0 m0Var, int i10) {
        this.f52407a = i10;
        this.f52409c = mVar;
        this.f52408b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f52407a) {
            case 0:
                this.f52409c.f52402c.onPeerConnected(this.f52408b);
                return;
            default:
                this.f52409c.f52402c.onPeerDisconnected(this.f52408b);
                return;
        }
    }
}

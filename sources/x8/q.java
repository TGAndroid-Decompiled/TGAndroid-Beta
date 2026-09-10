package x8;

import y8.l0;
public final class q implements Runnable {
    public final int f45039a;
    public final l0 f45040b;
    public final m f45041c;

    public q(m mVar, l0 l0Var, int i10) {
        this.f45039a = i10;
        this.f45041c = mVar;
        this.f45040b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f45039a) {
            case 0:
                this.f45041c.f45035c.onPeerConnected(this.f45040b);
                return;
            default:
                this.f45041c.f45035c.onPeerDisconnected(this.f45040b);
                return;
        }
    }
}

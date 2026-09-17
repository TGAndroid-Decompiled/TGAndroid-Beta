package x8;

import y8.l0;
public final class q implements Runnable {
    public final int f49291a;
    public final l0 f49292b;
    public final m f49293c;

    public q(m mVar, l0 l0Var, int i10) {
        this.f49291a = i10;
        this.f49293c = mVar;
        this.f49292b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f49291a) {
            case 0:
                this.f49293c.f49287c.onPeerConnected(this.f49292b);
                return;
            default:
                this.f49293c.f49287c.onPeerDisconnected(this.f49292b);
                return;
        }
    }
}

package p4;

import org.telegram.messenger.bf;
public final class y implements Runnable {
    public final int f55581a;
    public final d0 f55582b;

    public y(d0 d0Var, int i7) {
        this.f55581a = i7;
        this.f55582b = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f55581a) {
            case 0:
                d0 d0Var = this.f55582b;
                bf bfVar = d0Var.f55325u;
                if (bfVar != null) {
                    d0Var.f55324t.i0(bfVar);
                    return;
                }
                return;
            case 1:
                this.f55582b.getClass();
                return;
            case 2:
                d0.a(this.f55582b);
                return;
            default:
                this.f55582b.t();
                return;
        }
    }
}

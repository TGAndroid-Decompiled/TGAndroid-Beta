package p4;

import org.telegram.messenger.bf;
public final class y implements Runnable {
    public final int f55457a;
    public final d0 f55458b;

    public y(d0 d0Var, int i7) {
        this.f55457a = i7;
        this.f55458b = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f55457a) {
            case 0:
                d0 d0Var = this.f55458b;
                bf bfVar = d0Var.f55196u;
                if (bfVar != null) {
                    d0Var.f55195t.h0(bfVar);
                    return;
                }
                return;
            case 1:
                this.f55458b.getClass();
                return;
            case 2:
                d0.a(this.f55458b);
                return;
            default:
                this.f55458b.t();
                return;
        }
    }
}

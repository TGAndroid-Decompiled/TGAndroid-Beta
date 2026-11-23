package p4;

import org.telegram.messenger.cf;
public final class y implements Runnable {
    public final int f55467a;
    public final d0 f55468b;

    public y(d0 d0Var, int i7) {
        this.f55467a = i7;
        this.f55468b = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f55467a) {
            case 0:
                d0 d0Var = this.f55468b;
                cf cfVar = d0Var.f55206u;
                if (cfVar != null) {
                    d0Var.f55205t.h0(cfVar);
                    return;
                }
                return;
            case 1:
                this.f55468b.getClass();
                return;
            case 2:
                d0.a(this.f55468b);
                return;
            default:
                this.f55468b.t();
                return;
        }
    }
}

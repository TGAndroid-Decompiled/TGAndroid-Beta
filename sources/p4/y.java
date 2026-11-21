package p4;

import org.telegram.messenger.bf;
public final class y implements Runnable {
    public final int f55498a;
    public final e0 f55499b;

    public y(e0 e0Var, int i7) {
        this.f55498a = i7;
        this.f55499b = e0Var;
    }

    @Override
    public final void run() {
        switch (this.f55498a) {
            case 0:
                e0 e0Var = this.f55499b;
                bf bfVar = e0Var.f55246u;
                if (bfVar != null) {
                    e0Var.f55245t.h0(bfVar);
                    return;
                }
                return;
            case 1:
                this.f55499b.getClass();
                return;
            case 2:
                e0.a(this.f55499b);
                return;
            default:
                this.f55499b.t();
                return;
        }
    }
}

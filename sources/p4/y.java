package p4;

import org.telegram.messenger.cf;
public final class y implements Runnable {
    public final int f55502a;
    public final e0 f55503b;

    public y(e0 e0Var, int i7) {
        this.f55502a = i7;
        this.f55503b = e0Var;
    }

    @Override
    public final void run() {
        switch (this.f55502a) {
            case 0:
                e0 e0Var = this.f55503b;
                cf cfVar = e0Var.f55250u;
                if (cfVar != null) {
                    e0Var.f55249t.h0(cfVar);
                    return;
                }
                return;
            case 1:
                this.f55503b.getClass();
                return;
            case 2:
                e0.a(this.f55503b);
                return;
            default:
                this.f55503b.t();
                return;
        }
    }
}

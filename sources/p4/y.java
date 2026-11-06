package p4;

import org.telegram.messenger.df;
public final class y implements Runnable {
    public final int f53349a;
    public final d0 f53350b;

    public y(d0 d0Var, int i7) {
        this.f53349a = i7;
        this.f53350b = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f53349a) {
            case 0:
                d0 d0Var = this.f53350b;
                df dfVar = d0Var.f53101u;
                if (dfVar != null) {
                    d0Var.f53100t.h0(dfVar);
                    return;
                }
                return;
            case 1:
                this.f53350b.getClass();
                return;
            case 2:
                d0.a(this.f53350b);
                return;
            default:
                this.f53350b.t();
                return;
        }
    }
}

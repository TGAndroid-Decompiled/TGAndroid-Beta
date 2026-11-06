package p4;

import org.telegram.messenger.df;
public final class y implements Runnable {
    public final int f53373a;
    public final d0 f53374b;

    public y(d0 d0Var, int i7) {
        this.f53373a = i7;
        this.f53374b = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f53373a) {
            case 0:
                d0 d0Var = this.f53374b;
                df dfVar = d0Var.f53125u;
                if (dfVar != null) {
                    d0Var.f53124t.h0(dfVar);
                    return;
                }
                return;
            case 1:
                this.f53374b.getClass();
                return;
            case 2:
                d0.a(this.f53374b);
                return;
            default:
                this.f53374b.t();
                return;
        }
    }
}

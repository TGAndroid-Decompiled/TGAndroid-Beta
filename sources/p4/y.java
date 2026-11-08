package p4;

import org.telegram.messenger.df;
public final class y implements Runnable {
    public final int f53466a;
    public final d0 f53467b;

    public y(d0 d0Var, int i7) {
        this.f53466a = i7;
        this.f53467b = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f53466a) {
            case 0:
                d0 d0Var = this.f53467b;
                df dfVar = d0Var.f53218u;
                if (dfVar != null) {
                    d0Var.f53217t.h0(dfVar);
                    return;
                }
                return;
            case 1:
                this.f53467b.getClass();
                return;
            case 2:
                d0.a(this.f53467b);
                return;
            default:
                this.f53467b.t();
                return;
        }
    }
}

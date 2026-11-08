package p4;

import org.telegram.messenger.df;
public final class y implements Runnable {
    public final int f53467a;
    public final d0 f53468b;

    public y(d0 d0Var, int i7) {
        this.f53467a = i7;
        this.f53468b = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f53467a) {
            case 0:
                d0 d0Var = this.f53468b;
                df dfVar = d0Var.f53219u;
                if (dfVar != null) {
                    d0Var.f53218t.h0(dfVar);
                    return;
                }
                return;
            case 1:
                this.f53468b.getClass();
                return;
            case 2:
                d0.a(this.f53468b);
                return;
            default:
                this.f53468b.t();
                return;
        }
    }
}

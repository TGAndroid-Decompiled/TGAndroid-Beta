package p4;

import org.telegram.messenger.df;
public final class y implements Runnable {
    public final int f53478a;
    public final d0 f53479b;

    public y(d0 d0Var, int i7) {
        this.f53478a = i7;
        this.f53479b = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f53478a) {
            case 0:
                d0 d0Var = this.f53479b;
                df dfVar = d0Var.f53230u;
                if (dfVar != null) {
                    d0Var.f53229t.h0(dfVar);
                    return;
                }
                return;
            case 1:
                this.f53479b.getClass();
                return;
            case 2:
                d0.a(this.f53479b);
                return;
            default:
                this.f53479b.t();
                return;
        }
    }
}

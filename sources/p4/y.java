package p4;

import org.telegram.messenger.df;
public final class y implements Runnable {
    public final int f53479a;
    public final d0 f53480b;

    public y(d0 d0Var, int i7) {
        this.f53479a = i7;
        this.f53480b = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f53479a) {
            case 0:
                d0 d0Var = this.f53480b;
                df dfVar = d0Var.f53231u;
                if (dfVar != null) {
                    d0Var.f53230t.h0(dfVar);
                    return;
                }
                return;
            case 1:
                this.f53480b.getClass();
                return;
            case 2:
                d0.a(this.f53480b);
                return;
            default:
                this.f53480b.t();
                return;
        }
    }
}

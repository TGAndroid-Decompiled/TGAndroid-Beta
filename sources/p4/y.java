package p4;

import org.telegram.messenger.df;
public final class y implements Runnable {
    public final int f53375a;
    public final d0 f53376b;

    public y(d0 d0Var, int i7) {
        this.f53375a = i7;
        this.f53376b = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f53375a) {
            case 0:
                d0 d0Var = this.f53376b;
                df dfVar = d0Var.f53127u;
                if (dfVar != null) {
                    d0Var.f53126t.h0(dfVar);
                    return;
                }
                return;
            case 1:
                this.f53376b.getClass();
                return;
            case 2:
                d0.a(this.f53376b);
                return;
            default:
                this.f53376b.t();
                return;
        }
    }
}

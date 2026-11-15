package p4;

import org.telegram.messenger.cf;
public final class y implements Runnable {
    public final int f54884a;
    public final d0 f54885b;

    public y(d0 d0Var, int i7) {
        this.f54884a = i7;
        this.f54885b = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f54884a) {
            case 0:
                d0 d0Var = this.f54885b;
                cf cfVar = d0Var.f54636u;
                if (cfVar != null) {
                    d0Var.f54635t.h0(cfVar);
                    return;
                }
                return;
            case 1:
                this.f54885b.getClass();
                return;
            case 2:
                d0.a(this.f54885b);
                return;
            default:
                this.f54885b.t();
                return;
        }
    }
}

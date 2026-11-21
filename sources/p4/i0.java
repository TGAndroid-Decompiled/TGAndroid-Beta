package p4;

import org.telegram.messenger.pe;
public final class i0 implements Runnable {
    public final int f55325a;
    public final n0 f55326b;
    public final i1 f55327c;

    public i0(n0 n0Var, i1 i1Var, int i7) {
        this.f55325a = i7;
        this.f55326b = n0Var;
        this.f55327c = i1Var;
    }

    @Override
    public final void run() {
        e2.l1 l1Var;
        switch (this.f55325a) {
            case 0:
                n0 n0Var = this.f55326b;
                q4.q qVar = n0Var.f55382n;
                i1 i1Var = this.f55327c;
                qVar.f(n0Var.h0(i1Var));
                pe peVar = n0Var.f55378j;
                if (i1Var.t().a(17)) {
                    l1Var = i1Var.y0();
                } else {
                    l1Var = e2.l1.f10534a;
                }
                peVar.w(l1Var);
                return;
            default:
                n0 n0Var2 = this.f55326b;
                n0Var2.f55382n.f(n0Var2.h0(this.f55327c));
                return;
        }
    }
}

package p4;

import org.telegram.messenger.qe;
public final class i0 implements Runnable {
    public final int f55329a;
    public final n0 f55330b;
    public final i1 f55331c;

    public i0(n0 n0Var, i1 i1Var, int i7) {
        this.f55329a = i7;
        this.f55330b = n0Var;
        this.f55331c = i1Var;
    }

    @Override
    public final void run() {
        e2.l1 l1Var;
        switch (this.f55329a) {
            case 0:
                n0 n0Var = this.f55330b;
                q4.q qVar = n0Var.f55386n;
                i1 i1Var = this.f55331c;
                qVar.f(n0Var.h0(i1Var));
                qe qeVar = n0Var.f55382j;
                if (i1Var.t().a(17)) {
                    l1Var = i1Var.y0();
                } else {
                    l1Var = e2.l1.f10537a;
                }
                qeVar.w(l1Var);
                return;
            default:
                n0 n0Var2 = this.f55330b;
                n0Var2.f55386n.f(n0Var2.h0(this.f55331c));
                return;
        }
    }
}

package p4;

import org.telegram.messenger.qe;
public final class h0 implements Runnable {
    public final int f55277a;
    public final m0 f55278b;
    public final i1 f55279c;

    public h0(m0 m0Var, i1 i1Var, int i7) {
        this.f55277a = i7;
        this.f55278b = m0Var;
        this.f55279c = i1Var;
    }

    @Override
    public final void run() {
        e2.l1 l1Var;
        switch (this.f55277a) {
            case 0:
                m0 m0Var = this.f55278b;
                q4.q qVar = m0Var.f55342n;
                i1 i1Var = this.f55279c;
                qVar.f(m0Var.h0(i1Var));
                qe qeVar = m0Var.f55338j;
                if (i1Var.t().a(17)) {
                    l1Var = i1Var.y0();
                } else {
                    l1Var = e2.l1.f10500a;
                }
                qeVar.w(l1Var);
                return;
            default:
                m0 m0Var2 = this.f55278b;
                m0Var2.f55342n.f(m0Var2.h0(this.f55279c));
                return;
        }
    }
}

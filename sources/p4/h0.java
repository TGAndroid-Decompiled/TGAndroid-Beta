package p4;

import org.telegram.messenger.qe;
public final class h0 implements Runnable {
    public final int f54705a;
    public final m0 f54706b;
    public final g1 f54707c;

    public h0(m0 m0Var, g1 g1Var, int i7) {
        this.f54705a = i7;
        this.f54706b = m0Var;
        this.f54707c = g1Var;
    }

    @Override
    public final void run() {
        e2.l1 l1Var;
        switch (this.f54705a) {
            case 0:
                m0 m0Var = this.f54706b;
                q4.q qVar = m0Var.f54787n;
                g1 g1Var = this.f54707c;
                qVar.f(m0Var.h0(g1Var));
                qe qeVar = m0Var.f54783j;
                if (g1Var.t().a(17)) {
                    l1Var = g1Var.y0();
                } else {
                    l1Var = e2.l1.f10190a;
                }
                qeVar.w(l1Var);
                return;
            default:
                m0 m0Var2 = this.f54706b;
                m0Var2.f54787n.f(m0Var2.h0(this.f54707c));
                return;
        }
    }
}

package p4;

import org.telegram.messenger.re;
public final class h0 implements Runnable {
    public final int f53300a;
    public final m0 f53301b;
    public final g1 f53302c;

    public h0(m0 m0Var, g1 g1Var, int i7) {
        this.f53300a = i7;
        this.f53301b = m0Var;
        this.f53302c = g1Var;
    }

    @Override
    public final void run() {
        e2.l1 l1Var;
        switch (this.f53300a) {
            case 0:
                m0 m0Var = this.f53301b;
                q4.q qVar = m0Var.f53382n;
                g1 g1Var = this.f53302c;
                qVar.f(m0Var.h0(g1Var));
                re reVar = m0Var.f53378j;
                if (g1Var.t().a(17)) {
                    l1Var = g1Var.y0();
                } else {
                    l1Var = e2.l1.f10354a;
                }
                reVar.w(l1Var);
                return;
            default:
                m0 m0Var2 = this.f53301b;
                m0Var2.f53382n.f(m0Var2.h0(this.f53302c));
                return;
        }
    }
}

package p4;

import org.telegram.messenger.pe;
public final class h0 implements Runnable {
    public final int f55267a;
    public final m0 f55268b;
    public final i1 f55269c;

    public h0(m0 m0Var, i1 i1Var, int i7) {
        this.f55267a = i7;
        this.f55268b = m0Var;
        this.f55269c = i1Var;
    }

    @Override
    public final void run() {
        e2.l1 l1Var;
        switch (this.f55267a) {
            case 0:
                m0 m0Var = this.f55268b;
                q4.q qVar = m0Var.f55332n;
                i1 i1Var = this.f55269c;
                qVar.f(m0Var.h0(i1Var));
                pe peVar = m0Var.f55328j;
                if (i1Var.t().a(17)) {
                    l1Var = i1Var.y0();
                } else {
                    l1Var = e2.l1.f10505a;
                }
                peVar.w(l1Var);
                return;
            default:
                m0 m0Var2 = this.f55268b;
                m0Var2.f55332n.f(m0Var2.h0(this.f55269c));
                return;
        }
    }
}

package p4;

import org.telegram.messenger.pe;
public final class h0 implements Runnable {
    public final int f55398a;
    public final n0 f55399b;
    public final h1 f55400c;

    public h0(n0 n0Var, h1 h1Var, int i7) {
        this.f55398a = i7;
        this.f55399b = n0Var;
        this.f55400c = h1Var;
    }

    @Override
    public final void run() {
        e2.l1 l1Var;
        switch (this.f55398a) {
            case 0:
                n0 n0Var = this.f55399b;
                q4.q qVar = n0Var.f55487n;
                h1 h1Var = this.f55400c;
                qVar.f(n0Var.h0(h1Var));
                pe peVar = n0Var.f55483j;
                if (h1Var.u().a(17)) {
                    l1Var = h1Var.z0();
                } else {
                    l1Var = e2.l1.f10498a;
                }
                peVar.w(l1Var);
                return;
            default:
                n0 n0Var2 = this.f55399b;
                n0Var2.f55487n.f(n0Var2.h0(this.f55400c));
                return;
        }
    }
}

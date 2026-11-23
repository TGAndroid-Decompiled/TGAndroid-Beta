package wg;

import org.telegram.messenger.k10;
import ug.h1;
public final class e0 implements Runnable {
    public final int f59786a;
    public final g0 f59787b;

    public e0(g0 g0Var, int i7) {
        this.f59786a = i7;
        this.f59787b = g0Var;
    }

    @Override
    public final void run() {
        switch (this.f59786a) {
            case 0:
                g0.m1(this.f59787b);
                return;
            default:
                g0 g0Var = this.f59787b;
                h1 h1Var = new h1(g0Var.f39535s1, k10.f24968t0, null, null, null, g0Var.J0);
                h1Var.F2 = true;
                h1Var.G2 = true;
                h1Var.Y1 = true;
                g0Var.f39535s1.showDialog(h1Var);
                return;
        }
    }
}

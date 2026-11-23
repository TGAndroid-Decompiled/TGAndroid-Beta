package wg;

import org.telegram.messenger.k10;
import ug.h1;
public final class e0 implements Runnable {
    public final int f59751a;
    public final g0 f59752b;

    public e0(g0 g0Var, int i7) {
        this.f59751a = i7;
        this.f59752b = g0Var;
    }

    @Override
    public final void run() {
        switch (this.f59751a) {
            case 0:
                g0.m1(this.f59752b);
                return;
            default:
                g0 g0Var = this.f59752b;
                h1 h1Var = new h1(g0Var.f39491s1, k10.f24932t0, null, null, null, g0Var.J0);
                h1Var.F2 = true;
                h1Var.G2 = true;
                h1Var.Y1 = true;
                g0Var.f39491s1.showDialog(h1Var);
                return;
        }
    }
}

package wg;

import org.telegram.messenger.j10;
import ug.i1;
public final class e0 implements Runnable {
    public final int f59761a;
    public final g0 f59762b;

    public e0(g0 g0Var, int i7) {
        this.f59761a = i7;
        this.f59762b = g0Var;
    }

    @Override
    public final void run() {
        switch (this.f59761a) {
            case 0:
                g0.m1(this.f59762b);
                return;
            default:
                g0 g0Var = this.f59762b;
                i1 i1Var = new i1(g0Var.f39538s1, j10.f24770t0, null, null, null, g0Var.J0);
                i1Var.F2 = true;
                i1Var.G2 = true;
                i1Var.Y1 = true;
                g0Var.f39538s1.showDialog(i1Var);
                return;
        }
    }
}

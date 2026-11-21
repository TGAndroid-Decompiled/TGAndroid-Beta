package wg;

import org.telegram.messenger.j10;
import ug.h1;
public final class e0 implements Runnable {
    public final int f59782a;
    public final g0 f59783b;

    public e0(g0 g0Var, int i7) {
        this.f59782a = i7;
        this.f59783b = g0Var;
    }

    @Override
    public final void run() {
        switch (this.f59782a) {
            case 0:
                g0.m1(this.f59783b);
                return;
            default:
                g0 g0Var = this.f59783b;
                h1 h1Var = new h1(g0Var.f39543s1, j10.f24798t0, null, null, null, g0Var.J0);
                h1Var.F2 = true;
                h1Var.G2 = true;
                h1Var.Y1 = true;
                g0Var.f39543s1.showDialog(h1Var);
                return;
        }
    }
}

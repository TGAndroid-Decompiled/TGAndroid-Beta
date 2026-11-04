package xg;

import org.telegram.messenger.h10;
import vg.h1;
public final class e0 implements Runnable {
    public final int f58671a;
    public final g0 f58672b;

    public e0(g0 g0Var, int i3) {
        this.f58671a = i3;
        this.f58672b = g0Var;
    }

    @Override
    public final void run() {
        switch (this.f58671a) {
            case 0:
                g0.l1(this.f58672b);
                return;
            default:
                g0 g0Var = this.f58672b;
                h1 h1Var = new h1(g0Var.f36105p1, h10.f22829t0, null, null, null, g0Var.J0);
                h1Var.C2 = true;
                h1Var.D2 = true;
                h1Var.V1 = true;
                g0Var.f36105p1.showDialog(h1Var);
                return;
        }
    }
}

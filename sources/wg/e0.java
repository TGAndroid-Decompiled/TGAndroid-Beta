package wg;

import org.telegram.messenger.p10;
public final class e0 implements Runnable {
    public final int f57718a;
    public final g0 f57719b;

    public e0(g0 g0Var, int i7) {
        this.f57718a = i7;
        this.f57719b = g0Var;
    }

    @Override
    public final void run() {
        switch (this.f57718a) {
            case 0:
                g0.l1(this.f57719b);
                return;
            default:
                g0 g0Var = this.f57719b;
                ug.f1 f1Var = new ug.f1(g0Var.f35905r1, p10.f24474s0, null, null, null, g0Var.I0);
                f1Var.E2 = true;
                f1Var.F2 = true;
                f1Var.X1 = true;
                g0Var.f35905r1.showDialog(f1Var);
                return;
        }
    }
}

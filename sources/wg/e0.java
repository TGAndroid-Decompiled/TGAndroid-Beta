package wg;

import org.telegram.messenger.p10;
public final class e0 implements Runnable {
    public final int f57721a;
    public final g0 f57722b;

    public e0(g0 g0Var, int i7) {
        this.f57721a = i7;
        this.f57722b = g0Var;
    }

    @Override
    public final void run() {
        switch (this.f57721a) {
            case 0:
                g0.l1(this.f57722b);
                return;
            default:
                g0 g0Var = this.f57722b;
                ug.f1 f1Var = new ug.f1(g0Var.f36279o1, p10.f24470s0, null, null, null, g0Var.I0);
                f1Var.B2 = true;
                f1Var.C2 = true;
                f1Var.U1 = true;
                g0Var.f36279o1.showDialog(f1Var);
                return;
        }
    }
}

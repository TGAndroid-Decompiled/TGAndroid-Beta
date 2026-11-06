package wg;

import org.telegram.messenger.p10;
public final class e0 implements Runnable {
    public final int f57628a;
    public final g0 f57629b;

    public e0(g0 g0Var, int i7) {
        this.f57628a = i7;
        this.f57629b = g0Var;
    }

    @Override
    public final void run() {
        switch (this.f57628a) {
            case 0:
                g0.l1(this.f57629b);
                return;
            default:
                g0 g0Var = this.f57629b;
                ug.f1 f1Var = new ug.f1(g0Var.f36263o1, p10.f24467s0, null, null, null, g0Var.I0);
                f1Var.B2 = true;
                f1Var.C2 = true;
                f1Var.U1 = true;
                g0Var.f36263o1.showDialog(f1Var);
                return;
        }
    }
}

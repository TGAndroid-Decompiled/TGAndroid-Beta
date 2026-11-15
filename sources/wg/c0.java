package wg;

import org.telegram.messenger.m10;
import ug.g1;
public final class c0 implements Runnable {
    public final int f59142a;
    public final e0 f59143b;

    public c0(e0 e0Var, int i7) {
        this.f59142a = i7;
        this.f59143b = e0Var;
    }

    @Override
    public final void run() {
        switch (this.f59142a) {
            case 0:
                e0.l1(this.f59143b);
                return;
            default:
                e0 e0Var = this.f59143b;
                g1 g1Var = new g1(e0Var.f35940s1, m10.f24934t0, null, null, null, e0Var.J0);
                g1Var.F2 = true;
                g1Var.G2 = true;
                g1Var.Y1 = true;
                e0Var.f35940s1.showDialog(g1Var);
                return;
        }
    }
}

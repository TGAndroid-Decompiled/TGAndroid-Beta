package wg;

import org.telegram.messenger.i10;
import ug.h1;
public final class d0 implements Runnable {
    public final int f59846a;
    public final f0 f59847b;

    public d0(f0 f0Var, int i7) {
        this.f59846a = i7;
        this.f59847b = f0Var;
    }

    @Override
    public final void run() {
        switch (this.f59846a) {
            case 0:
                f0.m1(this.f59847b);
                return;
            default:
                f0 f0Var = this.f59847b;
                h1 h1Var = new h1(f0Var.f39250s1, i10.f24637t0, null, null, null, f0Var.J0);
                h1Var.F2 = true;
                h1Var.G2 = true;
                h1Var.Y1 = true;
                f0Var.f39250s1.showDialog(h1Var);
                return;
        }
    }
}

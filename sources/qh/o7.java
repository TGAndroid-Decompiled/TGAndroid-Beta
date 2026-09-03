package qh;

import org.telegram.ui.Components.ic;
public final class o7 implements Runnable {
    public final int f45840a;
    public final w7 f45841b;

    public o7(w7 w7Var, int i10) {
        this.f45840a = i10;
        this.f45841b = w7Var;
    }

    @Override
    public final void run() {
        switch (this.f45840a) {
            case 0:
                c8 c8Var = this.f45841b.T;
                ic.h(c8Var.container);
                c8.D(c8Var);
                return;
            case 1:
                w7 w7Var = this.f45841b;
                w7Var.v.setLoading(false);
                c8 c8Var2 = w7Var.T;
                c8Var2.f1();
                c8Var2.f45187b.D(0);
                return;
            case 2:
                this.f45841b.R = false;
                return;
            case 3:
                c8 c8Var3 = this.f45841b.T;
                c8Var3.J = 6;
                c8Var3.f45187b.D(1);
                return;
            case 4:
                w7 w7Var2 = this.f45841b;
                w7Var2.f46267n.m(2);
                w7Var2.f46266f.forceLayout();
                w7Var2.j();
                return;
            default:
                w7 w7Var3 = this.f45841b;
                c8 c8Var4 = w7Var3.T;
                if (w7Var3.f46262a == 0) {
                    c8Var4.dismiss();
                    return;
                } else {
                    c8Var4.onBackPressed();
                    return;
                }
        }
    }
}

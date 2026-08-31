package qh;

import org.telegram.ui.Components.ic;
public final class p7 implements Runnable {
    public final int f45881a;
    public final x7 f45882b;

    public p7(x7 x7Var, int i10) {
        this.f45881a = i10;
        this.f45882b = x7Var;
    }

    @Override
    public final void run() {
        switch (this.f45881a) {
            case 0:
                d8 d8Var = this.f45882b.T;
                ic.h(d8Var.container);
                d8.D(d8Var);
                return;
            case 1:
                x7 x7Var = this.f45882b;
                x7Var.v.setLoading(false);
                d8 d8Var2 = x7Var.T;
                d8Var2.f1();
                d8Var2.f45222b.D(0);
                return;
            case 2:
                this.f45882b.R = false;
                return;
            case 3:
                d8 d8Var3 = this.f45882b.T;
                d8Var3.J = 6;
                d8Var3.f45222b.D(1);
                return;
            case 4:
                x7 x7Var2 = this.f45882b;
                x7Var2.f46294n.m(2);
                x7Var2.f46293f.forceLayout();
                x7Var2.j();
                return;
            default:
                x7 x7Var3 = this.f45882b;
                d8 d8Var4 = x7Var3.T;
                if (x7Var3.f46289a == 0) {
                    d8Var4.dismiss();
                    return;
                } else {
                    d8Var4.onBackPressed();
                    return;
                }
        }
    }
}

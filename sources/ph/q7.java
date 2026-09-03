package ph;

import org.telegram.ui.Components.ic;
public final class q7 implements Runnable {
    public final int f42248a;
    public final y7 f42249b;

    public q7(y7 y7Var, int i10) {
        this.f42248a = i10;
        this.f42249b = y7Var;
    }

    @Override
    public final void run() {
        switch (this.f42248a) {
            case 0:
                e8 e8Var = this.f42249b.T;
                ic.h(e8Var.container);
                e8.D(e8Var);
                return;
            case 1:
                y7 y7Var = this.f42249b;
                y7Var.v.setLoading(false);
                e8 e8Var2 = y7Var.T;
                e8Var2.f1();
                e8Var2.f41621b.D(0);
                return;
            case 2:
                this.f42249b.R = false;
                return;
            case 3:
                e8 e8Var3 = this.f42249b.T;
                e8Var3.J = 6;
                e8Var3.f41621b.D(1);
                return;
            case 4:
                y7 y7Var2 = this.f42249b;
                y7Var2.f42662n.m(2);
                y7Var2.f42661f.forceLayout();
                y7Var2.j();
                return;
            default:
                y7 y7Var3 = this.f42249b;
                e8 e8Var4 = y7Var3.T;
                if (y7Var3.f42658a == 0) {
                    e8Var4.dismiss();
                    return;
                } else {
                    e8Var4.onBackPressed();
                    return;
                }
        }
    }
}

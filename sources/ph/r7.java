package ph;

import org.telegram.ui.Components.ic;
public final class r7 implements Runnable {
    public final int f42252a;
    public final z7 f42253b;

    public r7(z7 z7Var, int i10) {
        this.f42252a = i10;
        this.f42253b = z7Var;
    }

    @Override
    public final void run() {
        switch (this.f42252a) {
            case 0:
                f8 f8Var = this.f42253b.T;
                ic.h(f8Var.container);
                f8.D(f8Var);
                return;
            case 1:
                z7 z7Var = this.f42253b;
                z7Var.v.setLoading(false);
                f8 f8Var2 = z7Var.T;
                f8Var2.f1();
                f8Var2.f41657b.D(0);
                return;
            case 2:
                this.f42253b.R = false;
                return;
            case 3:
                f8 f8Var3 = this.f42253b.T;
                f8Var3.J = 6;
                f8Var3.f41657b.D(1);
                return;
            case 4:
                z7 z7Var2 = this.f42253b;
                z7Var2.f42664n.m(2);
                z7Var2.f42663f.forceLayout();
                z7Var2.j();
                return;
            default:
                z7 z7Var3 = this.f42253b;
                f8 f8Var4 = z7Var3.T;
                if (z7Var3.f42660a == 0) {
                    f8Var4.dismiss();
                    return;
                } else {
                    f8Var4.onBackPressed();
                    return;
                }
        }
    }
}

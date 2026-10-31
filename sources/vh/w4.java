package vh;

import org.telegram.messenger.q20;
public final class w4 implements q20 {
    public final int f52088a;
    public final a5 f52089b;

    public w4(a5 a5Var, int i10) {
        this.f52088a = i10;
        this.f52089b = a5Var;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        switch (this.f52088a) {
            case 0:
                z4 z4Var = (z4) obj;
                a5 a5Var = this.f52089b;
                a5Var.H = null;
                a5Var.E = z4Var;
                if (z4Var != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                a5Var.D = z10;
                a5Var.a();
                a5Var.invalidate();
                y6 y6Var = a5Var.f50907b;
                if (y6Var != null) {
                    y6Var.run();
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) obj;
                z4 z4Var2 = this.f52089b.E;
                if (z4Var2 != null || k2Var == null) {
                    z4Var2.c(k2Var);
                    return;
                }
                return;
        }
    }
}

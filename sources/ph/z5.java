package ph;

import org.telegram.messenger.Utilities;
public final class z5 implements Utilities.Callback {
    public final int f42658a;
    public final d6 f42659b;

    public z5(d6 d6Var, int i10) {
        this.f42658a = i10;
        this.f42659b = d6Var;
    }

    @Override
    public final void run(Object obj) {
        boolean z4;
        switch (this.f42658a) {
            case 0:
                c6 c6Var = (c6) obj;
                d6 d6Var = this.f42659b;
                d6Var.E = null;
                d6Var.B = c6Var;
                if (c6Var != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                d6Var.f41453y = z4;
                d6Var.a();
                d6Var.invalidate();
                h8 h8Var = d6Var.f41445b;
                if (h8Var != null) {
                    h8Var.run();
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                c6 c6Var2 = this.f42659b.B;
                if (c6Var2 != null || p2Var == null) {
                    c6Var2.c(p2Var);
                    return;
                }
                return;
        }
    }
}

package qh;

import org.telegram.messenger.Utilities;
public final class w5 implements Utilities.Callback {
    public final int f46260a;
    public final a6 f46261b;

    public w5(a6 a6Var, int i10) {
        this.f46260a = i10;
        this.f46261b = a6Var;
    }

    @Override
    public final void run(Object obj) {
        boolean z4;
        switch (this.f46260a) {
            case 0:
                z5 z5Var = (z5) obj;
                a6 a6Var = this.f46261b;
                a6Var.E = null;
                a6Var.B = z5Var;
                if (z5Var != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                a6Var.f44981y = z4;
                a6Var.a();
                a6Var.invalidate();
                f8 f8Var = a6Var.f44972b;
                if (f8Var != null) {
                    f8Var.run();
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                z5 z5Var2 = this.f46261b.B;
                if (z5Var2 != null || p2Var == null) {
                    z5Var2.c(p2Var);
                    return;
                }
                return;
        }
    }
}

package qh;

import org.telegram.messenger.Utilities;
public final class x5 implements Utilities.Callback {
    public final int f46287a;
    public final b6 f46288b;

    public x5(b6 b6Var, int i10) {
        this.f46287a = i10;
        this.f46288b = b6Var;
    }

    @Override
    public final void run(Object obj) {
        boolean z4;
        switch (this.f46287a) {
            case 0:
                a6 a6Var = (a6) obj;
                b6 b6Var = this.f46288b;
                b6Var.E = null;
                b6Var.B = a6Var;
                if (a6Var != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                b6Var.f45004y = z4;
                b6Var.a();
                b6Var.invalidate();
                g8 g8Var = b6Var.f44995b;
                if (g8Var != null) {
                    g8Var.run();
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                a6 a6Var2 = this.f46288b.B;
                if (a6Var2 != null || p2Var == null) {
                    a6Var2.c(p2Var);
                    return;
                }
                return;
        }
    }
}

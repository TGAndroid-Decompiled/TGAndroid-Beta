package ph;

import org.telegram.messenger.Utilities;
public final class y5 implements Utilities.Callback {
    public final int f42656a;
    public final c6 f42657b;

    public y5(c6 c6Var, int i10) {
        this.f42656a = i10;
        this.f42657b = c6Var;
    }

    @Override
    public final void run(Object obj) {
        boolean z4;
        switch (this.f42656a) {
            case 0:
                b6 b6Var = (b6) obj;
                c6 c6Var = this.f42657b;
                c6Var.E = null;
                c6Var.B = b6Var;
                if (b6Var != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                c6Var.f41424y = z4;
                c6Var.a();
                c6Var.invalidate();
                g8 g8Var = c6Var.f41416b;
                if (g8Var != null) {
                    g8Var.run();
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                b6 b6Var2 = this.f42657b.B;
                if (b6Var2 != null || p2Var == null) {
                    b6Var2.c(p2Var);
                    return;
                }
                return;
        }
    }
}

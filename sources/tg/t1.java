package tg;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.w7;
import org.telegram.ui.Components.dz0;
public final class t1 implements Runnable {
    public final int f55959a;
    public final c2 f55960b;

    public t1(c2 c2Var, int i7) {
        this.f55959a = i7;
        this.f55960b = c2Var;
    }

    @Override
    public final void run() {
        switch (this.f55959a) {
            case 0:
                c2 c2Var = this.f55960b;
                a2 a2Var = c2Var.W;
                if (a2Var != null) {
                    if (a2Var.f55573r != null) {
                        MediaController.B().i(c2Var.W.f55573r);
                        w7.G(c2Var.f55589a).b(c2Var.W.f55559b, false);
                        c2Var.W.getClass();
                    }
                    c2Var.W.a();
                    c2Var.W = null;
                }
                c2Var.f55595d0.a();
                c2Var.f55595d0 = null;
                return;
            default:
                c2 c2Var2 = this.f55960b;
                dz0 dz0Var = c2Var2.S;
                if (dz0Var != null) {
                    c2Var2.S = null;
                    c2Var2.removeView(dz0Var);
                    return;
                }
                return;
        }
    }
}

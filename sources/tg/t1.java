package tg;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.w7;
import org.telegram.ui.Components.dz0;
public final class t1 implements Runnable {
    public final int f55970a;
    public final c2 f55971b;

    public t1(c2 c2Var, int i7) {
        this.f55970a = i7;
        this.f55971b = c2Var;
    }

    @Override
    public final void run() {
        switch (this.f55970a) {
            case 0:
                c2 c2Var = this.f55971b;
                a2 a2Var = c2Var.W;
                if (a2Var != null) {
                    if (a2Var.f55584r != null) {
                        MediaController.B().i(c2Var.W.f55584r);
                        w7.G(c2Var.f55600a).b(c2Var.W.f55570b, false);
                        c2Var.W.getClass();
                    }
                    c2Var.W.a();
                    c2Var.W = null;
                }
                c2Var.f55606d0.a();
                c2Var.f55606d0 = null;
                return;
            default:
                c2 c2Var2 = this.f55971b;
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

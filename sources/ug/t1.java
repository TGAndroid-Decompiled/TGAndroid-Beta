package ug;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.w7;
import org.telegram.ui.Components.cz0;
public final class t1 implements Runnable {
    public final int f56272a;
    public final c2 f56273b;

    public t1(c2 c2Var, int i3) {
        this.f56272a = i3;
        this.f56273b = c2Var;
    }

    @Override
    public final void run() {
        switch (this.f56272a) {
            case 0:
                c2 c2Var = this.f56273b;
                a2 a2Var = c2Var.f55896a0;
                if (a2Var != null) {
                    if (a2Var.f55878r != null) {
                        MediaController.B().i(c2Var.f55896a0.f55878r);
                        w7.G(c2Var.f55895a).b(c2Var.f55896a0.f55864b, false);
                        c2Var.f55896a0.getClass();
                    }
                    c2Var.f55896a0.a();
                    c2Var.f55896a0 = null;
                }
                c2Var.f55903e0.a();
                c2Var.f55903e0 = null;
                return;
            default:
                c2 c2Var2 = this.f56273b;
                cz0 cz0Var = c2Var2.T;
                if (cz0Var != null) {
                    c2Var2.T = null;
                    c2Var2.removeView(cz0Var);
                    return;
                }
                return;
        }
    }
}

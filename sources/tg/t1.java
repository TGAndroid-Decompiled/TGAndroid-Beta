package tg;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.w7;
import org.telegram.ui.Components.ez0;
public final class t1 implements Runnable {
    public final int f55971a;
    public final c2 f55972b;

    public t1(c2 c2Var, int i7) {
        this.f55971a = i7;
        this.f55972b = c2Var;
    }

    @Override
    public final void run() {
        switch (this.f55971a) {
            case 0:
                c2 c2Var = this.f55972b;
                a2 a2Var = c2Var.W;
                if (a2Var != null) {
                    if (a2Var.f55585r != null) {
                        MediaController.B().i(c2Var.W.f55585r);
                        w7.G(c2Var.f55601a).b(c2Var.W.f55571b, false);
                        c2Var.W.getClass();
                    }
                    c2Var.W.a();
                    c2Var.W = null;
                }
                c2Var.f55607d0.a();
                c2Var.f55607d0 = null;
                return;
            default:
                c2 c2Var2 = this.f55972b;
                ez0 ez0Var = c2Var2.S;
                if (ez0Var != null) {
                    c2Var2.S = null;
                    c2Var2.removeView(ez0Var);
                    return;
                }
                return;
        }
    }
}

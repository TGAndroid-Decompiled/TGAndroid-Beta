package tg;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.w7;
import org.telegram.ui.Components.cz0;
public final class t1 implements Runnable {
    public final int f55842a;
    public final c2 f55843b;

    public t1(c2 c2Var, int i7) {
        this.f55842a = i7;
        this.f55843b = c2Var;
    }

    @Override
    public final void run() {
        switch (this.f55842a) {
            case 0:
                c2 c2Var = this.f55843b;
                a2 a2Var = c2Var.W;
                if (a2Var != null) {
                    if (a2Var.f55456r != null) {
                        MediaController.B().i(c2Var.W.f55456r);
                        w7.G(c2Var.f55472a).b(c2Var.W.f55442b, false);
                        c2Var.W.getClass();
                    }
                    c2Var.W.a();
                    c2Var.W = null;
                }
                c2Var.f55478d0.a();
                c2Var.f55478d0 = null;
                return;
            default:
                c2 c2Var2 = this.f55843b;
                cz0 cz0Var = c2Var2.S;
                if (cz0Var != null) {
                    c2Var2.S = null;
                    c2Var2.removeView(cz0Var);
                    return;
                }
                return;
        }
    }
}

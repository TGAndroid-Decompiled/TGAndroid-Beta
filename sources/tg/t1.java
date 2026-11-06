package tg;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.w7;
import org.telegram.ui.Components.cz0;
public final class t1 implements Runnable {
    public final int f55867a;
    public final c2 f55868b;

    public t1(c2 c2Var, int i7) {
        this.f55867a = i7;
        this.f55868b = c2Var;
    }

    @Override
    public final void run() {
        switch (this.f55867a) {
            case 0:
                c2 c2Var = this.f55868b;
                a2 a2Var = c2Var.W;
                if (a2Var != null) {
                    if (a2Var.f55481r != null) {
                        MediaController.B().i(c2Var.W.f55481r);
                        w7.G(c2Var.f55497a).b(c2Var.W.f55467b, false);
                        c2Var.W.getClass();
                    }
                    c2Var.W.a();
                    c2Var.W = null;
                }
                c2Var.f55503d0.a();
                c2Var.f55503d0 = null;
                return;
            default:
                c2 c2Var2 = this.f55868b;
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

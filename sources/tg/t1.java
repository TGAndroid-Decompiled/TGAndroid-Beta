package tg;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.w7;
import org.telegram.ui.Components.fz0;
public final class t1 implements Runnable {
    public final int f57569a;
    public final e2 f57570b;

    public t1(e2 e2Var, int i7) {
        this.f57569a = i7;
        this.f57570b = e2Var;
    }

    @Override
    public final void run() {
        switch (this.f57569a) {
            case 0:
                e2 e2Var = this.f57570b;
                c2 c2Var = e2Var.f57230a0;
                if (c2Var != null) {
                    if (c2Var.f57196r != null) {
                        MediaController.B().i(e2Var.f57230a0.f57196r);
                        w7.G(e2Var.f57229a).b(e2Var.f57230a0.f57182b, false);
                        e2Var.f57230a0.getClass();
                    }
                    e2Var.f57230a0.a();
                    e2Var.f57230a0 = null;
                }
                e2Var.f57237e0.a();
                e2Var.f57237e0 = null;
                return;
            default:
                e2 e2Var2 = this.f57570b;
                fz0 fz0Var = e2Var2.T;
                if (fz0Var != null) {
                    e2Var2.T = null;
                    e2Var2.removeView(fz0Var);
                    return;
                }
                return;
        }
    }
}

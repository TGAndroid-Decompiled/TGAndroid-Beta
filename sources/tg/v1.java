package tg;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.w7;
import org.telegram.ui.Components.oz0;
public final class v1 implements Runnable {
    public final int f58209a;
    public final f2 f58210b;

    public v1(f2 f2Var, int i7) {
        this.f58209a = i7;
        this.f58210b = f2Var;
    }

    @Override
    public final void run() {
        switch (this.f58209a) {
            case 0:
                f2 f2Var = this.f58210b;
                d2 d2Var = f2Var.f57862a0;
                if (d2Var != null) {
                    if (d2Var.f57831r != null) {
                        MediaController.B().i(f2Var.f57862a0.f57831r);
                        w7.G(f2Var.f57861a).b(f2Var.f57862a0.f57817b, false);
                        f2Var.f57862a0.getClass();
                    }
                    f2Var.f57862a0.a();
                    f2Var.f57862a0 = null;
                }
                f2Var.f57869e0.a();
                f2Var.f57869e0 = null;
                return;
            default:
                f2 f2Var2 = this.f58210b;
                oz0 oz0Var = f2Var2.T;
                if (oz0Var != null) {
                    f2Var2.T = null;
                    f2Var2.removeView(oz0Var);
                    return;
                }
                return;
        }
    }
}

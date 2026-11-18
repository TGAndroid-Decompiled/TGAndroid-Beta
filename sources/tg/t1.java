package tg;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.w7;
import org.telegram.ui.Components.mz0;
public final class t1 implements Runnable {
    public final int f58136a;
    public final e2 f58137b;

    public t1(e2 e2Var, int i7) {
        this.f58136a = i7;
        this.f58137b = e2Var;
    }

    @Override
    public final void run() {
        switch (this.f58136a) {
            case 0:
                e2 e2Var = this.f58137b;
                c2 c2Var = e2Var.f57802a0;
                if (c2Var != null) {
                    if (c2Var.f57768r != null) {
                        MediaController.B().i(e2Var.f57802a0.f57768r);
                        w7.G(e2Var.f57801a).b(e2Var.f57802a0.f57754b, false);
                        e2Var.f57802a0.getClass();
                    }
                    e2Var.f57802a0.a();
                    e2Var.f57802a0 = null;
                }
                e2Var.f57809e0.a();
                e2Var.f57809e0 = null;
                return;
            default:
                e2 e2Var2 = this.f58137b;
                mz0 mz0Var = e2Var2.T;
                if (mz0Var != null) {
                    e2Var2.T = null;
                    e2Var2.removeView(mz0Var);
                    return;
                }
                return;
        }
    }
}

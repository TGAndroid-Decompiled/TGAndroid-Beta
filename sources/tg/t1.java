package tg;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.w7;
import org.telegram.ui.Components.fz0;
public final class t1 implements Runnable {
    public final int f57567a;
    public final f2 f57568b;

    public t1(f2 f2Var, int i7) {
        this.f57567a = i7;
        this.f57568b = f2Var;
    }

    @Override
    public final void run() {
        switch (this.f57567a) {
            case 0:
                f2 f2Var = this.f57568b;
                d2 d2Var = f2Var.f57239a0;
                if (d2Var != null) {
                    if (d2Var.f57203r != null) {
                        MediaController.B().i(f2Var.f57239a0.f57203r);
                        w7.G(f2Var.f57238a).b(f2Var.f57239a0.f57189b, false);
                        f2Var.f57239a0.getClass();
                    }
                    f2Var.f57239a0.a();
                    f2Var.f57239a0 = null;
                }
                f2Var.f57246e0.a();
                f2Var.f57246e0 = null;
                return;
            default:
                f2 f2Var2 = this.f57568b;
                fz0 fz0Var = f2Var2.T;
                if (fz0Var != null) {
                    f2Var2.T = null;
                    f2Var2.removeView(fz0Var);
                    return;
                }
                return;
        }
    }
}

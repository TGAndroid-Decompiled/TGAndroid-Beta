package tg;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.w7;
import org.telegram.ui.Components.oz0;
public final class v1 implements Runnable {
    public final int f58174a;
    public final f2 f58175b;

    public v1(f2 f2Var, int i7) {
        this.f58174a = i7;
        this.f58175b = f2Var;
    }

    @Override
    public final void run() {
        switch (this.f58174a) {
            case 0:
                f2 f2Var = this.f58175b;
                d2 d2Var = f2Var.f57827a0;
                if (d2Var != null) {
                    if (d2Var.f57796r != null) {
                        MediaController.B().i(f2Var.f57827a0.f57796r);
                        w7.G(f2Var.f57826a).b(f2Var.f57827a0.f57782b, false);
                        f2Var.f57827a0.getClass();
                    }
                    f2Var.f57827a0.a();
                    f2Var.f57827a0 = null;
                }
                f2Var.f57834e0.a();
                f2Var.f57834e0 = null;
                return;
            default:
                f2 f2Var2 = this.f58175b;
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

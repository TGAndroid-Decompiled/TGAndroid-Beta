package tg;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.w7;
import org.telegram.ui.Components.oz0;
public final class v1 implements Runnable {
    public final int f58205a;
    public final f2 f58206b;

    public v1(f2 f2Var, int i7) {
        this.f58205a = i7;
        this.f58206b = f2Var;
    }

    @Override
    public final void run() {
        switch (this.f58205a) {
            case 0:
                f2 f2Var = this.f58206b;
                d2 d2Var = f2Var.f57858a0;
                if (d2Var != null) {
                    if (d2Var.f57827r != null) {
                        MediaController.B().i(f2Var.f57858a0.f57827r);
                        w7.G(f2Var.f57857a).b(f2Var.f57858a0.f57813b, false);
                        f2Var.f57858a0.getClass();
                    }
                    f2Var.f57858a0.a();
                    f2Var.f57858a0 = null;
                }
                f2Var.f57865e0.a();
                f2Var.f57865e0 = null;
                return;
            default:
                f2 f2Var2 = this.f58206b;
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

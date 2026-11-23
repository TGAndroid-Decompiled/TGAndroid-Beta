package tg;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.w7;
import org.telegram.ui.Components.nz0;
public final class y1 implements Runnable {
    public final int f58307a;
    public final i2 f58308b;

    public y1(i2 i2Var, int i7) {
        this.f58307a = i7;
        this.f58308b = i2Var;
    }

    @Override
    public final void run() {
        switch (this.f58307a) {
            case 0:
                i2 i2Var = this.f58308b;
                g2 g2Var = i2Var.f57959a0;
                if (g2Var != null) {
                    if (g2Var.f57934r != null) {
                        MediaController.B().i(i2Var.f57959a0.f57934r);
                        w7.G(i2Var.f57958a).b(i2Var.f57959a0.f57920b, false);
                        i2Var.f57959a0.getClass();
                    }
                    i2Var.f57959a0.a();
                    i2Var.f57959a0 = null;
                }
                i2Var.f57966e0.a();
                i2Var.f57966e0 = null;
                return;
            default:
                i2 i2Var2 = this.f58308b;
                nz0 nz0Var = i2Var2.T;
                if (nz0Var != null) {
                    i2Var2.T = null;
                    i2Var2.removeView(nz0Var);
                    return;
                }
                return;
        }
    }
}

package rg;

import android.os.Looper;
import org.telegram.ui.Components.cy0;
public final class z0 implements Runnable {
    public final int f47606a;
    public final a1 f47607b;

    public z0(a1 a1Var, int i10) {
        this.f47606a = i10;
        this.f47607b = a1Var;
    }

    @Override
    public final void run() {
        switch (this.f47606a) {
            case 0:
                a1 a1Var = this.f47607b;
                cy0 cy0Var = a1Var.f47366w;
                z0 z0Var = a1Var.f47365s;
                if (z0Var != null) {
                    a1Var.cancelRunnable(z0Var);
                    a1Var.f47365s = null;
                }
                a1Var.cancelRunnable(cy0Var);
                a1Var.postRunnable(cy0Var);
                return;
            case 1:
                a1 a1Var2 = this.f47607b;
                a1Var2.f47365s = null;
                a1Var2.f47366w.run();
                return;
            default:
                this.f47607b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
        }
    }
}

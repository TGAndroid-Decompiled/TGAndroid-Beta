package rg;

import android.os.Looper;
import org.telegram.ui.Components.dy0;
public final class z0 implements Runnable {
    public final int f47641a;
    public final a1 f47642b;

    public z0(a1 a1Var, int i10) {
        this.f47641a = i10;
        this.f47642b = a1Var;
    }

    @Override
    public final void run() {
        switch (this.f47641a) {
            case 0:
                a1 a1Var = this.f47642b;
                dy0 dy0Var = a1Var.f47401w;
                z0 z0Var = a1Var.f47400s;
                if (z0Var != null) {
                    a1Var.cancelRunnable(z0Var);
                    a1Var.f47400s = null;
                }
                a1Var.cancelRunnable(dy0Var);
                a1Var.postRunnable(dy0Var);
                return;
            case 1:
                a1 a1Var2 = this.f47642b;
                a1Var2.f47400s = null;
                a1Var2.f47401w.run();
                return;
            default:
                this.f47642b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
        }
    }
}

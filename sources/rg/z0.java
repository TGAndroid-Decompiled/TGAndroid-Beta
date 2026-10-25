package rg;

import android.os.Looper;
import org.telegram.ui.Components.cy0;
public final class z0 implements Runnable {
    public final int f47603a;
    public final a1 f47604b;

    public z0(a1 a1Var, int i10) {
        this.f47603a = i10;
        this.f47604b = a1Var;
    }

    @Override
    public final void run() {
        switch (this.f47603a) {
            case 0:
                a1 a1Var = this.f47604b;
                cy0 cy0Var = a1Var.f47363w;
                z0 z0Var = a1Var.f47362s;
                if (z0Var != null) {
                    a1Var.cancelRunnable(z0Var);
                    a1Var.f47362s = null;
                }
                a1Var.cancelRunnable(cy0Var);
                a1Var.postRunnable(cy0Var);
                return;
            case 1:
                a1 a1Var2 = this.f47604b;
                a1Var2.f47362s = null;
                a1Var2.f47363w.run();
                return;
            default:
                this.f47604b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
        }
    }
}

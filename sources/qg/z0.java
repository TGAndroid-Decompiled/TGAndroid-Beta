package qg;

import android.os.Looper;
import org.telegram.ui.Cells.l7;
public final class z0 implements Runnable {
    public final int f44635a;
    public final a1 f44636b;

    public z0(a1 a1Var, int i10) {
        this.f44635a = i10;
        this.f44636b = a1Var;
    }

    @Override
    public final void run() {
        switch (this.f44635a) {
            case 0:
                a1 a1Var = this.f44636b;
                l7 l7Var = a1Var.f44377w;
                z0 z0Var = a1Var.f44376s;
                if (z0Var != null) {
                    a1Var.cancelRunnable(z0Var);
                    a1Var.f44376s = null;
                }
                a1Var.cancelRunnable(l7Var);
                a1Var.postRunnable(l7Var);
                return;
            case 1:
                a1 a1Var2 = this.f44636b;
                a1Var2.f44376s = null;
                a1Var2.f44377w.run();
                return;
            default:
                this.f44636b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
        }
    }
}

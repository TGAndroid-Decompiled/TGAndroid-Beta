package qg;

import android.os.Looper;
import org.telegram.ui.Cells.l7;
public final class z0 implements Runnable {
    public final int f44663a;
    public final a1 f44664b;

    public z0(a1 a1Var, int i10) {
        this.f44663a = i10;
        this.f44664b = a1Var;
    }

    @Override
    public final void run() {
        switch (this.f44663a) {
            case 0:
                a1 a1Var = this.f44664b;
                l7 l7Var = a1Var.f44405w;
                z0 z0Var = a1Var.f44404s;
                if (z0Var != null) {
                    a1Var.cancelRunnable(z0Var);
                    a1Var.f44404s = null;
                }
                a1Var.cancelRunnable(l7Var);
                a1Var.postRunnable(l7Var);
                return;
            case 1:
                a1 a1Var2 = this.f44664b;
                a1Var2.f44404s = null;
                a1Var2.f44405w.run();
                return;
            default:
                this.f44664b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
        }
    }
}

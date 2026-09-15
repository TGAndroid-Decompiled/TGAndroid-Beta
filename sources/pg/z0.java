package pg;

import android.os.Looper;
import org.telegram.ui.Cells.l7;
public final class z0 implements Runnable {
    public final int f41052a;
    public final a1 f41053b;

    public z0(a1 a1Var, int i10) {
        this.f41052a = i10;
        this.f41053b = a1Var;
    }

    @Override
    public final void run() {
        switch (this.f41052a) {
            case 0:
                a1 a1Var = this.f41053b;
                l7 l7Var = a1Var.f40814w;
                z0 z0Var = a1Var.f40813s;
                if (z0Var != null) {
                    a1Var.cancelRunnable(z0Var);
                    a1Var.f40813s = null;
                }
                a1Var.cancelRunnable(l7Var);
                a1Var.postRunnable(l7Var);
                return;
            case 1:
                a1 a1Var2 = this.f41053b;
                a1Var2.f40813s = null;
                a1Var2.f40814w.run();
                return;
            default:
                this.f41053b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
        }
    }
}

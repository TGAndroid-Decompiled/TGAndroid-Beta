package pg;

import android.os.Looper;
import org.telegram.ui.Cells.l7;
public final class z0 implements Runnable {
    public final int f41079a;
    public final a1 f41080b;

    public z0(a1 a1Var, int i10) {
        this.f41079a = i10;
        this.f41080b = a1Var;
    }

    @Override
    public final void run() {
        switch (this.f41079a) {
            case 0:
                a1 a1Var = this.f41080b;
                l7 l7Var = a1Var.f40841w;
                z0 z0Var = a1Var.f40840s;
                if (z0Var != null) {
                    a1Var.cancelRunnable(z0Var);
                    a1Var.f40840s = null;
                }
                a1Var.cancelRunnable(l7Var);
                a1Var.postRunnable(l7Var);
                return;
            case 1:
                a1 a1Var2 = this.f41080b;
                a1Var2.f40840s = null;
                a1Var2.f40841w.run();
                return;
            default:
                this.f41080b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
        }
    }
}

package qg;

import android.os.Looper;
import org.telegram.ui.Cells.l7;
public final class z0 implements Runnable {
    public final int f44662a;
    public final a1 f44663b;

    public z0(a1 a1Var, int i10) {
        this.f44662a = i10;
        this.f44663b = a1Var;
    }

    @Override
    public final void run() {
        switch (this.f44662a) {
            case 0:
                a1 a1Var = this.f44663b;
                l7 l7Var = a1Var.f44404w;
                z0 z0Var = a1Var.f44403s;
                if (z0Var != null) {
                    a1Var.cancelRunnable(z0Var);
                    a1Var.f44403s = null;
                }
                a1Var.cancelRunnable(l7Var);
                a1Var.postRunnable(l7Var);
                return;
            case 1:
                a1 a1Var2 = this.f44663b;
                a1Var2.f44403s = null;
                a1Var2.f44404w.run();
                return;
            default:
                this.f44663b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
        }
    }
}

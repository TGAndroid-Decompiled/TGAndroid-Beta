package pg;

import android.os.Looper;
import org.telegram.ui.Cells.l7;
public final class a1 implements Runnable {
    public final int f40758a;
    public final b1 f40759b;

    public a1(b1 b1Var, int i10) {
        this.f40758a = i10;
        this.f40759b = b1Var;
    }

    @Override
    public final void run() {
        switch (this.f40758a) {
            case 0:
                b1 b1Var = this.f40759b;
                l7 l7Var = b1Var.f40770w;
                a1 a1Var = b1Var.f40769s;
                if (a1Var != null) {
                    b1Var.cancelRunnable(a1Var);
                    b1Var.f40769s = null;
                }
                b1Var.cancelRunnable(l7Var);
                b1Var.postRunnable(l7Var);
                return;
            case 1:
                b1 b1Var2 = this.f40759b;
                b1Var2.f40769s = null;
                b1Var2.f40770w.run();
                return;
            default:
                this.f40759b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
        }
    }
}

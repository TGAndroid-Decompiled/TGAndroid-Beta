package pg;

import android.os.Looper;
import org.telegram.ui.Cells.l7;
public final class z0 implements Runnable {
    public final int f41074a;
    public final a1 f41075b;

    public z0(a1 a1Var, int i10) {
        this.f41074a = i10;
        this.f41075b = a1Var;
    }

    @Override
    public final void run() {
        switch (this.f41074a) {
            case 0:
                a1 a1Var = this.f41075b;
                l7 l7Var = a1Var.f40836w;
                z0 z0Var = a1Var.f40835s;
                if (z0Var != null) {
                    a1Var.cancelRunnable(z0Var);
                    a1Var.f40835s = null;
                }
                a1Var.cancelRunnable(l7Var);
                a1Var.postRunnable(l7Var);
                return;
            case 1:
                a1 a1Var2 = this.f41075b;
                a1Var2.f40835s = null;
                a1Var2.f40836w.run();
                return;
            default:
                this.f41075b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
        }
    }
}

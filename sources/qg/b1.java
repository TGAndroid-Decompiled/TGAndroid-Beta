package qg;

import android.os.Looper;
import org.telegram.ui.Wallet.m4;
public final class b1 implements Runnable {
    public final int f44893a;
    public final c1 f44894b;

    public b1(c1 c1Var, int i10) {
        this.f44893a = i10;
        this.f44894b = c1Var;
    }

    @Override
    public final void run() {
        switch (this.f44893a) {
            case 0:
                c1 c1Var = this.f44894b;
                m4 m4Var = c1Var.f44905w;
                b1 b1Var = c1Var.f44904s;
                if (b1Var != null) {
                    c1Var.cancelRunnable(b1Var);
                    c1Var.f44904s = null;
                }
                c1Var.cancelRunnable(m4Var);
                c1Var.postRunnable(m4Var);
                return;
            case 1:
                c1 c1Var2 = this.f44894b;
                c1Var2.f44904s = null;
                c1Var2.f44905w.run();
                return;
            default:
                this.f44894b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
        }
    }
}

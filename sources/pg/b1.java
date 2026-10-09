package pg;

import android.os.Looper;
import org.telegram.ui.Wallet.n5;
public final class b1 implements Runnable {
    public final int f45591a;
    public final c1 f45592b;

    public b1(c1 c1Var, int i10) {
        this.f45591a = i10;
        this.f45592b = c1Var;
    }

    @Override
    public final void run() {
        switch (this.f45591a) {
            case 0:
                c1 c1Var = this.f45592b;
                n5 n5Var = c1Var.f45606w;
                b1 b1Var = c1Var.f45605s;
                if (b1Var != null) {
                    c1Var.cancelRunnable(b1Var);
                    c1Var.f45605s = null;
                }
                c1Var.cancelRunnable(n5Var);
                c1Var.postRunnable(n5Var);
                return;
            case 1:
                c1 c1Var2 = this.f45592b;
                c1Var2.f45605s = null;
                c1Var2.f45606w.run();
                return;
            default:
                this.f45592b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
        }
    }
}

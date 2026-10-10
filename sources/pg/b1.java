package pg;

import android.os.Looper;
import org.telegram.ui.Wallet.o5;
public final class b1 implements Runnable {
    public final int f45635a;
    public final c1 f45636b;

    public b1(c1 c1Var, int i10) {
        this.f45635a = i10;
        this.f45636b = c1Var;
    }

    @Override
    public final void run() {
        switch (this.f45635a) {
            case 0:
                c1 c1Var = this.f45636b;
                o5 o5Var = c1Var.f45650w;
                b1 b1Var = c1Var.f45649s;
                if (b1Var != null) {
                    c1Var.cancelRunnable(b1Var);
                    c1Var.f45649s = null;
                }
                c1Var.cancelRunnable(o5Var);
                c1Var.postRunnable(o5Var);
                return;
            case 1:
                c1 c1Var2 = this.f45636b;
                c1Var2.f45649s = null;
                c1Var2.f45650w.run();
                return;
            default:
                this.f45636b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
        }
    }
}

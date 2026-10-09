package pg;

import android.os.Looper;
import org.telegram.ui.Wallet.m5;
public final class b1 implements Runnable {
    public final int f45589a;
    public final c1 f45590b;

    public b1(c1 c1Var, int i10) {
        this.f45589a = i10;
        this.f45590b = c1Var;
    }

    @Override
    public final void run() {
        switch (this.f45589a) {
            case 0:
                c1 c1Var = this.f45590b;
                m5 m5Var = c1Var.f45604w;
                b1 b1Var = c1Var.f45603s;
                if (b1Var != null) {
                    c1Var.cancelRunnable(b1Var);
                    c1Var.f45603s = null;
                }
                c1Var.cancelRunnable(m5Var);
                c1Var.postRunnable(m5Var);
                return;
            case 1:
                c1 c1Var2 = this.f45590b;
                c1Var2.f45603s = null;
                c1Var2.f45604w.run();
                return;
            default:
                this.f45590b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
        }
    }
}

package pg;

import android.os.Looper;
import org.telegram.ui.Wallet.p5;
public final class b1 implements Runnable {
    public final int f45659a;
    public final c1 f45660b;

    public b1(c1 c1Var, int i10) {
        this.f45659a = i10;
        this.f45660b = c1Var;
    }

    @Override
    public final void run() {
        switch (this.f45659a) {
            case 0:
                c1 c1Var = this.f45660b;
                p5 p5Var = c1Var.f45674w;
                b1 b1Var = c1Var.f45673s;
                if (b1Var != null) {
                    c1Var.cancelRunnable(b1Var);
                    c1Var.f45673s = null;
                }
                c1Var.cancelRunnable(p5Var);
                c1Var.postRunnable(p5Var);
                return;
            case 1:
                c1 c1Var2 = this.f45660b;
                c1Var2.f45673s = null;
                c1Var2.f45674w.run();
                return;
            default:
                this.f45660b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
        }
    }
}

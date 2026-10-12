package qg;

import android.os.Looper;
import org.telegram.ui.Wallet.m5;
public final class z0 implements Runnable {
    public final int f43625a;
    public final a1 f43626b;

    public z0(a1 a1Var, int i10) {
        this.f43625a = i10;
        this.f43626b = a1Var;
    }

    @Override
    public final void run() {
        switch (this.f43625a) {
            case 0:
                a1 a1Var = this.f43626b;
                m5 m5Var = a1Var.f43387w;
                z0 z0Var = a1Var.f43386s;
                if (z0Var != null) {
                    a1Var.cancelRunnable(z0Var);
                    a1Var.f43386s = null;
                }
                a1Var.cancelRunnable(m5Var);
                a1Var.postRunnable(m5Var);
                return;
            case 1:
                a1 a1Var2 = this.f43626b;
                a1Var2.f43386s = null;
                a1Var2.f43387w.run();
                return;
            default:
                this.f43626b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
        }
    }
}

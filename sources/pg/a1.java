package pg;

import android.os.Looper;
public final class a1 implements Runnable {
    public final int f45476a;
    public final b1 f45477b;

    public a1(b1 b1Var, int i10) {
        this.f45476a = i10;
        this.f45477b = b1Var;
    }

    @Override
    public final void run() {
        switch (this.f45476a) {
            case 0:
                b1 b1Var = this.f45477b;
                p4.t0 t0Var = b1Var.f45489w;
                a1 a1Var = b1Var.f45488s;
                if (a1Var != null) {
                    b1Var.cancelRunnable(a1Var);
                    b1Var.f45488s = null;
                }
                b1Var.cancelRunnable(t0Var);
                b1Var.postRunnable(t0Var);
                return;
            case 1:
                b1 b1Var2 = this.f45477b;
                b1Var2.f45488s = null;
                b1Var2.f45489w.run();
                return;
            default:
                this.f45477b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
        }
    }
}

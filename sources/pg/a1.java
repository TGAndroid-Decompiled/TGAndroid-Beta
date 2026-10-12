package pg;

import android.os.Looper;
public final class a1 implements Runnable {
    public final int f45471a;
    public final b1 f45472b;

    public a1(b1 b1Var, int i10) {
        this.f45471a = i10;
        this.f45472b = b1Var;
    }

    @Override
    public final void run() {
        switch (this.f45471a) {
            case 0:
                b1 b1Var = this.f45472b;
                p4.t0 t0Var = b1Var.f45484w;
                a1 a1Var = b1Var.f45483s;
                if (a1Var != null) {
                    b1Var.cancelRunnable(a1Var);
                    b1Var.f45483s = null;
                }
                b1Var.cancelRunnable(t0Var);
                b1Var.postRunnable(t0Var);
                return;
            case 1:
                b1 b1Var2 = this.f45472b;
                b1Var2.f45483s = null;
                b1Var2.f45484w.run();
                return;
            default:
                this.f45472b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
        }
    }
}

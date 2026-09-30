package pg;

import android.os.Looper;
public final class b1 implements Runnable {
    public final int f41081a;
    public final d1 f41082b;

    public b1(d1 d1Var, int i10) {
        this.f41081a = i10;
        this.f41082b = d1Var;
    }

    @Override
    public final void run() {
        switch (this.f41081a) {
            case 0:
                d1 d1Var = this.f41082b;
                c1 c1Var = d1Var.f41098w;
                b1 b1Var = d1Var.f41097s;
                if (b1Var != null) {
                    d1Var.cancelRunnable(b1Var);
                    d1Var.f41097s = null;
                }
                d1Var.cancelRunnable(c1Var);
                d1Var.postRunnable(c1Var);
                return;
            case 1:
                d1 d1Var2 = this.f41082b;
                d1Var2.f41097s = null;
                d1Var2.f41098w.run();
                return;
            default:
                this.f41082b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
        }
    }
}

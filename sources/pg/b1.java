package pg;

import android.os.Looper;
public final class b1 implements Runnable {
    public final int f41079a;
    public final d1 f41080b;

    public b1(d1 d1Var, int i10) {
        this.f41079a = i10;
        this.f41080b = d1Var;
    }

    @Override
    public final void run() {
        switch (this.f41079a) {
            case 0:
                d1 d1Var = this.f41080b;
                c1 c1Var = d1Var.f41096w;
                b1 b1Var = d1Var.f41095s;
                if (b1Var != null) {
                    d1Var.cancelRunnable(b1Var);
                    d1Var.f41095s = null;
                }
                d1Var.cancelRunnable(c1Var);
                d1Var.postRunnable(c1Var);
                return;
            case 1:
                d1 d1Var2 = this.f41080b;
                d1Var2.f41095s = null;
                d1Var2.f41096w.run();
                return;
            default:
                this.f41080b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
        }
    }
}

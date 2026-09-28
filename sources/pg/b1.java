package pg;

import android.os.Looper;
public final class b1 implements Runnable {
    public final int f41080a;
    public final d1 f41081b;

    public b1(d1 d1Var, int i10) {
        this.f41080a = i10;
        this.f41081b = d1Var;
    }

    @Override
    public final void run() {
        switch (this.f41080a) {
            case 0:
                d1 d1Var = this.f41081b;
                c1 c1Var = d1Var.f41097w;
                b1 b1Var = d1Var.f41096s;
                if (b1Var != null) {
                    d1Var.cancelRunnable(b1Var);
                    d1Var.f41096s = null;
                }
                d1Var.cancelRunnable(c1Var);
                d1Var.postRunnable(c1Var);
                return;
            case 1:
                d1 d1Var2 = this.f41081b;
                d1Var2.f41096s = null;
                d1Var2.f41097w.run();
                return;
            default:
                this.f41081b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
        }
    }
}

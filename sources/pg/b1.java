package pg;

import android.os.Looper;
public final class b1 implements Runnable {
    public final int f41065a;
    public final d1 f41066b;

    public b1(d1 d1Var, int i10) {
        this.f41065a = i10;
        this.f41066b = d1Var;
    }

    @Override
    public final void run() {
        switch (this.f41065a) {
            case 0:
                d1 d1Var = this.f41066b;
                c1 c1Var = d1Var.f41082w;
                b1 b1Var = d1Var.f41081s;
                if (b1Var != null) {
                    d1Var.cancelRunnable(b1Var);
                    d1Var.f41081s = null;
                }
                d1Var.cancelRunnable(c1Var);
                d1Var.postRunnable(c1Var);
                return;
            case 1:
                d1 d1Var2 = this.f41066b;
                d1Var2.f41081s = null;
                d1Var2.f41082w.run();
                return;
            default:
                this.f41066b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
        }
    }
}

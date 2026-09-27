package pg;

import android.os.Looper;
public final class b1 implements Runnable {
    public final int f41077a;
    public final d1 f41078b;

    public b1(d1 d1Var, int i10) {
        this.f41077a = i10;
        this.f41078b = d1Var;
    }

    @Override
    public final void run() {
        switch (this.f41077a) {
            case 0:
                d1 d1Var = this.f41078b;
                c1 c1Var = d1Var.f41094w;
                b1 b1Var = d1Var.f41093s;
                if (b1Var != null) {
                    d1Var.cancelRunnable(b1Var);
                    d1Var.f41093s = null;
                }
                d1Var.cancelRunnable(c1Var);
                d1Var.postRunnable(c1Var);
                return;
            case 1:
                d1 d1Var2 = this.f41078b;
                d1Var2.f41093s = null;
                d1Var2.f41094w.run();
                return;
            default:
                this.f41078b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
        }
    }
}

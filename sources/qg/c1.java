package qg;

import android.os.Looper;
public final class c1 implements Runnable {
    public final int f44484a;
    public final d1 f44485b;

    public c1(d1 d1Var, int i10) {
        this.f44484a = i10;
        this.f44485b = d1Var;
    }

    @Override
    public final void run() {
        switch (this.f44484a) {
            case 0:
                d1 d1Var = this.f44485b;
                p8.b bVar = d1Var.f44497w;
                c1 c1Var = d1Var.f44496s;
                if (c1Var != null) {
                    d1Var.cancelRunnable(c1Var);
                    d1Var.f44496s = null;
                }
                d1Var.cancelRunnable(bVar);
                d1Var.postRunnable(bVar);
                return;
            case 1:
                d1 d1Var2 = this.f44485b;
                d1Var2.f44496s = null;
                d1Var2.f44497w.run();
                return;
            default:
                this.f44485b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
        }
    }
}

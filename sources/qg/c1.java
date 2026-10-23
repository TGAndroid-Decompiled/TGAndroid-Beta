package qg;

import android.os.Looper;
public final class c1 implements Runnable {
    public final int f44485a;
    public final d1 f44486b;

    public c1(d1 d1Var, int i10) {
        this.f44485a = i10;
        this.f44486b = d1Var;
    }

    @Override
    public final void run() {
        switch (this.f44485a) {
            case 0:
                d1 d1Var = this.f44486b;
                p8.b bVar = d1Var.f44498w;
                c1 c1Var = d1Var.f44497s;
                if (c1Var != null) {
                    d1Var.cancelRunnable(c1Var);
                    d1Var.f44497s = null;
                }
                d1Var.cancelRunnable(bVar);
                d1Var.postRunnable(bVar);
                return;
            case 1:
                d1 d1Var2 = this.f44486b;
                d1Var2.f44497s = null;
                d1Var2.f44498w.run();
                return;
            default:
                this.f44486b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
        }
    }
}

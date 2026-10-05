package pg;

import android.os.Looper;
public final class b1 implements Runnable {
    public final int f44444a;
    public final d1 f44445b;

    public b1(d1 d1Var, int i10) {
        this.f44444a = i10;
        this.f44445b = d1Var;
    }

    @Override
    public final void run() {
        switch (this.f44444a) {
            case 0:
                d1 d1Var = this.f44445b;
                c1 c1Var = d1Var.f44463w;
                b1 b1Var = d1Var.f44462s;
                if (b1Var != null) {
                    d1Var.cancelRunnable(b1Var);
                    d1Var.f44462s = null;
                }
                d1Var.cancelRunnable(c1Var);
                d1Var.postRunnable(c1Var);
                return;
            case 1:
                d1 d1Var2 = this.f44445b;
                d1Var2.f44462s = null;
                d1Var2.f44463w.run();
                return;
            default:
                this.f44445b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
        }
    }
}

package pg;

import android.os.Looper;
public final class b1 implements Runnable {
    public final int f41128a;
    public final d1 f41129b;

    public b1(d1 d1Var, int i10) {
        this.f41128a = i10;
        this.f41129b = d1Var;
    }

    @Override
    public final void run() {
        switch (this.f41128a) {
            case 0:
                d1 d1Var = this.f41129b;
                c1 c1Var = d1Var.f41145w;
                b1 b1Var = d1Var.f41144s;
                if (b1Var != null) {
                    d1Var.cancelRunnable(b1Var);
                    d1Var.f41144s = null;
                }
                d1Var.cancelRunnable(c1Var);
                d1Var.postRunnable(c1Var);
                return;
            case 1:
                d1 d1Var2 = this.f41129b;
                d1Var2.f41144s = null;
                d1Var2.f41145w.run();
                return;
            default:
                this.f41129b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
        }
    }
}

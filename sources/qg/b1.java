package qg;

import android.os.Looper;
public final class b1 implements Runnable {
    public final int f44514a;
    public final c1 f44515b;

    public b1(c1 c1Var, int i10) {
        this.f44514a = i10;
        this.f44515b = c1Var;
    }

    @Override
    public final void run() {
        switch (this.f44514a) {
            case 0:
                c1 c1Var = this.f44515b;
                p4.s0 s0Var = c1Var.f44526w;
                b1 b1Var = c1Var.f44525s;
                if (b1Var != null) {
                    c1Var.cancelRunnable(b1Var);
                    c1Var.f44525s = null;
                }
                c1Var.cancelRunnable(s0Var);
                c1Var.postRunnable(s0Var);
                return;
            case 1:
                c1 c1Var2 = this.f44515b;
                c1Var2.f44525s = null;
                c1Var2.f44526w.run();
                return;
            default:
                this.f44515b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
        }
    }
}

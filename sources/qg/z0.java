package qg;

import android.os.Looper;
public final class z0 implements Runnable {
    public final int f43367a;
    public final a1 f43368b;

    public z0(a1 a1Var, int i10) {
        this.f43367a = i10;
        this.f43368b = a1Var;
    }

    @Override
    public final void run() {
        switch (this.f43367a) {
            case 0:
                a1 a1Var = this.f43368b;
                p4.s0 s0Var = a1Var.f43129w;
                z0 z0Var = a1Var.f43128s;
                if (z0Var != null) {
                    a1Var.cancelRunnable(z0Var);
                    a1Var.f43128s = null;
                }
                a1Var.cancelRunnable(s0Var);
                a1Var.postRunnable(s0Var);
                return;
            case 1:
                a1 a1Var2 = this.f43368b;
                a1Var2.f43128s = null;
                a1Var2.f43129w.run();
                return;
            default:
                this.f43368b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
        }
    }
}

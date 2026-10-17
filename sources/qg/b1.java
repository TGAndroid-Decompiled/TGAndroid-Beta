package qg;

import android.os.Looper;
public final class b1 implements Runnable {
    public final int f44494a;
    public final c1 f44495b;

    public b1(c1 c1Var, int i10) {
        this.f44494a = i10;
        this.f44495b = c1Var;
    }

    @Override
    public final void run() {
        switch (this.f44494a) {
            case 0:
                c1 c1Var = this.f44495b;
                p4.s0 s0Var = c1Var.f44506w;
                b1 b1Var = c1Var.f44505s;
                if (b1Var != null) {
                    c1Var.cancelRunnable(b1Var);
                    c1Var.f44505s = null;
                }
                c1Var.cancelRunnable(s0Var);
                c1Var.postRunnable(s0Var);
                return;
            case 1:
                c1 c1Var2 = this.f44495b;
                c1Var2.f44505s = null;
                c1Var2.f44506w.run();
                return;
            default:
                this.f44495b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
        }
    }
}

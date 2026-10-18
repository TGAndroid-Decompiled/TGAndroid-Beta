package qg;

import android.os.Looper;
public final class b1 implements Runnable {
    public final int f44472a;
    public final c1 f44473b;

    public b1(c1 c1Var, int i10) {
        this.f44472a = i10;
        this.f44473b = c1Var;
    }

    @Override
    public final void run() {
        switch (this.f44472a) {
            case 0:
                c1 c1Var = this.f44473b;
                p8.b bVar = c1Var.f44485w;
                b1 b1Var = c1Var.f44484s;
                if (b1Var != null) {
                    c1Var.cancelRunnable(b1Var);
                    c1Var.f44484s = null;
                }
                c1Var.cancelRunnable(bVar);
                c1Var.postRunnable(bVar);
                return;
            case 1:
                c1 c1Var2 = this.f44473b;
                c1Var2.f44484s = null;
                c1Var2.f44485w.run();
                return;
            default:
                this.f44473b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
        }
    }
}

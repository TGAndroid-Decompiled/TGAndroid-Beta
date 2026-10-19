package qg;

import android.os.Looper;
public final class c1 implements Runnable {
    public final int f44471a;
    public final d1 f44472b;

    public c1(d1 d1Var, int i10) {
        this.f44471a = i10;
        this.f44472b = d1Var;
    }

    @Override
    public final void run() {
        switch (this.f44471a) {
            case 0:
                d1 d1Var = this.f44472b;
                p8.b bVar = d1Var.f44484w;
                c1 c1Var = d1Var.f44483s;
                if (c1Var != null) {
                    d1Var.cancelRunnable(c1Var);
                    d1Var.f44483s = null;
                }
                d1Var.cancelRunnable(bVar);
                d1Var.postRunnable(bVar);
                return;
            case 1:
                d1 d1Var2 = this.f44472b;
                d1Var2.f44483s = null;
                d1Var2.f44484w.run();
                return;
            default:
                this.f44472b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
        }
    }
}

package pg;

import android.os.Looper;
public final class b1 implements Runnable {
    public final int f44429a;
    public final d1 f44430b;

    public b1(d1 d1Var, int i10) {
        this.f44429a = i10;
        this.f44430b = d1Var;
    }

    @Override
    public final void run() {
        switch (this.f44429a) {
            case 0:
                d1 d1Var = this.f44430b;
                c1 c1Var = d1Var.f44448w;
                b1 b1Var = d1Var.f44447s;
                if (b1Var != null) {
                    d1Var.cancelRunnable(b1Var);
                    d1Var.f44447s = null;
                }
                d1Var.cancelRunnable(c1Var);
                d1Var.postRunnable(c1Var);
                return;
            case 1:
                d1 d1Var2 = this.f44430b;
                d1Var2.f44447s = null;
                d1Var2.f44448w.run();
                return;
            default:
                this.f44430b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
        }
    }
}

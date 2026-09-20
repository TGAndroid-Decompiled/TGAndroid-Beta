package pg;

import android.os.Looper;
public final class b1 implements Runnable {
    public final int f41108a;
    public final c1 f41109b;

    public b1(c1 c1Var, int i10) {
        this.f41108a = i10;
        this.f41109b = c1Var;
    }

    @Override
    public final void run() {
        switch (this.f41108a) {
            case 0:
                c1 c1Var = this.f41109b;
                p8.b bVar = c1Var.f41121w;
                b1 b1Var = c1Var.f41120s;
                if (b1Var != null) {
                    c1Var.cancelRunnable(b1Var);
                    c1Var.f41120s = null;
                }
                c1Var.cancelRunnable(bVar);
                c1Var.postRunnable(bVar);
                return;
            case 1:
                c1 c1Var2 = this.f41109b;
                c1Var2.f41120s = null;
                c1Var2.f41121w.run();
                return;
            default:
                this.f41109b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
        }
    }
}

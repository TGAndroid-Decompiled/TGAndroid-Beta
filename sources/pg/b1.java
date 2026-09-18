package pg;

import android.os.Looper;
public final class b1 implements Runnable {
    public final int f41067a;
    public final c1 f41068b;

    public b1(c1 c1Var, int i10) {
        this.f41067a = i10;
        this.f41068b = c1Var;
    }

    @Override
    public final void run() {
        switch (this.f41067a) {
            case 0:
                c1 c1Var = this.f41068b;
                p8.b bVar = c1Var.f41080w;
                b1 b1Var = c1Var.f41079s;
                if (b1Var != null) {
                    c1Var.cancelRunnable(b1Var);
                    c1Var.f41079s = null;
                }
                c1Var.cancelRunnable(bVar);
                c1Var.postRunnable(bVar);
                return;
            case 1:
                c1 c1Var2 = this.f41068b;
                c1Var2.f41079s = null;
                c1Var2.f41080w.run();
                return;
            default:
                this.f41068b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
        }
    }
}

package sg;

import android.os.Looper;
public final class r0 implements Runnable {
    public final int f56759a;
    public final s0 f56760b;

    public r0(s0 s0Var, int i7) {
        this.f56759a = i7;
        this.f56760b = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f56759a) {
            case 0:
                s0 s0Var = this.f56760b;
                s4.s0 s0Var2 = s0Var.f56772x;
                r0 r0Var = s0Var.f56770s;
                if (r0Var != null) {
                    s0Var.cancelRunnable(r0Var);
                    s0Var.f56770s = null;
                }
                s0Var.cancelRunnable(s0Var2);
                s0Var.postRunnable(s0Var2);
                return;
            case 1:
                s0 s0Var3 = this.f56760b;
                s0Var3.f56770s = null;
                s0Var3.f56772x.run();
                return;
            default:
                this.f56760b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
        }
    }
}

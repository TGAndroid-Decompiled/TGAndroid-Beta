package sg;

import android.os.Looper;
public final class r0 implements Runnable {
    public final int f57333a;
    public final s0 f57334b;

    public r0(s0 s0Var, int i7) {
        this.f57333a = i7;
        this.f57334b = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f57333a) {
            case 0:
                s0 s0Var = this.f57334b;
                s4.s0 s0Var2 = s0Var.f57346x;
                r0 r0Var = s0Var.f57344s;
                if (r0Var != null) {
                    s0Var.cancelRunnable(r0Var);
                    s0Var.f57344s = null;
                }
                s0Var.cancelRunnable(s0Var2);
                s0Var.postRunnable(s0Var2);
                return;
            case 1:
                s0 s0Var3 = this.f57334b;
                s0Var3.f57344s = null;
                s0Var3.f57346x.run();
                return;
            default:
                this.f57334b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
        }
    }
}

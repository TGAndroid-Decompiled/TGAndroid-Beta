package sg;

import android.os.Looper;
public final class r0 implements Runnable {
    public final int f57374a;
    public final s0 f57375b;

    public r0(s0 s0Var, int i7) {
        this.f57374a = i7;
        this.f57375b = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f57374a) {
            case 0:
                s0 s0Var = this.f57375b;
                s4.s0 s0Var2 = s0Var.f57387x;
                r0 r0Var = s0Var.f57385s;
                if (r0Var != null) {
                    s0Var.cancelRunnable(r0Var);
                    s0Var.f57385s = null;
                }
                s0Var.cancelRunnable(s0Var2);
                s0Var.postRunnable(s0Var2);
                return;
            case 1:
                s0 s0Var3 = this.f57375b;
                s0Var3.f57385s = null;
                s0Var3.f57387x.run();
                return;
            default:
                this.f57375b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
        }
    }
}

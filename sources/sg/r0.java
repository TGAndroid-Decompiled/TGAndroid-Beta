package sg;

import android.os.Looper;
public final class r0 implements Runnable {
    public final int f57343a;
    public final s0 f57344b;

    public r0(s0 s0Var, int i7) {
        this.f57343a = i7;
        this.f57344b = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f57343a) {
            case 0:
                s0 s0Var = this.f57344b;
                s4.s0 s0Var2 = s0Var.f57356x;
                r0 r0Var = s0Var.f57354s;
                if (r0Var != null) {
                    s0Var.cancelRunnable(r0Var);
                    s0Var.f57354s = null;
                }
                s0Var.cancelRunnable(s0Var2);
                s0Var.postRunnable(s0Var2);
                return;
            case 1:
                s0 s0Var3 = this.f57344b;
                s0Var3.f57354s = null;
                s0Var3.f57356x.run();
                return;
            default:
                this.f57344b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
        }
    }
}

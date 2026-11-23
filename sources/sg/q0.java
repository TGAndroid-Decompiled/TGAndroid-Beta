package sg;

import android.os.Looper;
import org.telegram.ui.Wallet.o5;
public final class q0 implements Runnable {
    public final int f57445a;
    public final r0 f57446b;

    public q0(r0 r0Var, int i7) {
        this.f57445a = i7;
        this.f57446b = r0Var;
    }

    @Override
    public final void run() {
        switch (this.f57445a) {
            case 0:
                r0 r0Var = this.f57446b;
                o5 o5Var = r0Var.f57462x;
                q0 q0Var = r0Var.f57460s;
                if (q0Var != null) {
                    r0Var.cancelRunnable(q0Var);
                    r0Var.f57460s = null;
                }
                r0Var.cancelRunnable(o5Var);
                r0Var.postRunnable(o5Var);
                return;
            case 1:
                r0 r0Var2 = this.f57446b;
                r0Var2.f57460s = null;
                r0Var2.f57462x.run();
                return;
            default:
                this.f57446b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
        }
    }
}

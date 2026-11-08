package sg;

import android.os.Looper;
import org.telegram.ui.Components.et;
public final class s0 implements Runnable {
    public final int f55199a;
    public final u0 f55200b;

    public s0(u0 u0Var, int i7) {
        this.f55199a = i7;
        this.f55200b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f55199a) {
            case 0:
                u0 u0Var = this.f55200b;
                et etVar = u0Var.f55218x;
                s0 s0Var = u0Var.f55216s;
                if (s0Var != null) {
                    u0Var.cancelRunnable(s0Var);
                    u0Var.f55216s = null;
                }
                u0Var.cancelRunnable(etVar);
                u0Var.postRunnable(etVar);
                return;
            case 1:
                u0 u0Var2 = this.f55200b;
                u0Var2.f55216s = null;
                u0Var2.f55218x.run();
                return;
            default:
                this.f55200b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
        }
    }
}

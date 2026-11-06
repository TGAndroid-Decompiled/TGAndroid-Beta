package sg;

import android.os.Looper;
import org.telegram.ui.Components.dt;
public final class s0 implements Runnable {
    public final int f55083a;
    public final u0 f55084b;

    public s0(u0 u0Var, int i7) {
        this.f55083a = i7;
        this.f55084b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f55083a) {
            case 0:
                u0 u0Var = this.f55084b;
                dt dtVar = u0Var.f55102x;
                s0 s0Var = u0Var.f55100s;
                if (s0Var != null) {
                    u0Var.cancelRunnable(s0Var);
                    u0Var.f55100s = null;
                }
                u0Var.cancelRunnable(dtVar);
                u0Var.postRunnable(dtVar);
                return;
            case 1:
                u0 u0Var2 = this.f55084b;
                u0Var2.f55100s = null;
                u0Var2.f55102x.run();
                return;
            default:
                this.f55084b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
        }
    }
}

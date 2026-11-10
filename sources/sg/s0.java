package sg;

import android.os.Looper;
import org.telegram.ui.Components.dt;
public final class s0 implements Runnable {
    public final int f55209a;
    public final t0 f55210b;

    public s0(t0 t0Var, int i7) {
        this.f55209a = i7;
        this.f55210b = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f55209a) {
            case 0:
                t0 t0Var = this.f55210b;
                dt dtVar = t0Var.f55223x;
                s0 s0Var = t0Var.f55221s;
                if (s0Var != null) {
                    t0Var.cancelRunnable(s0Var);
                    t0Var.f55221s = null;
                }
                t0Var.cancelRunnable(dtVar);
                t0Var.postRunnable(dtVar);
                return;
            case 1:
                t0 t0Var2 = this.f55210b;
                t0Var2.f55221s = null;
                t0Var2.f55223x.run();
                return;
            default:
                this.f55210b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
        }
    }
}

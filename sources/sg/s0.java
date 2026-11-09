package sg;

import android.os.Looper;
import org.telegram.ui.Components.et;
public final class s0 implements Runnable {
    public final int f55210a;
    public final t0 f55211b;

    public s0(t0 t0Var, int i7) {
        this.f55210a = i7;
        this.f55211b = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f55210a) {
            case 0:
                t0 t0Var = this.f55211b;
                et etVar = t0Var.f55224x;
                s0 s0Var = t0Var.f55222s;
                if (s0Var != null) {
                    t0Var.cancelRunnable(s0Var);
                    t0Var.f55222s = null;
                }
                t0Var.cancelRunnable(etVar);
                t0Var.postRunnable(etVar);
                return;
            case 1:
                t0 t0Var2 = this.f55211b;
                t0Var2.f55222s = null;
                t0Var2.f55224x.run();
                return;
            default:
                this.f55211b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
        }
    }
}

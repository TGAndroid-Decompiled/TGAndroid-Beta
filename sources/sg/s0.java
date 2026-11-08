package sg;

import android.os.Looper;
import org.telegram.ui.Components.et;
public final class s0 implements Runnable {
    public final int f55200a;
    public final u0 f55201b;

    public s0(u0 u0Var, int i7) {
        this.f55200a = i7;
        this.f55201b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f55200a) {
            case 0:
                u0 u0Var = this.f55201b;
                et etVar = u0Var.f55219x;
                s0 s0Var = u0Var.f55217s;
                if (s0Var != null) {
                    u0Var.cancelRunnable(s0Var);
                    u0Var.f55217s = null;
                }
                u0Var.cancelRunnable(etVar);
                u0Var.postRunnable(etVar);
                return;
            case 1:
                u0 u0Var2 = this.f55201b;
                u0Var2.f55217s = null;
                u0Var2.f55219x.run();
                return;
            default:
                this.f55201b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
        }
    }
}

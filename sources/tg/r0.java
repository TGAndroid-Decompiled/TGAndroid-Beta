package tg;

import android.os.Looper;
import org.telegram.ui.Components.lt;
public final class r0 implements Runnable {
    public final int f55300a;
    public final s0 f55301b;

    public r0(s0 s0Var, int i3) {
        this.f55300a = i3;
        this.f55301b = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f55300a) {
            case 0:
                s0 s0Var = this.f55301b;
                lt ltVar = s0Var.f55313x;
                r0 r0Var = s0Var.f55311s;
                if (r0Var != null) {
                    s0Var.cancelRunnable(r0Var);
                    s0Var.f55311s = null;
                }
                s0Var.cancelRunnable(ltVar);
                s0Var.postRunnable(ltVar);
                return;
            case 1:
                s0 s0Var2 = this.f55301b;
                s0Var2.f55311s = null;
                s0Var2.f55313x.run();
                return;
            default:
                this.f55301b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
        }
    }
}

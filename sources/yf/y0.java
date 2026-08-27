package yf;

import android.os.Looper;
import org.telegram.ui.Components.mu0;

public final class y0 implements Runnable {

    public final int f50126a;

    public final z0 f50127b;

    public y0(z0 z0Var, int i10) {
        this.f50126a = i10;
        this.f50127b = z0Var;
    }

    @Override
    public final void run() {
        switch (this.f50126a) {
            case 0:
                z0 z0Var = this.f50127b;
                mu0 mu0Var = z0Var.f50138w;
                y0 y0Var = z0Var.f50137s;
                if (y0Var != null) {
                    z0Var.cancelRunnable(y0Var);
                    z0Var.f50137s = null;
                }
                z0Var.cancelRunnable(mu0Var);
                z0Var.postRunnable(mu0Var);
                break;
            case 1:
                z0 z0Var2 = this.f50127b;
                z0Var2.f50137s = null;
                z0Var2.f50138w.run();
                break;
            default:
                this.f50127b.finish();
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper != null) {
                    looperMyLooper.quit();
                }
                break;
        }
    }
}

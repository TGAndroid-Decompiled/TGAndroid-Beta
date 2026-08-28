package xf;

import android.os.Looper;
import org.telegram.ui.Components.ju0;
public final class z0 implements Runnable {
    public final int f49426a;
    public final a1 f49427b;

    public z0(a1 a1Var, int i9) {
        this.f49426a = i9;
        this.f49427b = a1Var;
    }

    @Override
    public final void run() {
        switch (this.f49426a) {
            case 0:
                a1 a1Var = this.f49427b;
                ju0 ju0Var = a1Var.f49167w;
                z0 z0Var = a1Var.f49166s;
                if (z0Var != null) {
                    a1Var.cancelRunnable(z0Var);
                    a1Var.f49166s = null;
                }
                a1Var.cancelRunnable(ju0Var);
                a1Var.postRunnable(ju0Var);
                return;
            case 1:
                a1 a1Var2 = this.f49427b;
                a1Var2.f49166s = null;
                a1Var2.f49167w.run();
                return;
            default:
                this.f49427b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
        }
    }
}

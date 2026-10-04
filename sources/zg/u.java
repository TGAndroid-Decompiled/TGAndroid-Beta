package zg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.lc0;
import yh.t3;
public final class u implements Runnable {
    public final int f53535a;
    public final b0 f53536b;

    public u(b0 b0Var, int i10) {
        this.f53535a = i10;
        this.f53536b = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f53535a) {
            case 0:
                this.f53536b.f53316a.invalidate();
                return;
            default:
                b0 b0Var = this.f53536b;
                t3 t3Var = b0Var.f53318c;
                if (t3Var.getParent() != null) {
                    if (b0Var.d) {
                        AndroidUtilities.removeFromParent(t3Var);
                    } else {
                        try {
                            b0Var.f53317b.removeView(t3Var);
                        } catch (Exception unused) {
                        }
                    }
                    lc0 lc0Var = b0Var.f53329p;
                    if (lc0Var != null) {
                        lc0Var.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}

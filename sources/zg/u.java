package zg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.lc0;
import yh.t3;
public final class u implements Runnable {
    public final int f53536a;
    public final b0 f53537b;

    public u(b0 b0Var, int i10) {
        this.f53536a = i10;
        this.f53537b = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f53536a) {
            case 0:
                this.f53537b.f53317a.invalidate();
                return;
            default:
                b0 b0Var = this.f53537b;
                t3 t3Var = b0Var.f53319c;
                if (t3Var.getParent() != null) {
                    if (b0Var.d) {
                        AndroidUtilities.removeFromParent(t3Var);
                    } else {
                        try {
                            b0Var.f53318b.removeView(t3Var);
                        } catch (Exception unused) {
                        }
                    }
                    lc0 lc0Var = b0Var.f53330p;
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

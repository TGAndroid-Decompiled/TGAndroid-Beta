package zg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.lc0;
import yh.t3;
public final class u implements Runnable {
    public final int f53541a;
    public final b0 f53542b;

    public u(b0 b0Var, int i10) {
        this.f53541a = i10;
        this.f53542b = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f53541a) {
            case 0:
                this.f53542b.f53322a.invalidate();
                return;
            default:
                b0 b0Var = this.f53542b;
                t3 t3Var = b0Var.f53324c;
                if (t3Var.getParent() != null) {
                    if (b0Var.d) {
                        AndroidUtilities.removeFromParent(t3Var);
                    } else {
                        try {
                            b0Var.f53323b.removeView(t3Var);
                        } catch (Exception unused) {
                        }
                    }
                    lc0 lc0Var = b0Var.f53335p;
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

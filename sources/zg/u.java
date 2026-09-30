package zg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.lc0;
import yh.t3;
public final class u implements Runnable {
    public final int f49557a;
    public final b0 f49558b;

    public u(b0 b0Var, int i10) {
        this.f49557a = i10;
        this.f49558b = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f49557a) {
            case 0:
                this.f49558b.f49353a.invalidate();
                return;
            default:
                b0 b0Var = this.f49558b;
                t3 t3Var = b0Var.f49355c;
                if (t3Var.getParent() != null) {
                    if (b0Var.d) {
                        AndroidUtilities.removeFromParent(t3Var);
                    } else {
                        try {
                            b0Var.f49354b.removeView(t3Var);
                        } catch (Exception unused) {
                        }
                    }
                    lc0 lc0Var = b0Var.f49365p;
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

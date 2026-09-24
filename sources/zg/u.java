package zg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ic0;
import yh.t3;
public final class u implements Runnable {
    public final int f49438a;
    public final b0 f49439b;

    public u(b0 b0Var, int i10) {
        this.f49438a = i10;
        this.f49439b = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f49438a) {
            case 0:
                this.f49439b.f49234a.invalidate();
                return;
            default:
                b0 b0Var = this.f49439b;
                t3 t3Var = b0Var.f49236c;
                if (t3Var.getParent() != null) {
                    if (b0Var.d) {
                        AndroidUtilities.removeFromParent(t3Var);
                    } else {
                        try {
                            b0Var.f49235b.removeView(t3Var);
                        } catch (Exception unused) {
                        }
                    }
                    ic0 ic0Var = b0Var.f49246p;
                    if (ic0Var != null) {
                        ic0Var.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}

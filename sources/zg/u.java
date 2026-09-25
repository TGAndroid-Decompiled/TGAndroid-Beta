package zg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ic0;
import yh.t3;
public final class u implements Runnable {
    public final int f49450a;
    public final b0 f49451b;

    public u(b0 b0Var, int i10) {
        this.f49450a = i10;
        this.f49451b = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f49450a) {
            case 0:
                this.f49451b.f49246a.invalidate();
                return;
            default:
                b0 b0Var = this.f49451b;
                t3 t3Var = b0Var.f49248c;
                if (t3Var.getParent() != null) {
                    if (b0Var.d) {
                        AndroidUtilities.removeFromParent(t3Var);
                    } else {
                        try {
                            b0Var.f49247b.removeView(t3Var);
                        } catch (Exception unused) {
                        }
                    }
                    ic0 ic0Var = b0Var.f49258p;
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

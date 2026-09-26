package zg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ic0;
import yh.t3;
public final class u implements Runnable {
    public final int f49449a;
    public final b0 f49450b;

    public u(b0 b0Var, int i10) {
        this.f49449a = i10;
        this.f49450b = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f49449a) {
            case 0:
                this.f49450b.f49245a.invalidate();
                return;
            default:
                b0 b0Var = this.f49450b;
                t3 t3Var = b0Var.f49247c;
                if (t3Var.getParent() != null) {
                    if (b0Var.d) {
                        AndroidUtilities.removeFromParent(t3Var);
                    } else {
                        try {
                            b0Var.f49246b.removeView(t3Var);
                        } catch (Exception unused) {
                        }
                    }
                    ic0 ic0Var = b0Var.f49257p;
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

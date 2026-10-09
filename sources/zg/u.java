package zg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bd0;
public final class u implements Runnable {
    public final int f54671a;
    public final a0 f54672b;

    public u(a0 a0Var, int i10) {
        this.f54671a = i10;
        this.f54672b = a0Var;
    }

    @Override
    public final void run() {
        switch (this.f54671a) {
            case 0:
                this.f54672b.f54447a.invalidate();
                return;
            default:
                a0 a0Var = this.f54672b;
                xh.m mVar = a0Var.f54449c;
                if (mVar.getParent() != null) {
                    if (a0Var.d) {
                        AndroidUtilities.removeFromParent(mVar);
                    } else {
                        try {
                            a0Var.f54448b.removeView(mVar);
                        } catch (Exception unused) {
                        }
                    }
                    bd0 bd0Var = a0Var.f54460p;
                    if (bd0Var != null) {
                        bd0Var.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}

package zg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bd0;
public final class u implements Runnable {
    public final int f54673a;
    public final a0 f54674b;

    public u(a0 a0Var, int i10) {
        this.f54673a = i10;
        this.f54674b = a0Var;
    }

    @Override
    public final void run() {
        switch (this.f54673a) {
            case 0:
                this.f54674b.f54449a.invalidate();
                return;
            default:
                a0 a0Var = this.f54674b;
                xh.m mVar = a0Var.f54451c;
                if (mVar.getParent() != null) {
                    if (a0Var.d) {
                        AndroidUtilities.removeFromParent(mVar);
                    } else {
                        try {
                            a0Var.f54450b.removeView(mVar);
                        } catch (Exception unused) {
                        }
                    }
                    bd0 bd0Var = a0Var.f54462p;
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

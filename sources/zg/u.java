package zg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.cd0;
public final class u implements Runnable {
    public final int f54717a;
    public final a0 f54718b;

    public u(a0 a0Var, int i10) {
        this.f54717a = i10;
        this.f54718b = a0Var;
    }

    @Override
    public final void run() {
        switch (this.f54717a) {
            case 0:
                this.f54718b.f54493a.invalidate();
                return;
            default:
                a0 a0Var = this.f54718b;
                xh.m mVar = a0Var.f54495c;
                if (mVar.getParent() != null) {
                    if (a0Var.d) {
                        AndroidUtilities.removeFromParent(mVar);
                    } else {
                        try {
                            a0Var.f54494b.removeView(mVar);
                        } catch (Exception unused) {
                        }
                    }
                    cd0 cd0Var = a0Var.f54506p;
                    if (cd0Var != null) {
                        cd0Var.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}

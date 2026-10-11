package zg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.cd0;
public final class u implements Runnable {
    public final int f54760a;
    public final a0 f54761b;

    public u(a0 a0Var, int i10) {
        this.f54760a = i10;
        this.f54761b = a0Var;
    }

    @Override
    public final void run() {
        switch (this.f54760a) {
            case 0:
                this.f54761b.f54536a.invalidate();
                return;
            default:
                a0 a0Var = this.f54761b;
                xh.m mVar = a0Var.f54538c;
                if (mVar.getParent() != null) {
                    if (a0Var.d) {
                        AndroidUtilities.removeFromParent(mVar);
                    } else {
                        try {
                            a0Var.f54537b.removeView(mVar);
                        } catch (Exception unused) {
                        }
                    }
                    cd0 cd0Var = a0Var.f54549p;
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

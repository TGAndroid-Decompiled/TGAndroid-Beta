package zg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.cd0;
public final class u implements Runnable {
    public final int f54905a;
    public final a0 f54906b;

    public u(a0 a0Var, int i10) {
        this.f54905a = i10;
        this.f54906b = a0Var;
    }

    @Override
    public final void run() {
        switch (this.f54905a) {
            case 0:
                this.f54906b.f54681a.invalidate();
                return;
            default:
                a0 a0Var = this.f54906b;
                xh.m mVar = a0Var.f54683c;
                if (mVar.getParent() != null) {
                    if (a0Var.d) {
                        AndroidUtilities.removeFromParent(mVar);
                    } else {
                        try {
                            a0Var.f54682b.removeView(mVar);
                        } catch (Exception unused) {
                        }
                    }
                    cd0 cd0Var = a0Var.f54694p;
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

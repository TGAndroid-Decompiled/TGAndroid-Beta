package zg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.cd0;
public final class u implements Runnable {
    public final int f54897a;
    public final a0 f54898b;

    public u(a0 a0Var, int i10) {
        this.f54897a = i10;
        this.f54898b = a0Var;
    }

    @Override
    public final void run() {
        switch (this.f54897a) {
            case 0:
                this.f54898b.f54673a.invalidate();
                return;
            default:
                a0 a0Var = this.f54898b;
                xh.m mVar = a0Var.f54675c;
                if (mVar.getParent() != null) {
                    if (a0Var.d) {
                        AndroidUtilities.removeFromParent(mVar);
                    } else {
                        try {
                            a0Var.f54674b.removeView(mVar);
                        } catch (Exception unused) {
                        }
                    }
                    cd0 cd0Var = a0Var.f54686p;
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

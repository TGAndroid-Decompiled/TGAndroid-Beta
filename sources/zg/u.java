package zg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.yc0;
public final class u implements Runnable {
    public final int f54794a;
    public final a0 f54795b;

    public u(a0 a0Var, int i10) {
        this.f54794a = i10;
        this.f54795b = a0Var;
    }

    @Override
    public final void run() {
        switch (this.f54794a) {
            case 0:
                this.f54795b.f54570a.invalidate();
                return;
            default:
                a0 a0Var = this.f54795b;
                xh.m mVar = a0Var.f54572c;
                if (mVar.getParent() != null) {
                    if (a0Var.d) {
                        AndroidUtilities.removeFromParent(mVar);
                    } else {
                        try {
                            a0Var.f54571b.removeView(mVar);
                        } catch (Exception unused) {
                        }
                    }
                    yc0 yc0Var = a0Var.f54583p;
                    if (yc0Var != null) {
                        yc0Var.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}

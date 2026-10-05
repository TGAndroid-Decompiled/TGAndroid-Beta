package zg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.lc0;
import yh.u3;
public final class s implements Runnable {
    public final int f53526a;
    public final z f53527b;

    public s(z zVar, int i10) {
        this.f53526a = i10;
        this.f53527b = zVar;
    }

    @Override
    public final void run() {
        switch (this.f53526a) {
            case 0:
                this.f53527b.f53550a.invalidate();
                return;
            default:
                z zVar = this.f53527b;
                u3 u3Var = zVar.f53552c;
                if (u3Var.getParent() != null) {
                    if (zVar.d) {
                        AndroidUtilities.removeFromParent(u3Var);
                    } else {
                        try {
                            zVar.f53551b.removeView(u3Var);
                        } catch (Exception unused) {
                        }
                    }
                    lc0 lc0Var = zVar.f53563p;
                    if (lc0Var != null) {
                        lc0Var.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}

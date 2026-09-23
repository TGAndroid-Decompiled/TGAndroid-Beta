package zg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ac0;
import yh.u3;
public final class u implements Runnable {
    public final int f49122a;
    public final c0 f49123b;

    public u(c0 c0Var, int i10) {
        this.f49122a = i10;
        this.f49123b = c0Var;
    }

    @Override
    public final void run() {
        switch (this.f49122a) {
            case 0:
                this.f49123b.f48927a.invalidate();
                return;
            default:
                c0 c0Var = this.f49123b;
                u3 u3Var = c0Var.f48929c;
                if (u3Var.getParent() != null) {
                    if (c0Var.d) {
                        AndroidUtilities.removeFromParent(u3Var);
                    } else {
                        try {
                            c0Var.f48928b.removeView(u3Var);
                        } catch (Exception unused) {
                        }
                    }
                    ac0 ac0Var = c0Var.f48939p;
                    if (ac0Var != null) {
                        ac0Var.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}

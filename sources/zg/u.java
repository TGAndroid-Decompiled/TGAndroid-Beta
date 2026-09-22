package zg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bc0;
import yh.v3;
public final class u implements Runnable {
    public final int f49171a;
    public final c0 f49172b;

    public u(c0 c0Var, int i10) {
        this.f49171a = i10;
        this.f49172b = c0Var;
    }

    @Override
    public final void run() {
        switch (this.f49171a) {
            case 0:
                this.f49172b.f48976a.invalidate();
                return;
            default:
                c0 c0Var = this.f49172b;
                v3 v3Var = c0Var.f48978c;
                if (v3Var.getParent() != null) {
                    if (c0Var.d) {
                        AndroidUtilities.removeFromParent(v3Var);
                    } else {
                        try {
                            c0Var.f48977b.removeView(v3Var);
                        } catch (Exception unused) {
                        }
                    }
                    bc0 bc0Var = c0Var.f48988p;
                    if (bc0Var != null) {
                        bc0Var.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}

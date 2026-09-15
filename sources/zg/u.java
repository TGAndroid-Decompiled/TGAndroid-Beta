package zg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bc0;
import yh.w3;
public final class u implements Runnable {
    public final int f49178a;
    public final c0 f49179b;

    public u(c0 c0Var, int i10) {
        this.f49178a = i10;
        this.f49179b = c0Var;
    }

    @Override
    public final void run() {
        switch (this.f49178a) {
            case 0:
                this.f49179b.f48983a.invalidate();
                return;
            default:
                c0 c0Var = this.f49179b;
                w3 w3Var = c0Var.f48985c;
                if (w3Var.getParent() != null) {
                    if (c0Var.d) {
                        AndroidUtilities.removeFromParent(w3Var);
                    } else {
                        try {
                            c0Var.f48984b.removeView(w3Var);
                        } catch (Exception unused) {
                        }
                    }
                    bc0 bc0Var = c0Var.f48995p;
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

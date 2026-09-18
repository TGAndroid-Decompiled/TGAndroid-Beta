package zg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.kc0;
import yh.u3;
public final class u implements Runnable {
    public final int f49430a;
    public final b0 f49431b;

    public u(b0 b0Var, int i10) {
        this.f49430a = i10;
        this.f49431b = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f49430a) {
            case 0:
                this.f49431b.f49226a.invalidate();
                return;
            default:
                b0 b0Var = this.f49431b;
                u3 u3Var = b0Var.f49228c;
                if (u3Var.getParent() != null) {
                    if (b0Var.d) {
                        AndroidUtilities.removeFromParent(u3Var);
                    } else {
                        try {
                            b0Var.f49227b.removeView(u3Var);
                        } catch (Exception unused) {
                        }
                    }
                    kc0 kc0Var = b0Var.f49238p;
                    if (kc0Var != null) {
                        kc0Var.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}

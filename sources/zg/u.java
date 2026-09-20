package zg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jc0;
import yh.u3;
public final class u implements Runnable {
    public final int f49476a;
    public final b0 f49477b;

    public u(b0 b0Var, int i10) {
        this.f49476a = i10;
        this.f49477b = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f49476a) {
            case 0:
                this.f49477b.f49272a.invalidate();
                return;
            default:
                b0 b0Var = this.f49477b;
                u3 u3Var = b0Var.f49274c;
                if (u3Var.getParent() != null) {
                    if (b0Var.d) {
                        AndroidUtilities.removeFromParent(u3Var);
                    } else {
                        try {
                            b0Var.f49273b.removeView(u3Var);
                        } catch (Exception unused) {
                        }
                    }
                    jc0 jc0Var = b0Var.f49284p;
                    if (jc0Var != null) {
                        jc0Var.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}

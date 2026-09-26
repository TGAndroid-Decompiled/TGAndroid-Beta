package zg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jc0;
import yh.t3;
public final class u implements Runnable {
    public final int f49448a;
    public final b0 f49449b;

    public u(b0 b0Var, int i10) {
        this.f49448a = i10;
        this.f49449b = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f49448a) {
            case 0:
                this.f49449b.f49244a.invalidate();
                return;
            default:
                b0 b0Var = this.f49449b;
                t3 t3Var = b0Var.f49246c;
                if (t3Var.getParent() != null) {
                    if (b0Var.d) {
                        AndroidUtilities.removeFromParent(t3Var);
                    } else {
                        try {
                            b0Var.f49245b.removeView(t3Var);
                        } catch (Exception unused) {
                        }
                    }
                    jc0 jc0Var = b0Var.f49256p;
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

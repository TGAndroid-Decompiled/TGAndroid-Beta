package zg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jc0;
import yh.u3;
public final class v implements Runnable {
    public final int f49499a;
    public final c0 f49500b;

    public v(c0 c0Var, int i10) {
        this.f49499a = i10;
        this.f49500b = c0Var;
    }

    @Override
    public final void run() {
        switch (this.f49499a) {
            case 0:
                this.f49500b.f49303a.invalidate();
                return;
            default:
                c0 c0Var = this.f49500b;
                u3 u3Var = c0Var.f49305c;
                if (u3Var.getParent() != null) {
                    if (c0Var.d) {
                        AndroidUtilities.removeFromParent(u3Var);
                    } else {
                        try {
                            c0Var.f49304b.removeView(u3Var);
                        } catch (Exception unused) {
                        }
                    }
                    jc0 jc0Var = c0Var.f49315p;
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

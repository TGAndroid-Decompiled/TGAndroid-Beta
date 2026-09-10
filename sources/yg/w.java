package yg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.kc0;
import xh.t3;
public final class w implements Runnable {
    public final int f47157a;
    public final c0 f47158b;

    public w(c0 c0Var, int i10) {
        this.f47157a = i10;
        this.f47158b = c0Var;
    }

    @Override
    public final void run() {
        switch (this.f47157a) {
            case 0:
                this.f47158b.f46950a.invalidate();
                return;
            default:
                c0 c0Var = this.f47158b;
                t3 t3Var = c0Var.f46952c;
                if (t3Var.getParent() != null) {
                    if (c0Var.d) {
                        AndroidUtilities.removeFromParent(t3Var);
                    } else {
                        try {
                            c0Var.f46951b.removeView(t3Var);
                        } catch (Exception unused) {
                        }
                    }
                    kc0 kc0Var = c0Var.f46962p;
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

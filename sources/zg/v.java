package zg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jc0;
import yh.t3;
public final class v implements Runnable {
    public final int f49497a;
    public final c0 f49498b;

    public v(c0 c0Var, int i10) {
        this.f49497a = i10;
        this.f49498b = c0Var;
    }

    @Override
    public final void run() {
        switch (this.f49497a) {
            case 0:
                this.f49498b.f49299a.invalidate();
                return;
            default:
                c0 c0Var = this.f49498b;
                t3 t3Var = c0Var.f49301c;
                if (t3Var.getParent() != null) {
                    if (c0Var.d) {
                        AndroidUtilities.removeFromParent(t3Var);
                    } else {
                        try {
                            c0Var.f49300b.removeView(t3Var);
                        } catch (Exception unused) {
                        }
                    }
                    jc0 jc0Var = c0Var.f49311p;
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

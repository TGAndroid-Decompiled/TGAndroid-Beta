package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class un0 implements Runnable {
    public final int f42540a;
    public final xo0 f42541b;

    public un0(xo0 xo0Var, int i10) {
        this.f42540a = i10;
        this.f42541b = xo0Var;
    }

    @Override
    public final void run() {
        switch (this.f42540a) {
            case 0:
                xo0 xo0Var = this.f42541b;
                xo0Var.f44099f[0].requestFocus();
                AndroidUtilities.showKeyboard(xo0Var.f44099f[0]);
                return;
            case 1:
                this.f42541b.t0();
                return;
            case 2:
                xo0 xo0Var2 = this.f42541b;
                xo0Var2.getMessagesController().newMessageCallback = null;
                if (xo0Var2.f44101f1 == 3 && !xo0Var2.isFinishing()) {
                    xo0Var2.f44101f1 = 4;
                    wo0 wo0Var = xo0Var2.Z0;
                    if (wo0Var != null) {
                        wo0Var.a(4);
                    }
                    xo0Var2.finishFragment();
                    return;
                } else if (xo0Var2.f44101f1 == 1 && !xo0Var2.isFinishing()) {
                    xo0Var2.finishFragment();
                    return;
                } else {
                    return;
                }
            default:
                xo0 xo0Var3 = this.f42541b;
                if (xo0Var3.f44094d0 != null) {
                    xo0Var3.w0();
                    xo0Var3.f44094d0 = null;
                    return;
                }
                return;
        }
    }
}

package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class un0 implements Runnable {
    public final int f41218a;
    public final xo0 f41219b;

    public un0(xo0 xo0Var, int i10) {
        this.f41218a = i10;
        this.f41219b = xo0Var;
    }

    @Override
    public final void run() {
        switch (this.f41218a) {
            case 0:
                xo0 xo0Var = this.f41219b;
                xo0Var.f42846f[0].requestFocus();
                AndroidUtilities.showKeyboard(xo0Var.f42846f[0]);
                return;
            case 1:
                this.f41219b.t0();
                return;
            case 2:
                xo0 xo0Var2 = this.f41219b;
                xo0Var2.getMessagesController().newMessageCallback = null;
                if (xo0Var2.f42848f1 == 3 && !xo0Var2.isFinishing()) {
                    xo0Var2.f42848f1 = 4;
                    wo0 wo0Var = xo0Var2.Z0;
                    if (wo0Var != null) {
                        wo0Var.a(4);
                    }
                    xo0Var2.finishFragment();
                    return;
                } else if (xo0Var2.f42848f1 == 1 && !xo0Var2.isFinishing()) {
                    xo0Var2.finishFragment();
                    return;
                } else {
                    return;
                }
            default:
                xo0 xo0Var3 = this.f41219b;
                if (xo0Var3.f42841d0 != null) {
                    xo0Var3.w0();
                    xo0Var3.f42841d0 = null;
                    return;
                }
                return;
        }
    }
}

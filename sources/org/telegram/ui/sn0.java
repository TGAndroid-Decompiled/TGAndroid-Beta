package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class sn0 implements Runnable {
    public final int f41738a;
    public final vo0 f41739b;

    public sn0(vo0 vo0Var, int i10) {
        this.f41738a = i10;
        this.f41739b = vo0Var;
    }

    @Override
    public final void run() {
        switch (this.f41738a) {
            case 0:
                vo0 vo0Var = this.f41739b;
                vo0Var.f42927f[0].requestFocus();
                AndroidUtilities.showKeyboard(vo0Var.f42927f[0]);
                return;
            case 1:
                this.f41739b.t0();
                return;
            case 2:
                vo0 vo0Var2 = this.f41739b;
                vo0Var2.getMessagesController().newMessageCallback = null;
                if (vo0Var2.f42929f1 == 3 && !vo0Var2.isFinishing()) {
                    vo0Var2.f42929f1 = 4;
                    uo0 uo0Var = vo0Var2.Z0;
                    if (uo0Var != null) {
                        uo0Var.a(4);
                    }
                    vo0Var2.finishFragment();
                    return;
                } else if (vo0Var2.f42929f1 == 1 && !vo0Var2.isFinishing()) {
                    vo0Var2.finishFragment();
                    return;
                } else {
                    return;
                }
            default:
                vo0 vo0Var3 = this.f41739b;
                if (vo0Var3.f42922d0 != null) {
                    vo0Var3.w0();
                    vo0Var3.f42922d0 = null;
                    return;
                }
                return;
        }
    }
}

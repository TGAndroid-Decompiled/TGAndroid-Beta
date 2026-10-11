package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class rn0 implements Runnable {
    public final int f41512a;
    public final uo0 f41513b;

    public rn0(uo0 uo0Var, int i10) {
        this.f41512a = i10;
        this.f41513b = uo0Var;
    }

    @Override
    public final void run() {
        switch (this.f41512a) {
            case 0:
                uo0 uo0Var = this.f41513b;
                uo0Var.f42740f[0].requestFocus();
                AndroidUtilities.showKeyboard(uo0Var.f42740f[0]);
                return;
            case 1:
                this.f41513b.t0();
                return;
            case 2:
                uo0 uo0Var2 = this.f41513b;
                uo0Var2.getMessagesController().newMessageCallback = null;
                if (uo0Var2.f42742f1 == 3 && !uo0Var2.isFinishing()) {
                    uo0Var2.f42742f1 = 4;
                    to0 to0Var = uo0Var2.Z0;
                    if (to0Var != null) {
                        to0Var.a(4);
                    }
                    uo0Var2.finishFragment();
                    return;
                } else if (uo0Var2.f42742f1 == 1 && !uo0Var2.isFinishing()) {
                    uo0Var2.finishFragment();
                    return;
                } else {
                    return;
                }
            default:
                uo0 uo0Var3 = this.f41513b;
                if (uo0Var3.f42735d0 != null) {
                    uo0Var3.w0();
                    uo0Var3.f42735d0 = null;
                    return;
                }
                return;
        }
    }
}

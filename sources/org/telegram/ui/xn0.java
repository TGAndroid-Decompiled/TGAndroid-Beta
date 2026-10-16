package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class xn0 implements Runnable {
    public final int f41603a;
    public final ap0 f41604b;

    public xn0(ap0 ap0Var, int i10) {
        this.f41603a = i10;
        this.f41604b = ap0Var;
    }

    @Override
    public final void run() {
        switch (this.f41603a) {
            case 0:
                ap0 ap0Var = this.f41604b;
                ap0Var.f34020f[0].requestFocus();
                AndroidUtilities.showKeyboard(ap0Var.f34020f[0]);
                return;
            case 1:
                this.f41604b.t0();
                return;
            case 2:
                ap0 ap0Var2 = this.f41604b;
                ap0Var2.getMessagesController().newMessageCallback = null;
                if (ap0Var2.f34022f1 == 3 && !ap0Var2.isFinishing()) {
                    ap0Var2.f34022f1 = 4;
                    zo0 zo0Var = ap0Var2.Z0;
                    if (zo0Var != null) {
                        zo0Var.a(4);
                    }
                    ap0Var2.finishFragment();
                    return;
                } else if (ap0Var2.f34022f1 == 1 && !ap0Var2.isFinishing()) {
                    ap0Var2.finishFragment();
                    return;
                } else {
                    return;
                }
            default:
                ap0 ap0Var3 = this.f41604b;
                if (ap0Var3.f34016d0 != null) {
                    ap0Var3.w0();
                    ap0Var3.f34016d0 = null;
                    return;
                }
                return;
        }
    }
}

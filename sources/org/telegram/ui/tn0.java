package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class tn0 implements Runnable {
    public final int f37755a;
    public final wo0 f37756b;

    public tn0(wo0 wo0Var, int i10) {
        this.f37755a = i10;
        this.f37756b = wo0Var;
    }

    @Override
    public final void run() {
        switch (this.f37755a) {
            case 0:
                wo0 wo0Var = this.f37756b;
                wo0Var.f39319f[0].requestFocus();
                AndroidUtilities.showKeyboard(wo0Var.f39319f[0]);
                return;
            case 1:
                this.f37756b.t0();
                return;
            case 2:
                wo0 wo0Var2 = this.f37756b;
                wo0Var2.getMessagesController().newMessageCallback = null;
                if (wo0Var2.f39321f1 == 3 && !wo0Var2.isFinishing()) {
                    wo0Var2.f39321f1 = 4;
                    vo0 vo0Var = wo0Var2.Z0;
                    if (vo0Var != null) {
                        vo0Var.a(4);
                    }
                    wo0Var2.finishFragment();
                    return;
                } else if (wo0Var2.f39321f1 == 1 && !wo0Var2.isFinishing()) {
                    wo0Var2.finishFragment();
                    return;
                } else {
                    return;
                }
            default:
                wo0 wo0Var3 = this.f37756b;
                if (wo0Var3.f39315d0 != null) {
                    wo0Var3.w0();
                    wo0Var3.f39315d0 = null;
                    return;
                }
                return;
        }
    }
}

package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class tn0 implements Runnable {
    public final int f36976a;
    public final wo0 f36977b;

    public tn0(wo0 wo0Var, int i10) {
        this.f36976a = i10;
        this.f36977b = wo0Var;
    }

    @Override
    public final void run() {
        switch (this.f36976a) {
            case 0:
                wo0 wo0Var = this.f36977b;
                wo0Var.f38267f[0].requestFocus();
                AndroidUtilities.showKeyboard(wo0Var.f38267f[0]);
                return;
            case 1:
                this.f36977b.t0();
                return;
            case 2:
                wo0 wo0Var2 = this.f36977b;
                wo0Var2.getMessagesController().newMessageCallback = null;
                if (wo0Var2.f38269f1 == 3 && !wo0Var2.isFinishing()) {
                    wo0Var2.f38269f1 = 4;
                    vo0 vo0Var = wo0Var2.Z0;
                    if (vo0Var != null) {
                        vo0Var.a(4);
                    }
                    wo0Var2.finishFragment();
                    return;
                } else if (wo0Var2.f38269f1 == 1 && !wo0Var2.isFinishing()) {
                    wo0Var2.finishFragment();
                    return;
                } else {
                    return;
                }
            default:
                wo0 wo0Var3 = this.f36977b;
                if (wo0Var3.f38263d0 != null) {
                    wo0Var3.w0();
                    wo0Var3.f38263d0 = null;
                    return;
                }
                return;
        }
    }
}

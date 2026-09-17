package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class vn0 implements Runnable {
    public final int f38479a;
    public final yo0 f38480b;

    public vn0(yo0 yo0Var, int i10) {
        this.f38479a = i10;
        this.f38480b = yo0Var;
    }

    @Override
    public final void run() {
        switch (this.f38479a) {
            case 0:
                yo0 yo0Var = this.f38480b;
                yo0Var.f39957f[0].requestFocus();
                AndroidUtilities.showKeyboard(yo0Var.f39957f[0]);
                return;
            case 1:
                this.f38480b.t0();
                return;
            case 2:
                yo0 yo0Var2 = this.f38480b;
                yo0Var2.getMessagesController().newMessageCallback = null;
                if (yo0Var2.f39959f1 == 3 && !yo0Var2.isFinishing()) {
                    yo0Var2.f39959f1 = 4;
                    xo0 xo0Var = yo0Var2.Z0;
                    if (xo0Var != null) {
                        xo0Var.a(4);
                    }
                    yo0Var2.finishFragment();
                    return;
                } else if (yo0Var2.f39959f1 == 1 && !yo0Var2.isFinishing()) {
                    yo0Var2.finishFragment();
                    return;
                } else {
                    return;
                }
            default:
                yo0 yo0Var3 = this.f38480b;
                if (yo0Var3.f39953d0 != null) {
                    yo0Var3.w0();
                    yo0Var3.f39953d0 = null;
                    return;
                }
                return;
        }
    }
}

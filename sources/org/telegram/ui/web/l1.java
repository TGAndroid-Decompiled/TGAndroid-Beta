package org.telegram.ui.web;

import org.telegram.messenger.AndroidUtilities;
public final class l1 implements Runnable {
    public final int f43928a;
    public final org.telegram.ui.n0 f43929b;

    public l1(org.telegram.ui.n0 n0Var, int i9) {
        this.f43928a = i9;
        this.f43929b = n0Var;
    }

    @Override
    public final void run() {
        switch (this.f43928a) {
            case 0:
                org.telegram.ui.n0 n0Var = this.f43929b;
                n0Var.f44000w0 = true;
                if (n0Var.getParent() != null) {
                    n0Var.getParent().requestDisallowInterceptTouchEvent(true);
                }
                try {
                    n0Var.performHapticFeedback(0, 1);
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                org.telegram.ui.n0 n0Var2 = this.f43929b;
                gh.o oVar = n0Var2.U;
                if (n0Var2.S) {
                    oVar.requestFocus();
                    AndroidUtilities.showKeyboard(oVar);
                    return;
                }
                oVar.clearFocus();
                AndroidUtilities.hideKeyboard(oVar);
                return;
        }
    }
}

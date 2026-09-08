package org.telegram.ui.web;

import org.telegram.messenger.AndroidUtilities;
public final class r1 implements Runnable {
    public final int f42258a;
    public final org.telegram.ui.k0 f42259b;

    public r1(org.telegram.ui.k0 k0Var, int i10) {
        this.f42258a = i10;
        this.f42259b = k0Var;
    }

    @Override
    public final void run() {
        switch (this.f42258a) {
            case 0:
                org.telegram.ui.k0 k0Var = this.f42259b;
                k0Var.A0 = true;
                if (k0Var.getParent() != null) {
                    k0Var.getParent().requestDisallowInterceptTouchEvent(true);
                }
                try {
                    k0Var.performHapticFeedback(0, 1);
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                org.telegram.ui.k0 k0Var2 = this.f42259b;
                gi.o oVar = k0Var2.f42304b0;
                if (k0Var2.W) {
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

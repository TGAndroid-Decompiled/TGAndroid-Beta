package org.telegram.ui.web;

import org.telegram.messenger.AndroidUtilities;
public final class p1 implements Runnable {
    public final int f43623a;
    public final org.telegram.ui.k0 f43624b;

    public p1(org.telegram.ui.k0 k0Var, int i10) {
        this.f43623a = i10;
        this.f43624b = k0Var;
    }

    @Override
    public final void run() {
        switch (this.f43623a) {
            case 0:
                org.telegram.ui.k0 k0Var = this.f43624b;
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
                org.telegram.ui.k0 k0Var2 = this.f43624b;
                fi.o oVar = k0Var2.f43667b0;
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

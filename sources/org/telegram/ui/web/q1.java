package org.telegram.ui.web;

import org.telegram.messenger.AndroidUtilities;
public final class q1 implements Runnable {
    public final int f38911a;
    public final org.telegram.ui.k0 f38912b;

    public q1(org.telegram.ui.k0 k0Var, int i10) {
        this.f38911a = i10;
        this.f38912b = k0Var;
    }

    @Override
    public final void run() {
        switch (this.f38911a) {
            case 0:
                org.telegram.ui.k0 k0Var = this.f38912b;
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
                org.telegram.ui.k0 k0Var2 = this.f38912b;
                fi.o oVar = k0Var2.f38952b0;
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

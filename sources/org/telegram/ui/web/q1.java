package org.telegram.ui.web;

import org.telegram.messenger.AndroidUtilities;
public final class q1 implements Runnable {
    public final int f38916a;
    public final org.telegram.ui.k0 f38917b;

    public q1(org.telegram.ui.k0 k0Var, int i10) {
        this.f38916a = i10;
        this.f38917b = k0Var;
    }

    @Override
    public final void run() {
        switch (this.f38916a) {
            case 0:
                org.telegram.ui.k0 k0Var = this.f38917b;
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
                org.telegram.ui.k0 k0Var2 = this.f38917b;
                fi.o oVar = k0Var2.f38957b0;
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

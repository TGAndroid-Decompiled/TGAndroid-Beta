package org.telegram.ui.web;

import org.telegram.messenger.AndroidUtilities;
public final class p1 implements Runnable {
    public final int f38807a;
    public final org.telegram.ui.l0 f38808b;

    public p1(org.telegram.ui.l0 l0Var, int i10) {
        this.f38807a = i10;
        this.f38808b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f38807a) {
            case 0:
                org.telegram.ui.l0 l0Var = this.f38808b;
                l0Var.A0 = true;
                if (l0Var.getParent() != null) {
                    l0Var.getParent().requestDisallowInterceptTouchEvent(true);
                }
                try {
                    l0Var.performHapticFeedback(0, 1);
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                org.telegram.ui.l0 l0Var2 = this.f38808b;
                fi.o oVar = l0Var2.f38848b0;
                if (l0Var2.W) {
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

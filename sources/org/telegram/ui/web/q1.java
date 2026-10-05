package org.telegram.ui.web;

import org.telegram.messenger.AndroidUtilities;
public final class q1 implements Runnable {
    public final int f42341a;
    public final org.telegram.ui.l0 f42342b;

    public q1(org.telegram.ui.l0 l0Var, int i10) {
        this.f42341a = i10;
        this.f42342b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f42341a) {
            case 0:
                org.telegram.ui.l0 l0Var = this.f42342b;
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
                org.telegram.ui.l0 l0Var2 = this.f42342b;
                fi.o oVar = l0Var2.f42387b0;
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

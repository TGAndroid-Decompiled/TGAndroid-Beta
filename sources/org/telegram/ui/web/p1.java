package org.telegram.ui.web;

import org.telegram.messenger.AndroidUtilities;
public final class p1 implements Runnable {
    public final int f41461a;
    public final org.telegram.ui.m0 f41462b;

    public p1(org.telegram.ui.m0 m0Var, int i10) {
        this.f41461a = i10;
        this.f41462b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f41461a) {
            case 0:
                org.telegram.ui.m0 m0Var = this.f41462b;
                m0Var.A0 = true;
                if (m0Var.getParent() != null) {
                    m0Var.getParent().requestDisallowInterceptTouchEvent(true);
                }
                try {
                    m0Var.performHapticFeedback(0, 1);
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                org.telegram.ui.m0 m0Var2 = this.f41462b;
                gi.o oVar = m0Var2.f41503b0;
                if (m0Var2.W) {
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

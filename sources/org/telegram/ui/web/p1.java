package org.telegram.ui.web;

import org.telegram.messenger.AndroidUtilities;
public final class p1 implements Runnable {
    public final int f44864a;
    public final org.telegram.ui.l0 f44865b;

    public p1(org.telegram.ui.l0 l0Var, int i10) {
        this.f44864a = i10;
        this.f44865b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f44864a) {
            case 0:
                org.telegram.ui.l0 l0Var = this.f44865b;
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
                org.telegram.ui.l0 l0Var2 = this.f44865b;
                bi.t tVar = l0Var2.f44906b0;
                if (l0Var2.W) {
                    tVar.requestFocus();
                    AndroidUtilities.showKeyboard(tVar);
                    return;
                }
                tVar.clearFocus();
                AndroidUtilities.hideKeyboard(tVar);
                return;
        }
    }
}

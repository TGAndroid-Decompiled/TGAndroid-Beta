package org.telegram.ui.web;

import org.telegram.messenger.AndroidUtilities;
public final class p1 implements Runnable {
    public final int f45353a;
    public final org.telegram.ui.l0 f45354b;

    public p1(org.telegram.ui.l0 l0Var, int i10) {
        this.f45353a = i10;
        this.f45354b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f45353a) {
            case 0:
                org.telegram.ui.l0 l0Var = this.f45354b;
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
                org.telegram.ui.l0 l0Var2 = this.f45354b;
                bi.t tVar = l0Var2.f45395b0;
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

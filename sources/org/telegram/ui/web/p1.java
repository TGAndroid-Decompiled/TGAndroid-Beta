package org.telegram.ui.web;

import org.telegram.messenger.AndroidUtilities;
public final class p1 implements Runnable {
    public final int f42704a;
    public final org.telegram.ui.n0 f42705b;

    public p1(org.telegram.ui.n0 n0Var, int i10) {
        this.f42704a = i10;
        this.f42705b = n0Var;
    }

    @Override
    public final void run() {
        switch (this.f42704a) {
            case 0:
                org.telegram.ui.n0 n0Var = this.f42705b;
                n0Var.A0 = true;
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
                org.telegram.ui.n0 n0Var2 = this.f42705b;
                ai.t tVar = n0Var2.f42749b0;
                if (n0Var2.W) {
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

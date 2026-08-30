package org.telegram.ui.web;

import org.telegram.messenger.AndroidUtilities;
public final class n1 implements Runnable {
    public final int f39589a;
    public final org.telegram.ui.m0 f39590b;

    public n1(org.telegram.ui.m0 m0Var, int i10) {
        this.f39589a = i10;
        this.f39590b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f39589a) {
            case 0:
                org.telegram.ui.m0 m0Var = this.f39590b;
                m0Var.f39658x0 = true;
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
                org.telegram.ui.m0 m0Var2 = this.f39590b;
                lh.n nVar = m0Var2.V;
                if (m0Var2.T) {
                    nVar.requestFocus();
                    AndroidUtilities.showKeyboard(nVar);
                    return;
                }
                nVar.clearFocus();
                AndroidUtilities.hideKeyboard(nVar);
                return;
        }
    }
}

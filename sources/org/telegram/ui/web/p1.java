package org.telegram.ui.web;

import org.telegram.messenger.AndroidUtilities;
public final class p1 implements Runnable {
    public final int f43218a;
    public final org.telegram.ui.m0 f43219b;

    public p1(org.telegram.ui.m0 m0Var, int i10) {
        this.f43218a = i10;
        this.f43219b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f43218a) {
            case 0:
                org.telegram.ui.m0 m0Var = this.f43219b;
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
                org.telegram.ui.m0 m0Var2 = this.f43219b;
                ai.t tVar = m0Var2.f43260b0;
                if (m0Var2.W) {
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

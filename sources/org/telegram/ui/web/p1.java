package org.telegram.ui.web;

import org.telegram.messenger.AndroidUtilities;
public final class p1 implements Runnable {
    public final int f39555a;
    public final org.telegram.ui.o0 f39556b;

    public p1(org.telegram.ui.o0 o0Var, int i10) {
        this.f39555a = i10;
        this.f39556b = o0Var;
    }

    @Override
    public final void run() {
        switch (this.f39555a) {
            case 0:
                org.telegram.ui.o0 o0Var = this.f39556b;
                o0Var.f39624x0 = true;
                if (o0Var.getParent() != null) {
                    o0Var.getParent().requestDisallowInterceptTouchEvent(true);
                }
                try {
                    o0Var.performHapticFeedback(0, 1);
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                org.telegram.ui.o0 o0Var2 = this.f39556b;
                lh.n nVar = o0Var2.V;
                if (o0Var2.T) {
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

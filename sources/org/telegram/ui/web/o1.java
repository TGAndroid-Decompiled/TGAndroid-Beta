package org.telegram.ui.web;

import org.telegram.messenger.AndroidUtilities;
public final class o1 implements Runnable {
    public final int f42720a;
    public final org.telegram.ui.n0 f42721b;

    public o1(org.telegram.ui.n0 n0Var, int i10) {
        this.f42720a = i10;
        this.f42721b = n0Var;
    }

    @Override
    public final void run() {
        switch (this.f42720a) {
            case 0:
                org.telegram.ui.n0 n0Var = this.f42721b;
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
                org.telegram.ui.n0 n0Var2 = this.f42721b;
                ai.t tVar = n0Var2.f42765b0;
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

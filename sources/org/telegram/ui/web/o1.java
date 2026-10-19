package org.telegram.ui.web;

import org.telegram.messenger.AndroidUtilities;
public final class o1 implements Runnable {
    public final int f42737a;
    public final org.telegram.ui.n0 f42738b;

    public o1(org.telegram.ui.n0 n0Var, int i10) {
        this.f42737a = i10;
        this.f42738b = n0Var;
    }

    @Override
    public final void run() {
        switch (this.f42737a) {
            case 0:
                org.telegram.ui.n0 n0Var = this.f42738b;
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
                org.telegram.ui.n0 n0Var2 = this.f42738b;
                ai.t tVar = n0Var2.f42782b0;
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

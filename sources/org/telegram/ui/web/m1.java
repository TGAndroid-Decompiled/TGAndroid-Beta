package org.telegram.ui.web;

import org.telegram.messenger.AndroidUtilities;

public final class m1 implements Runnable {

    public final int f43915a;

    public final org.telegram.ui.o0 f43916b;

    public m1(org.telegram.ui.o0 o0Var, int i10) {
        this.f43915a = i10;
        this.f43916b = o0Var;
    }

    @Override
    public final void run() {
        switch (this.f43915a) {
            case 0:
                org.telegram.ui.o0 o0Var = this.f43916b;
                o0Var.f43987w0 = true;
                if (o0Var.getParent() != null) {
                    o0Var.getParent().requestDisallowInterceptTouchEvent(true);
                }
                try {
                    o0Var.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                org.telegram.ui.o0 o0Var2 = this.f43916b;
                hh.o oVar = o0Var2.U;
                if (!o0Var2.S) {
                    oVar.clearFocus();
                    AndroidUtilities.hideKeyboard(oVar);
                } else {
                    oVar.requestFocus();
                    AndroidUtilities.showKeyboard(oVar);
                }
                break;
        }
    }
}

package org.telegram.ui.web;

import org.telegram.messenger.AndroidUtilities;
public final class m1 implements Runnable {
    public final int f44118a;
    public final org.telegram.ui.o0 f44119b;

    public m1(org.telegram.ui.o0 o0Var, int i10) {
        this.f44118a = i10;
        this.f44119b = o0Var;
    }

    @Override
    public final void run() {
        switch (this.f44118a) {
            case 0:
                org.telegram.ui.o0 o0Var = this.f44119b;
                o0Var.f44190w0 = true;
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
                org.telegram.ui.o0 o0Var2 = this.f44119b;
                jh.m mVar = o0Var2.U;
                if (o0Var2.S) {
                    mVar.requestFocus();
                    AndroidUtilities.showKeyboard(mVar);
                    return;
                }
                mVar.clearFocus();
                AndroidUtilities.hideKeyboard(mVar);
                return;
        }
    }
}

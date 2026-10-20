package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class zc0 implements Runnable {
    public final int f43721a;
    public final ne0 f43722b;

    public zc0(ne0 ne0Var, int i10) {
        this.f43721a = i10;
        this.f43722b = ne0Var;
    }

    @Override
    public final void run() {
        switch (this.f43721a) {
            case 0:
                this.f43722b.L.m();
                return;
            case 1:
                ne0 ne0Var = this.f43722b;
                ne0Var.M = null;
                ne0Var.N = null;
                ne0Var.p(true);
                ne0Var.e.h(null, null, ne0Var.f39556f, null);
                jd jdVar = ne0Var.f39557n;
                org.telegram.ui.Components.vj0 vj0Var = ne0Var.I;
                jdVar.setAnimation(vj0Var);
                vj0Var.M(0);
                ne0Var.K = true;
                return;
            case 2:
                this.f43722b.K = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f43722b.f39555c;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    return;
                }
                return;
        }
    }
}

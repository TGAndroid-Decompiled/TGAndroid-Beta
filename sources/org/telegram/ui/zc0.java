package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class zc0 implements Runnable {
    public final int f43720a;
    public final ne0 f43721b;

    public zc0(ne0 ne0Var, int i10) {
        this.f43720a = i10;
        this.f43721b = ne0Var;
    }

    @Override
    public final void run() {
        switch (this.f43720a) {
            case 0:
                this.f43721b.L.m();
                return;
            case 1:
                ne0 ne0Var = this.f43721b;
                ne0Var.M = null;
                ne0Var.N = null;
                ne0Var.p(true);
                ne0Var.e.h(null, null, ne0Var.f39554f, null);
                jd jdVar = ne0Var.f39555n;
                org.telegram.ui.Components.uj0 uj0Var = ne0Var.I;
                jdVar.setAnimation(uj0Var);
                uj0Var.M(0);
                ne0Var.K = true;
                return;
            case 2:
                this.f43721b.K = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f43721b.f39553c;
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

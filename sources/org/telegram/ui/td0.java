package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class td0 implements Runnable {
    public final int f41977a;
    public final gf0 f41978b;

    public td0(gf0 gf0Var, int i10) {
        this.f41977a = i10;
        this.f41978b = gf0Var;
    }

    @Override
    public final void run() {
        switch (this.f41977a) {
            case 0:
                this.f41978b.L.m();
                return;
            case 1:
                gf0 gf0Var = this.f41978b;
                gf0Var.M = null;
                gf0Var.N = null;
                gf0Var.p(true);
                gf0Var.f38001e.h(null, null, gf0Var.f38002f, null);
                jd jdVar = gf0Var.f38003n;
                org.telegram.ui.Components.ck0 ck0Var = gf0Var.I;
                jdVar.setAnimation(ck0Var);
                ck0Var.M(0);
                gf0Var.K = true;
                return;
            case 2:
                this.f41978b.K = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f41978b.f38000c;
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

package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class td0 implements Runnable {
    public final int f42023a;
    public final gf0 f42024b;

    public td0(gf0 gf0Var, int i10) {
        this.f42023a = i10;
        this.f42024b = gf0Var;
    }

    @Override
    public final void run() {
        switch (this.f42023a) {
            case 0:
                this.f42024b.L.m();
                return;
            case 1:
                gf0 gf0Var = this.f42024b;
                gf0Var.M = null;
                gf0Var.N = null;
                gf0Var.p(true);
                gf0Var.f38047e.h(null, null, gf0Var.f38048f, null);
                jd jdVar = gf0Var.f38049n;
                org.telegram.ui.Components.dk0 dk0Var = gf0Var.I;
                jdVar.setAnimation(dk0Var);
                dk0Var.M(0);
                gf0Var.K = true;
                return;
            case 2:
                this.f42024b.K = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f42024b.f38046c;
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

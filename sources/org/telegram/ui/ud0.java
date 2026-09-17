package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ud0 implements Runnable {
    public final int f41071a;
    public final hf0 f41072b;

    public ud0(hf0 hf0Var, int i10) {
        this.f41071a = i10;
        this.f41072b = hf0Var;
    }

    @Override
    public final void run() {
        switch (this.f41071a) {
            case 0:
                this.f41072b.L.n();
                return;
            case 1:
                hf0 hf0Var = this.f41072b;
                hf0Var.M = null;
                hf0Var.N = null;
                hf0Var.p(true);
                hf0Var.f36984e.h(null, null, hf0Var.f36985f, null);
                jd jdVar = hf0Var.f36986n;
                org.telegram.ui.Components.xi0 xi0Var = hf0Var.I;
                jdVar.setAnimation(xi0Var);
                xi0Var.K(0);
                hf0Var.K = true;
                return;
            case 2:
                this.f41072b.K = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f41072b.f36983c;
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

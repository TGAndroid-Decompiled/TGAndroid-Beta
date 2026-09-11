package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ud0 implements Runnable {
    public final int f41070a;
    public final hf0 f41071b;

    public ud0(hf0 hf0Var, int i10) {
        this.f41070a = i10;
        this.f41071b = hf0Var;
    }

    @Override
    public final void run() {
        switch (this.f41070a) {
            case 0:
                this.f41071b.L.n();
                return;
            case 1:
                hf0 hf0Var = this.f41071b;
                hf0Var.M = null;
                hf0Var.N = null;
                hf0Var.p(true);
                hf0Var.f36983e.h(null, null, hf0Var.f36984f, null);
                jd jdVar = hf0Var.f36985n;
                org.telegram.ui.Components.xi0 xi0Var = hf0Var.I;
                jdVar.setAnimation(xi0Var);
                xi0Var.K(0);
                hf0Var.K = true;
                return;
            case 2:
                this.f41071b.K = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f41071b.f36982c;
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

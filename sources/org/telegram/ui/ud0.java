package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ud0 implements Runnable {
    public final int f41098a;
    public final hf0 f41099b;

    public ud0(hf0 hf0Var, int i10) {
        this.f41098a = i10;
        this.f41099b = hf0Var;
    }

    @Override
    public final void run() {
        switch (this.f41098a) {
            case 0:
                this.f41099b.L.n();
                return;
            case 1:
                hf0 hf0Var = this.f41099b;
                hf0Var.M = null;
                hf0Var.N = null;
                hf0Var.p(true);
                hf0Var.f37011e.h(null, null, hf0Var.f37012f, null);
                jd jdVar = hf0Var.f37013n;
                org.telegram.ui.Components.xi0 xi0Var = hf0Var.I;
                jdVar.setAnimation(xi0Var);
                xi0Var.K(0);
                hf0Var.K = true;
                return;
            case 2:
                this.f41099b.K = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f41099b.f37010c;
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

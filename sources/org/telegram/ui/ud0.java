package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ud0 implements Runnable {
    public final int f37954a;
    public final hf0 f37955b;

    public ud0(hf0 hf0Var, int i10) {
        this.f37954a = i10;
        this.f37955b = hf0Var;
    }

    @Override
    public final void run() {
        switch (this.f37954a) {
            case 0:
                this.f37955b.L.n();
                return;
            case 1:
                hf0 hf0Var = this.f37955b;
                hf0Var.M = null;
                hf0Var.N = null;
                hf0Var.p(true);
                hf0Var.e.h(null, null, hf0Var.f34246f, null);
                id idVar = hf0Var.f34247n;
                org.telegram.ui.Components.xi0 xi0Var = hf0Var.I;
                idVar.setAnimation(xi0Var);
                xi0Var.M(0);
                hf0Var.K = true;
                return;
            case 2:
                this.f37955b.K = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f37955b.f34245c;
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

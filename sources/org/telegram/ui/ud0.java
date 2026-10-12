package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ud0 implements Runnable {
    public final int f42497a;
    public final hf0 f42498b;

    public ud0(hf0 hf0Var, int i10) {
        this.f42497a = i10;
        this.f42498b = hf0Var;
    }

    @Override
    public final void run() {
        switch (this.f42497a) {
            case 0:
                this.f42498b.L.m();
                return;
            case 1:
                hf0 hf0Var = this.f42498b;
                hf0Var.M = null;
                hf0Var.N = null;
                hf0Var.p(true);
                hf0Var.f38356e.h(null, null, hf0Var.f38357f, null);
                nd ndVar = hf0Var.f38358n;
                org.telegram.ui.Components.fk0 fk0Var = hf0Var.I;
                ndVar.setAnimation(fk0Var);
                fk0Var.M(0);
                hf0Var.K = true;
                return;
            case 2:
                this.f42498b.K = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f42498b.f38355c;
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

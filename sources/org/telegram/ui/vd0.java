package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class vd0 implements Runnable {
    public final int f38465a;
    public final if0 f38466b;

    public vd0(if0 if0Var, int i10) {
        this.f38465a = i10;
        this.f38466b = if0Var;
    }

    @Override
    public final void run() {
        switch (this.f38465a) {
            case 0:
                this.f38466b.L.n();
                return;
            case 1:
                if0 if0Var = this.f38466b;
                if0Var.M = null;
                if0Var.N = null;
                if0Var.p(true);
                if0Var.e.h(null, null, if0Var.f34514f, null);
                jd jdVar = if0Var.f34515n;
                org.telegram.ui.Components.ij0 ij0Var = if0Var.I;
                jdVar.setAnimation(ij0Var);
                ij0Var.M(0);
                if0Var.K = true;
                return;
            case 2:
                this.f38466b.K = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f38466b.f34513c;
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

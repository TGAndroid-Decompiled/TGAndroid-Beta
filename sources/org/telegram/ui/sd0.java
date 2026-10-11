package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class sd0 implements Runnable {
    public final int f41709a;
    public final ff0 f41710b;

    public sd0(ff0 ff0Var, int i10) {
        this.f41709a = i10;
        this.f41710b = ff0Var;
    }

    @Override
    public final void run() {
        switch (this.f41709a) {
            case 0:
                this.f41710b.L.m();
                return;
            case 1:
                ff0 ff0Var = this.f41710b;
                ff0Var.M = null;
                ff0Var.N = null;
                ff0Var.p(true);
                ff0Var.f37665e.h(null, null, ff0Var.f37666f, null);
                id idVar = ff0Var.f37667n;
                org.telegram.ui.Components.ek0 ek0Var = ff0Var.I;
                idVar.setAnimation(ek0Var);
                ek0Var.M(0);
                ff0Var.K = true;
                return;
            case 2:
                this.f41710b.K = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f41710b.f37664c;
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

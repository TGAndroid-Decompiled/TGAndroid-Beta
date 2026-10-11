package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class sd0 implements Runnable {
    public final int f41743a;
    public final ff0 f41744b;

    public sd0(ff0 ff0Var, int i10) {
        this.f41743a = i10;
        this.f41744b = ff0Var;
    }

    @Override
    public final void run() {
        switch (this.f41743a) {
            case 0:
                this.f41744b.L.m();
                return;
            case 1:
                ff0 ff0Var = this.f41744b;
                ff0Var.M = null;
                ff0Var.N = null;
                ff0Var.p(true);
                ff0Var.f37699e.h(null, null, ff0Var.f37700f, null);
                id idVar = ff0Var.f37701n;
                org.telegram.ui.Components.dk0 dk0Var = ff0Var.I;
                idVar.setAnimation(dk0Var);
                dk0Var.M(0);
                ff0Var.K = true;
                return;
            case 2:
                this.f41744b.K = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f41744b.f37698c;
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

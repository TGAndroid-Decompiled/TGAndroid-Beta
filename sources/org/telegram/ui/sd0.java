package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class sd0 implements Runnable {
    public final int f40460a;
    public final ff0 f40461b;

    public sd0(ff0 ff0Var, int i10) {
        this.f40460a = i10;
        this.f40461b = ff0Var;
    }

    @Override
    public final void run() {
        switch (this.f40460a) {
            case 0:
                this.f40461b.L.n();
                return;
            case 1:
                ff0 ff0Var = this.f40461b;
                ff0Var.M = null;
                ff0Var.N = null;
                ff0Var.p(true);
                ff0Var.f36288e.h(null, null, ff0Var.f36289f, null);
                kd kdVar = ff0Var.f36290n;
                org.telegram.ui.Components.kj0 kj0Var = ff0Var.I;
                kdVar.setAnimation(kj0Var);
                kj0Var.M(0);
                ff0Var.K = true;
                return;
            case 2:
                this.f40461b.K = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f40461b.f36287c;
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

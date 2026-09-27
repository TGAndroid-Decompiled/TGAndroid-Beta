package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class rd0 implements Runnable {
    public final int f37102a;
    public final ef0 f37103b;

    public rd0(ef0 ef0Var, int i10) {
        this.f37102a = i10;
        this.f37103b = ef0Var;
    }

    @Override
    public final void run() {
        switch (this.f37102a) {
            case 0:
                this.f37103b.L.n();
                return;
            case 1:
                ef0 ef0Var = this.f37103b;
                ef0Var.M = null;
                ef0Var.N = null;
                ef0Var.p(true);
                ef0Var.e.h(null, null, ef0Var.f33252f, null);
                kd kdVar = ef0Var.f33253n;
                org.telegram.ui.Components.kj0 kj0Var = ef0Var.I;
                kdVar.setAnimation(kj0Var);
                kj0Var.M(0);
                ef0Var.K = true;
                return;
            case 2:
                this.f37103b.K = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f37103b.f33251c;
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

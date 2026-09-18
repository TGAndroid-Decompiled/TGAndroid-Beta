package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class wd0 implements Runnable {
    public final int f38695a;
    public final jf0 f38696b;

    public wd0(jf0 jf0Var, int i10) {
        this.f38695a = i10;
        this.f38696b = jf0Var;
    }

    @Override
    public final void run() {
        switch (this.f38695a) {
            case 0:
                this.f38696b.L.n();
                return;
            case 1:
                jf0 jf0Var = this.f38696b;
                jf0Var.M = null;
                jf0Var.N = null;
                jf0Var.p(true);
                jf0Var.e.h(null, null, jf0Var.f34871f, null);
                kd kdVar = jf0Var.f34872n;
                org.telegram.ui.Components.yi0 yi0Var = jf0Var.I;
                kdVar.setAnimation(yi0Var);
                yi0Var.M(0);
                jf0Var.K = true;
                return;
            case 2:
                this.f38696b.K = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f38696b.f34870c;
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

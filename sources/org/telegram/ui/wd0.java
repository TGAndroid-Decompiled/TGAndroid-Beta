package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class wd0 implements Runnable {
    public final int f38823a;
    public final jf0 f38824b;

    public wd0(jf0 jf0Var, int i10) {
        this.f38823a = i10;
        this.f38824b = jf0Var;
    }

    @Override
    public final void run() {
        switch (this.f38823a) {
            case 0:
                this.f38824b.L.n();
                return;
            case 1:
                jf0 jf0Var = this.f38824b;
                jf0Var.M = null;
                jf0Var.N = null;
                jf0Var.p(true);
                jf0Var.e.h(null, null, jf0Var.f34940f, null);
                jd jdVar = jf0Var.f34941n;
                org.telegram.ui.Components.kj0 kj0Var = jf0Var.I;
                jdVar.setAnimation(kj0Var);
                kj0Var.M(0);
                jf0Var.K = true;
                return;
            case 2:
                this.f38824b.K = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f38824b.f34939c;
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

package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class wd0 implements Runnable {
    public final int f38802a;
    public final jf0 f38803b;

    public wd0(jf0 jf0Var, int i10) {
        this.f38802a = i10;
        this.f38803b = jf0Var;
    }

    @Override
    public final void run() {
        switch (this.f38802a) {
            case 0:
                this.f38803b.L.n();
                return;
            case 1:
                jf0 jf0Var = this.f38803b;
                jf0Var.M = null;
                jf0Var.N = null;
                jf0Var.p(true);
                jf0Var.e.h(null, null, jf0Var.f34915f, null);
                jd jdVar = jf0Var.f34916n;
                org.telegram.ui.Components.hj0 hj0Var = jf0Var.I;
                jdVar.setAnimation(hj0Var);
                hj0Var.M(0);
                jf0Var.K = true;
                return;
            case 2:
                this.f38803b.K = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f38803b.f34914c;
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

package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ud0 implements Runnable {
    public final int f37242a;
    public final hf0 f37243b;

    public ud0(hf0 hf0Var, int i10) {
        this.f37242a = i10;
        this.f37243b = hf0Var;
    }

    @Override
    public final void run() {
        switch (this.f37242a) {
            case 0:
                this.f37243b.L.n();
                return;
            case 1:
                hf0 hf0Var = this.f37243b;
                hf0Var.M = null;
                hf0Var.N = null;
                hf0Var.p(true);
                hf0Var.e.h(null, null, hf0Var.f33375f, null);
                kd kdVar = hf0Var.f33376n;
                org.telegram.ui.Components.hj0 hj0Var = hf0Var.I;
                kdVar.setAnimation(hj0Var);
                hj0Var.M(0);
                hf0Var.K = true;
                return;
            case 2:
                this.f37243b.K = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f37243b.f33374c;
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

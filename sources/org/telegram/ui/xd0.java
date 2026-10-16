package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class xd0 implements Runnable {
    public final int f41545a;
    public final lf0 f41546b;

    public xd0(lf0 lf0Var, int i10) {
        this.f41545a = i10;
        this.f41546b = lf0Var;
    }

    @Override
    public final void run() {
        switch (this.f41545a) {
            case 0:
                this.f41546b.L.m();
                return;
            case 1:
                lf0 lf0Var = this.f41546b;
                lf0Var.M = null;
                lf0Var.N = null;
                lf0Var.p(true);
                lf0Var.e.h(null, null, lf0Var.f37733f, null);
                pd pdVar = lf0Var.f37734n;
                org.telegram.ui.Components.yj0 yj0Var = lf0Var.I;
                pdVar.setAnimation(yj0Var);
                yj0Var.M(0);
                lf0Var.K = true;
                return;
            case 2:
                this.f41546b.K = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f41546b.f37732c;
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

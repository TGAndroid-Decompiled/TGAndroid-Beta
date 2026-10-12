package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class zd0 implements Runnable {
    public final int f42596a;
    public final mf0 f42597b;

    public zd0(mf0 mf0Var, int i10) {
        this.f42596a = i10;
        this.f42597b = mf0Var;
    }

    @Override
    public final void run() {
        switch (this.f42596a) {
            case 0:
                this.f42597b.L.m();
                return;
            case 1:
                mf0 mf0Var = this.f42597b;
                mf0Var.M = null;
                mf0Var.N = null;
                mf0Var.p(true);
                mf0Var.e.h(null, null, mf0Var.f38245f, null);
                pd pdVar = mf0Var.f38246n;
                org.telegram.ui.Components.yj0 yj0Var = mf0Var.I;
                pdVar.setAnimation(yj0Var);
                yj0Var.M(0);
                mf0Var.K = true;
                return;
            case 2:
                this.f42597b.K = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f42597b.f38244c;
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

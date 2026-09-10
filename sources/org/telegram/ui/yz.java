package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class yz implements org.telegram.ui.ActionBar.c2 {
    public final int f39137a;
    public final EditTextBoldCursor f39138b;

    public yz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f39137a = i10;
        this.f39138b = editTextBoldCursor;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f39137a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f39138b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f39138b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f39138b);
                return;
        }
    }
}

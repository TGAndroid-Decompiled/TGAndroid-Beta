package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class yz implements org.telegram.ui.ActionBar.b2 {
    public final int f40045a;
    public final EditTextBoldCursor f40046b;

    public yz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f40045a = i10;
        this.f40046b = editTextBoldCursor;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f40045a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f40046b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f40046b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f40046b);
                return;
        }
    }
}

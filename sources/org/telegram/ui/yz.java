package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class yz implements org.telegram.ui.ActionBar.b2 {
    public final int f40050a;
    public final EditTextBoldCursor f40051b;

    public yz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f40050a = i10;
        this.f40051b = editTextBoldCursor;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f40050a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f40051b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f40051b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f40051b);
                return;
        }
    }
}

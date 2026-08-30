package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class sz implements org.telegram.ui.ActionBar.c2 {
    public final int f38460a;
    public final EditTextBoldCursor f38461b;

    public sz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f38460a = i10;
        this.f38461b = editTextBoldCursor;
    }

    @Override
    public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f38460a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f38461b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f38461b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f38461b);
                return;
        }
    }
}

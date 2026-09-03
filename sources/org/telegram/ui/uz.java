package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class uz implements org.telegram.ui.ActionBar.c2 {
    public final int f38931a;
    public final EditTextBoldCursor f38932b;

    public uz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f38931a = i10;
        this.f38932b = editTextBoldCursor;
    }

    @Override
    public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f38931a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f38932b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f38932b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f38932b);
                return;
        }
    }
}

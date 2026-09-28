package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class sz implements org.telegram.ui.ActionBar.z1 {
    public final int f37895a;
    public final EditTextBoldCursor f37896b;

    public sz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f37895a = i10;
        this.f37896b = editTextBoldCursor;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f37895a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f37896b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f37896b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f37896b);
                return;
        }
    }
}

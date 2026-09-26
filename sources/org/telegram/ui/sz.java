package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class sz implements org.telegram.ui.ActionBar.z1 {
    public final int f37894a;
    public final EditTextBoldCursor f37895b;

    public sz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f37894a = i10;
        this.f37895b = editTextBoldCursor;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f37894a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f37895b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f37895b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f37895b);
                return;
        }
    }
}

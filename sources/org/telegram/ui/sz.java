package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class sz implements org.telegram.ui.ActionBar.z1 {
    public final int f38003a;
    public final EditTextBoldCursor f38004b;

    public sz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f38003a = i10;
        this.f38004b = editTextBoldCursor;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f38003a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f38004b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f38004b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f38004b);
                return;
        }
    }
}

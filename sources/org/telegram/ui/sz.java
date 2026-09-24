package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class sz implements org.telegram.ui.ActionBar.z1 {
    public final int f37878a;
    public final EditTextBoldCursor f37879b;

    public sz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f37878a = i10;
        this.f37879b = editTextBoldCursor;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f37878a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f37879b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f37879b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f37879b);
                return;
        }
    }
}

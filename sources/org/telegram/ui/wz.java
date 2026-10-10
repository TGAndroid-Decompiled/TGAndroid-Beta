package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class wz implements org.telegram.ui.ActionBar.a2 {
    public final int f43816a;
    public final EditTextBoldCursor f43817b;

    public wz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f43816a = i10;
        this.f43817b = editTextBoldCursor;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f43816a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f43817b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f43817b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f43817b);
                return;
        }
    }
}

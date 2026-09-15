package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class wz implements org.telegram.ui.ActionBar.a2 {
    public final int f39415a;
    public final EditTextBoldCursor f39416b;

    public wz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f39415a = i10;
        this.f39416b = editTextBoldCursor;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f39415a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f39416b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f39416b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f39416b);
                return;
        }
    }
}

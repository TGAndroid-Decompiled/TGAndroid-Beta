package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class wz implements org.telegram.ui.ActionBar.a2 {
    public final int f42736a;
    public final EditTextBoldCursor f42737b;

    public wz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f42736a = i10;
        this.f42737b = editTextBoldCursor;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f42736a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f42737b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f42737b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f42737b);
                return;
        }
    }
}

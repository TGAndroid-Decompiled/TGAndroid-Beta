package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class tz implements org.telegram.ui.ActionBar.c2 {
    public final int f41738a;
    public final EditTextBoldCursor f41739b;

    public tz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f41738a = i10;
        this.f41739b = editTextBoldCursor;
    }

    @Override
    public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f41738a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f41739b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f41739b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f41739b);
                return;
        }
    }
}

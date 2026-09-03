package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class tz implements org.telegram.ui.ActionBar.c2 {
    public final int f41663a;
    public final EditTextBoldCursor f41664b;

    public tz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f41663a = i10;
        this.f41664b = editTextBoldCursor;
    }

    @Override
    public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f41663a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f41664b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f41664b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f41664b);
                return;
        }
    }
}

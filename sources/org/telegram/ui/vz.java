package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class vz implements org.telegram.ui.ActionBar.b2 {
    public final int f38738a;
    public final EditTextBoldCursor f38739b;

    public vz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f38738a = i10;
        this.f38739b = editTextBoldCursor;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f38738a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f38739b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f38739b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f38739b);
                return;
        }
    }
}

package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class vz implements org.telegram.ui.ActionBar.z1 {
    public final int f43154a;
    public final EditTextBoldCursor f43155b;

    public vz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f43154a = i10;
        this.f43155b = editTextBoldCursor;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f43154a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f43155b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f43155b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f43155b);
                return;
        }
    }
}

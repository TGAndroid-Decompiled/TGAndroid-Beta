package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class wz implements org.telegram.ui.ActionBar.a2 {
    public final int f39279a;
    public final EditTextBoldCursor f39280b;

    public wz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f39279a = i10;
        this.f39280b = editTextBoldCursor;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f39279a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f39280b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f39280b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f39280b);
                return;
        }
    }
}

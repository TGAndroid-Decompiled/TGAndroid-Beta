package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class wz implements org.telegram.ui.ActionBar.a2 {
    public final int f39293a;
    public final EditTextBoldCursor f39294b;

    public wz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f39293a = i10;
        this.f39294b = editTextBoldCursor;
    }

    @Override
    public final void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f39293a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f39294b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f39294b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f39294b);
                return;
        }
    }
}

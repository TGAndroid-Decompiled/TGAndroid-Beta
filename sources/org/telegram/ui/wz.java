package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class wz implements org.telegram.ui.ActionBar.a2 {
    public final int f39269a;
    public final EditTextBoldCursor f39270b;

    public wz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f39269a = i10;
        this.f39270b = editTextBoldCursor;
    }

    @Override
    public final void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f39269a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f39270b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f39270b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f39270b);
                return;
        }
    }
}

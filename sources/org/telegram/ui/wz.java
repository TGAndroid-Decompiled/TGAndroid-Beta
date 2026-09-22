package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class wz implements org.telegram.ui.ActionBar.a2 {
    public final int f39412a;
    public final EditTextBoldCursor f39413b;

    public wz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f39412a = i10;
        this.f39413b = editTextBoldCursor;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f39412a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f39413b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f39413b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f39413b);
                return;
        }
    }
}

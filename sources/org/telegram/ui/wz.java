package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class wz implements org.telegram.ui.ActionBar.a2 {
    public final int f42517a;
    public final EditTextBoldCursor f42518b;

    public wz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f42517a = i10;
        this.f42518b = editTextBoldCursor;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f42517a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f42518b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f42518b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f42518b);
                return;
        }
    }
}

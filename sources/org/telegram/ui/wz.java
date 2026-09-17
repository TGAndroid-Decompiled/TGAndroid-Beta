package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class wz implements org.telegram.ui.ActionBar.a2 {
    public final int f42518a;
    public final EditTextBoldCursor f42519b;

    public wz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f42518a = i10;
        this.f42519b = editTextBoldCursor;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f42518a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f42519b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f42519b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f42519b);
                return;
        }
    }
}

package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class wz implements org.telegram.ui.ActionBar.a2 {
    public final int f42661a;
    public final EditTextBoldCursor f42662b;

    public wz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f42661a = i10;
        this.f42662b = editTextBoldCursor;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f42661a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f42662b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f42662b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f42662b);
                return;
        }
    }
}

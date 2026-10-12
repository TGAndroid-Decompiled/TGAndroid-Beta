package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class yz implements org.telegram.ui.ActionBar.z1 {
    public final int f44572a;
    public final EditTextBoldCursor f44573b;

    public yz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f44572a = i10;
        this.f44573b = editTextBoldCursor;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f44572a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f44573b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f44573b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f44573b);
                return;
        }
    }
}

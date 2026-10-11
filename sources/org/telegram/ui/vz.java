package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class vz implements org.telegram.ui.ActionBar.z1 {
    public final int f43188a;
    public final EditTextBoldCursor f43189b;

    public vz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f43188a = i10;
        this.f43189b = editTextBoldCursor;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f43188a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f43189b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f43189b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f43189b);
                return;
        }
    }
}

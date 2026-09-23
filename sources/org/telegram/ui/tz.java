package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class tz implements org.telegram.ui.ActionBar.a2 {
    public final int f37820a;
    public final EditTextBoldCursor f37821b;

    public tz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f37820a = i10;
        this.f37821b = editTextBoldCursor;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f37820a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f37821b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f37821b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f37821b);
                return;
        }
    }
}

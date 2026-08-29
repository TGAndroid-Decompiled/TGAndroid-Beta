package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class xg implements Runnable {
    public final int f44588a;
    public final EditTextBoldCursor f44589b;

    public xg(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f44588a = i10;
        this.f44589b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f44588a) {
            case 0:
                AndroidUtilities.showKeyboard(this.f44589b);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f44589b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = this.f44589b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f44589b);
                return;
            case 4:
                AndroidUtilities.showKeyboard(this.f44589b);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor3 = this.f44589b;
                editTextBoldCursor3.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor3);
                return;
        }
    }
}

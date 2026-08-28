package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class yg implements Runnable {
    public final int f44857a;
    public final EditTextBoldCursor f44858b;

    public yg(int i9, EditTextBoldCursor editTextBoldCursor) {
        this.f44857a = i9;
        this.f44858b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f44857a) {
            case 0:
                AndroidUtilities.showKeyboard(this.f44858b);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f44858b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = this.f44858b;
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f44858b);
                return;
            case 4:
                AndroidUtilities.showKeyboard(this.f44858b);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor3 = this.f44858b;
                editTextBoldCursor3.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor3);
                return;
        }
    }
}

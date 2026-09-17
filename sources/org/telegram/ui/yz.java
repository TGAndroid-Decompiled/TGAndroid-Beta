package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class yz implements DialogInterface.OnDismissListener {
    public final int f43269a;
    public final EditTextBoldCursor f43270b;

    public yz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f43269a = i10;
        this.f43270b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f43269a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f43270b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f43270b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f43270b);
                return;
        }
    }
}

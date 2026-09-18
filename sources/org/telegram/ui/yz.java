package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class yz implements DialogInterface.OnDismissListener {
    public final int f39926a;
    public final EditTextBoldCursor f39927b;

    public yz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f39926a = i10;
        this.f39927b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f39926a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f39927b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f39927b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f39927b);
                return;
        }
    }
}

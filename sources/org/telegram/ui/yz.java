package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class yz implements DialogInterface.OnDismissListener {
    public final int f40064a;
    public final EditTextBoldCursor f40065b;

    public yz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f40064a = i10;
        this.f40065b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f40064a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f40065b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f40065b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f40065b);
                return;
        }
    }
}

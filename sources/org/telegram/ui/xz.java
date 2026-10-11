package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class xz implements DialogInterface.OnDismissListener {
    public final int f44239a;
    public final EditTextBoldCursor f44240b;

    public xz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f44239a = i10;
        this.f44240b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f44239a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f44240b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f44240b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f44240b);
                return;
        }
    }
}

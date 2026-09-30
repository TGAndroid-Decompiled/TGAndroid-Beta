package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class uz implements DialogInterface.OnDismissListener {
    public final int f38578a;
    public final EditTextBoldCursor f38579b;

    public uz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f38578a = i10;
        this.f38579b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f38578a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f38579b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f38579b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f38579b);
                return;
        }
    }
}

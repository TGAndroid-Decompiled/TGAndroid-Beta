package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class uz implements DialogInterface.OnDismissListener {
    public final int f38667a;
    public final EditTextBoldCursor f38668b;

    public uz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f38667a = i10;
        this.f38668b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f38667a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f38668b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f38668b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f38668b);
                return;
        }
    }
}

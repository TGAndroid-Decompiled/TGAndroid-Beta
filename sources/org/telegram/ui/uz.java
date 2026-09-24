package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class uz implements DialogInterface.OnDismissListener {
    public final int f38562a;
    public final EditTextBoldCursor f38563b;

    public uz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f38562a = i10;
        this.f38563b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f38562a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f38563b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f38563b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f38563b);
                return;
        }
    }
}

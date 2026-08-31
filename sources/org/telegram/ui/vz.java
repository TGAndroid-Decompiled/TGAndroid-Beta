package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class vz implements DialogInterface.OnDismissListener {
    public final int f42321a;
    public final EditTextBoldCursor f42322b;

    public vz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f42321a = i10;
        this.f42322b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42321a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f42322b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f42322b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f42322b);
                return;
        }
    }
}

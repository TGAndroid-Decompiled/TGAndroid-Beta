package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class vz implements DialogInterface.OnDismissListener {
    public final int f38494a;
    public final EditTextBoldCursor f38495b;

    public vz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f38494a = i10;
        this.f38495b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f38494a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f38495b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f38495b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f38495b);
                return;
        }
    }
}

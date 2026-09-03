package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class vz implements DialogInterface.OnDismissListener {
    public final int f42232a;
    public final EditTextBoldCursor f42233b;

    public vz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f42232a = i10;
        this.f42233b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42232a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f42233b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f42233b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f42233b);
                return;
        }
    }
}

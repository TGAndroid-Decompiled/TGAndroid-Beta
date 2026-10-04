package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class yz implements DialogInterface.OnDismissListener {
    public final int f43653a;
    public final EditTextBoldCursor f43654b;

    public yz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f43653a = i10;
        this.f43654b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f43653a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f43654b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f43654b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f43654b);
                return;
        }
    }
}

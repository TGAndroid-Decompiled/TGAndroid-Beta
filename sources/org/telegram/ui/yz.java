package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class yz implements DialogInterface.OnDismissListener {
    public final int f44430a;
    public final EditTextBoldCursor f44431b;

    public yz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f44430a = i10;
        this.f44431b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f44430a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f44431b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f44431b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f44431b);
                return;
        }
    }
}

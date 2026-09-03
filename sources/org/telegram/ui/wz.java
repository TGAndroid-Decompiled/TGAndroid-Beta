package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class wz implements DialogInterface.OnDismissListener {
    public final int f39789a;
    public final EditTextBoldCursor f39790b;

    public wz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f39789a = i10;
        this.f39790b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f39789a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f39790b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f39790b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f39790b);
                return;
        }
    }
}

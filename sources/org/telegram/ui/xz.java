package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class xz implements DialogInterface.OnDismissListener {
    public final int f40067a;
    public final EditTextBoldCursor f40068b;

    public xz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f40067a = i10;
        this.f40068b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f40067a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f40068b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f40068b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f40068b);
                return;
        }
    }
}

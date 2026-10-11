package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class xz implements DialogInterface.OnDismissListener {
    public final int f44205a;
    public final EditTextBoldCursor f44206b;

    public xz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f44205a = i10;
        this.f44206b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f44205a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f44206b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f44206b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f44206b);
                return;
        }
    }
}

package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class uz implements DialogInterface.OnDismissListener {
    public final int f39023a;
    public final EditTextBoldCursor f39024b;

    public uz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f39023a = i10;
        this.f39024b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f39023a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f39024b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f39024b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f39024b);
                return;
        }
    }
}

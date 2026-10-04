package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class yz implements DialogInterface.OnDismissListener {
    public final int f43661a;
    public final EditTextBoldCursor f43662b;

    public yz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f43661a = i10;
        this.f43662b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f43661a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f43662b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f43662b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f43662b);
                return;
        }
    }
}

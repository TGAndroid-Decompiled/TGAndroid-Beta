package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class yz implements DialogInterface.OnDismissListener {
    public final int f44432a;
    public final EditTextBoldCursor f44433b;

    public yz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f44432a = i10;
        this.f44433b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f44432a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f44433b);
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f44433b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f44433b);
                return;
        }
    }
}

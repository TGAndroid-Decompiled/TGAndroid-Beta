package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class xx implements DialogInterface.OnDismissListener {
    public final int f52115a;
    public final EditTextBoldCursor f52116b;

    public xx(EditTextBoldCursor editTextBoldCursor, int i3) {
        this.f52115a = i3;
        this.f52116b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f52115a) {
            case 0:
                org.telegram.messenger.g0.v1(this.f52116b);
                return;
            case 1:
                org.telegram.messenger.g0.v1(this.f52116b);
                return;
            default:
                org.telegram.messenger.g0.v1(this.f52116b);
                return;
        }
    }
}

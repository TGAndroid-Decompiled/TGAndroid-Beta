package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class xz implements TextView.OnEditorActionListener {
    public final int f42969a;
    public final AlertDialog$Builder f42970b;

    public xz(AlertDialog$Builder alertDialog$Builder, int i10) {
        this.f42969a = i10;
        this.f42970b = alertDialog$Builder;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f42969a) {
            case 0:
                AndroidUtilities.hideKeyboard(textView);
                this.f42970b.f20367a.d(-1).callOnClick();
                return false;
            case 1:
                AndroidUtilities.hideKeyboard(textView);
                this.f42970b.f20367a.d(-1).callOnClick();
                return false;
            default:
                AndroidUtilities.hideKeyboard(textView);
                this.f42970b.f20367a.d(-1).callOnClick();
                return false;
        }
    }
}

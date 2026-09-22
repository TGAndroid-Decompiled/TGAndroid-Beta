package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class xz implements TextView.OnEditorActionListener {
    public final int f39708a;
    public final AlertDialog$Builder f39709b;

    public xz(AlertDialog$Builder alertDialog$Builder, int i10) {
        this.f39708a = i10;
        this.f39709b = alertDialog$Builder;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f39708a) {
            case 0:
                AndroidUtilities.hideKeyboard(textView);
                this.f39709b.f18435a.d(-1).callOnClick();
                return false;
            case 1:
                AndroidUtilities.hideKeyboard(textView);
                this.f39709b.f18435a.d(-1).callOnClick();
                return false;
            default:
                AndroidUtilities.hideKeyboard(textView);
                this.f39709b.f18435a.d(-1).callOnClick();
                return false;
        }
    }
}

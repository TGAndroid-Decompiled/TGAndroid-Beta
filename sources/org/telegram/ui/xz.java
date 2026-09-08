package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class xz implements TextView.OnEditorActionListener {
    public final int f42943a;
    public final AlertDialog$Builder f42944b;

    public xz(AlertDialog$Builder alertDialog$Builder, int i10) {
        this.f42943a = i10;
        this.f42944b = alertDialog$Builder;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f42943a) {
            case 0:
                AndroidUtilities.hideKeyboard(textView);
                this.f42944b.f20225a.d(-1).callOnClick();
                return false;
            case 1:
                AndroidUtilities.hideKeyboard(textView);
                this.f42944b.f20225a.d(-1).callOnClick();
                return false;
            default:
                AndroidUtilities.hideKeyboard(textView);
                this.f42944b.f20225a.d(-1).callOnClick();
                return false;
        }
    }
}

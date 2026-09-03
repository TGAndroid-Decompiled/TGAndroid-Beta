package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class uz implements TextView.OnEditorActionListener {
    public final int f41956a;
    public final AlertDialog$Builder f41957b;

    public uz(AlertDialog$Builder alertDialog$Builder, int i10) {
        this.f41956a = i10;
        this.f41957b = alertDialog$Builder;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f41956a) {
            case 0:
                AndroidUtilities.hideKeyboard(textView);
                this.f41957b.f21168a.d(-1).callOnClick();
                return false;
            case 1:
                AndroidUtilities.hideKeyboard(textView);
                this.f41957b.f21168a.d(-1).callOnClick();
                return false;
            default:
                AndroidUtilities.hideKeyboard(textView);
                this.f41957b.f21168a.d(-1).callOnClick();
                return false;
        }
    }
}

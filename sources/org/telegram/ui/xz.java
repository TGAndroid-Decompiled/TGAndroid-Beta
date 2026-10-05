package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class xz implements TextView.OnEditorActionListener {
    public final int f43039a;
    public final AlertDialog$Builder f43040b;

    public xz(AlertDialog$Builder alertDialog$Builder, int i10) {
        this.f43039a = i10;
        this.f43040b = alertDialog$Builder;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f43039a) {
            case 0:
                AndroidUtilities.hideKeyboard(textView);
                this.f43040b.f20377a.d(-1).callOnClick();
                return false;
            case 1:
                AndroidUtilities.hideKeyboard(textView);
                this.f43040b.f20377a.d(-1).callOnClick();
                return false;
            default:
                AndroidUtilities.hideKeyboard(textView);
                this.f43040b.f20377a.d(-1).callOnClick();
                return false;
        }
    }
}

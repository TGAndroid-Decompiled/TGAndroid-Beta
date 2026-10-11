package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class wz implements TextView.OnEditorActionListener {
    public final int f43893a;
    public final AlertDialog$Builder f43894b;

    public wz(AlertDialog$Builder alertDialog$Builder, int i10) {
        this.f43893a = i10;
        this.f43894b = alertDialog$Builder;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f43893a) {
            case 0:
                AndroidUtilities.hideKeyboard(textView);
                this.f43894b.f20368a.d(-1).callOnClick();
                return false;
            case 1:
                AndroidUtilities.hideKeyboard(textView);
                this.f43894b.f20368a.d(-1).callOnClick();
                return false;
            default:
                AndroidUtilities.hideKeyboard(textView);
                this.f43894b.f20368a.d(-1).callOnClick();
                return false;
        }
    }
}

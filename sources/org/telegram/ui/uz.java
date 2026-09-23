package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class uz implements TextView.OnEditorActionListener {
    public final int f38238a;
    public final AlertDialog$Builder f38239b;

    public uz(AlertDialog$Builder alertDialog$Builder, int i10) {
        this.f38238a = i10;
        this.f38239b = alertDialog$Builder;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f38238a) {
            case 0:
                AndroidUtilities.hideKeyboard(textView);
                this.f38239b.f18409a.d(-1).callOnClick();
                return false;
            case 1:
                AndroidUtilities.hideKeyboard(textView);
                this.f38239b.f18409a.d(-1).callOnClick();
                return false;
            default:
                AndroidUtilities.hideKeyboard(textView);
                this.f38239b.f18409a.d(-1).callOnClick();
                return false;
        }
    }
}

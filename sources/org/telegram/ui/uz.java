package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class uz implements TextView.OnEditorActionListener {
    public final int f42068a;
    public final AlertDialog$Builder f42069b;

    public uz(AlertDialog$Builder alertDialog$Builder, int i10) {
        this.f42068a = i10;
        this.f42069b = alertDialog$Builder;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f42068a) {
            case 0:
                AndroidUtilities.hideKeyboard(textView);
                this.f42069b.f21166a.d(-1).callOnClick();
                return false;
            case 1:
                AndroidUtilities.hideKeyboard(textView);
                this.f42069b.f21166a.d(-1).callOnClick();
                return false;
            default:
                AndroidUtilities.hideKeyboard(textView);
                this.f42069b.f21166a.d(-1).callOnClick();
                return false;
        }
    }
}

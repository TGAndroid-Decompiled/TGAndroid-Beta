package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class tz implements TextView.OnEditorActionListener {
    public final int f38780a;
    public final AlertDialog$Builder f38781b;

    public tz(AlertDialog$Builder alertDialog$Builder, int i10) {
        this.f38780a = i10;
        this.f38781b = alertDialog$Builder;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f38780a) {
            case 0:
                AndroidUtilities.hideKeyboard(textView);
                this.f38781b.f19503a.d(-1).callOnClick();
                return false;
            case 1:
                AndroidUtilities.hideKeyboard(textView);
                this.f38781b.f19503a.d(-1).callOnClick();
                return false;
            default:
                AndroidUtilities.hideKeyboard(textView);
                this.f38781b.f19503a.d(-1).callOnClick();
                return false;
        }
    }
}

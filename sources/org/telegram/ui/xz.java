package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class xz implements TextView.OnEditorActionListener {
    public final int f42916a;
    public final AlertDialog$Builder f42917b;

    public xz(AlertDialog$Builder alertDialog$Builder, int i10) {
        this.f42916a = i10;
        this.f42917b = alertDialog$Builder;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f42916a) {
            case 0:
                AndroidUtilities.hideKeyboard(textView);
                this.f42917b.f20198a.d(-1).callOnClick();
                return false;
            case 1:
                AndroidUtilities.hideKeyboard(textView);
                this.f42917b.f20198a.d(-1).callOnClick();
                return false;
            default:
                AndroidUtilities.hideKeyboard(textView);
                this.f42917b.f20198a.d(-1).callOnClick();
                return false;
        }
    }
}

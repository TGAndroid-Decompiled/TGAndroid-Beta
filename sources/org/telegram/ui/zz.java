package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class zz implements TextView.OnEditorActionListener {
    public final int f40358a;
    public final AlertDialog$Builder f40359b;

    public zz(AlertDialog$Builder alertDialog$Builder, int i10) {
        this.f40358a = i10;
        this.f40359b = alertDialog$Builder;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f40358a) {
            case 0:
                AndroidUtilities.hideKeyboard(textView);
                this.f40359b.f18446a.d(-1).callOnClick();
                return false;
            case 1:
                AndroidUtilities.hideKeyboard(textView);
                this.f40359b.f18446a.d(-1).callOnClick();
                return false;
            default:
                AndroidUtilities.hideKeyboard(textView);
                this.f40359b.f18446a.d(-1).callOnClick();
                return false;
        }
    }
}

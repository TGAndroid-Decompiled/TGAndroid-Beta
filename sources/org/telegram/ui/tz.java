package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class tz implements TextView.OnEditorActionListener {
    public final int f38346a;
    public final AlertDialog$Builder f38347b;

    public tz(AlertDialog$Builder alertDialog$Builder, int i10) {
        this.f38346a = i10;
        this.f38347b = alertDialog$Builder;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f38346a) {
            case 0:
                AndroidUtilities.hideKeyboard(textView);
                this.f38347b.f18678a.d(-1).callOnClick();
                return false;
            case 1:
                AndroidUtilities.hideKeyboard(textView);
                this.f38347b.f18678a.d(-1).callOnClick();
                return false;
            default:
                AndroidUtilities.hideKeyboard(textView);
                this.f38347b.f18678a.d(-1).callOnClick();
                return false;
        }
    }
}

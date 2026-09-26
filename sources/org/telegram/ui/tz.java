package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class tz implements TextView.OnEditorActionListener {
    public final int f38256a;
    public final AlertDialog$Builder f38257b;

    public tz(AlertDialog$Builder alertDialog$Builder, int i10) {
        this.f38256a = i10;
        this.f38257b = alertDialog$Builder;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f38256a) {
            case 0:
                AndroidUtilities.hideKeyboard(textView);
                this.f38257b.f18661a.d(-1).callOnClick();
                return false;
            case 1:
                AndroidUtilities.hideKeyboard(textView);
                this.f38257b.f18661a.d(-1).callOnClick();
                return false;
            default:
                AndroidUtilities.hideKeyboard(textView);
                this.f38257b.f18661a.d(-1).callOnClick();
                return false;
        }
    }
}

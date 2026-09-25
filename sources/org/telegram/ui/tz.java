package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class tz implements TextView.OnEditorActionListener {
    public final int f38257a;
    public final AlertDialog$Builder f38258b;

    public tz(AlertDialog$Builder alertDialog$Builder, int i10) {
        this.f38257a = i10;
        this.f38258b = alertDialog$Builder;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f38257a) {
            case 0:
                AndroidUtilities.hideKeyboard(textView);
                this.f38258b.f18662a.d(-1).callOnClick();
                return false;
            case 1:
                AndroidUtilities.hideKeyboard(textView);
                this.f38258b.f18662a.d(-1).callOnClick();
                return false;
            default:
                AndroidUtilities.hideKeyboard(textView);
                this.f38258b.f18662a.d(-1).callOnClick();
                return false;
        }
    }
}

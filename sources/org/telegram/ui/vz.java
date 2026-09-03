package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class vz implements TextView.OnEditorActionListener {
    public final int f39221a;
    public final AlertDialog$Builder f39222b;

    public vz(AlertDialog$Builder alertDialog$Builder, int i10) {
        this.f39221a = i10;
        this.f39222b = alertDialog$Builder;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f39221a) {
            case 0:
                AndroidUtilities.hideKeyboard(textView);
                this.f39222b.f19478a.d(-1).callOnClick();
                return false;
            case 1:
                AndroidUtilities.hideKeyboard(textView);
                this.f39222b.f19478a.d(-1).callOnClick();
                return false;
            default:
                AndroidUtilities.hideKeyboard(textView);
                this.f39222b.f19478a.d(-1).callOnClick();
                return false;
        }
    }
}

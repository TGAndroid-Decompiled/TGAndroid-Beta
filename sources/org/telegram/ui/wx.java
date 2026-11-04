package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class wx implements TextView.OnEditorActionListener {
    public final int f51624a;
    public final AlertDialog$Builder f51625b;

    public wx(AlertDialog$Builder alertDialog$Builder, int i3) {
        this.f51624a = i3;
        this.f51625b = alertDialog$Builder;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
        switch (this.f51624a) {
            case 0:
                org.telegram.messenger.g0.v1(textView);
                this.f51625b.f27343a.d(-1).callOnClick();
                return false;
            case 1:
                org.telegram.messenger.g0.v1(textView);
                this.f51625b.f27343a.d(-1).callOnClick();
                return false;
            default:
                org.telegram.messenger.g0.v1(textView);
                this.f51625b.f27343a.d(-1).callOnClick();
                return false;
        }
    }
}

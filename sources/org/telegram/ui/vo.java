package org.telegram.ui;

import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class vo implements org.telegram.ui.Components.zk0 {
    public final xo f43692a;

    public vo(xo xoVar) {
        this.f43692a = xoVar;
    }

    @Override
    public final void c(int i10, View view) {
        TLRPC.TL_username tL_username;
        int i11;
        int i12;
        int i13;
        xo xoVar = this.f43692a;
        yo yoVar = xoVar.W2;
        if ((view instanceof ia) && (tL_username = ((ia) view).v) != null) {
            if (tL_username.editable) {
                View view2 = yoVar.fragmentView;
                if (view2 instanceof ScrollView) {
                    ((ScrollView) view2).smoothScrollTo(0, yoVar.f44940y.getTop() - AndroidUtilities.dp(128.0f));
                }
                yoVar.f44915a.requestFocus();
                AndroidUtilities.showKeyboard(yoVar.f44915a);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xoVar.getContext(), 0, yoVar.getResourceProvider());
            if (tL_username.active) {
                i11 = R.string.UsernameDeactivateLink;
            } else {
                i11 = R.string.UsernameActivateLink;
            }
            alertDialog$Builder.f22714a.N = LocaleController.getString(i11);
            if (tL_username.active) {
                i12 = R.string.UsernameDeactivateLinkChannelMessage;
            } else {
                i12 = R.string.UsernameActivateLinkChannelMessage;
            }
            alertDialog$Builder.f22714a.P = LocaleController.getString(i12);
            if (tL_username.active) {
                i13 = R.string.Hide;
            } else {
                i13 = R.string.Show;
            }
            alertDialog$Builder.k(LocaleController.getString(i13), new z6(this, tL_username, view, 8));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4.a(18));
            alertDialog$Builder.o();
        }
    }
}

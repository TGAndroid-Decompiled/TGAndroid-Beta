package org.telegram.ui;

import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public final class uo implements org.telegram.ui.Components.pk0 {

    public final wo f43265a;

    public uo(wo woVar) {
        this.f43265a = woVar;
    }

    @Override
    public final void a(int i10, View view) {
        TLRPC.TL_username tL_username;
        wo woVar = this.f43265a;
        xo xoVar = woVar.W2;
        if (!(view instanceof ka) || (tL_username = ((ka) view).v) == null) {
            return;
        }
        if (tL_username.editable) {
            View view2 = xoVar.fragmentView;
            if (view2 instanceof ScrollView) {
                ((ScrollView) view2).smoothScrollTo(0, xoVar.f44573y.getTop() - AndroidUtilities.dp(128.0f));
            }
            xoVar.f44548a.requestFocus();
            AndroidUtilities.showKeyboard(xoVar.f44548a);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(woVar.getContext(), 0, xoVar.getResourceProvider());
        alertDialog$Builder.f22702a.N = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLink : R.string.UsernameActivateLink);
        alertDialog$Builder.f22702a.P = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLinkChannelMessage : R.string.UsernameActivateLinkChannelMessage);
        alertDialog$Builder.k(LocaleController.getString(tL_username.active ? R.string.Hide : R.string.Show), new b7(this, tL_username, view, 8));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ng.a(29));
        alertDialog$Builder.o();
    }
}

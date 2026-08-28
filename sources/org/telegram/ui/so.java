package org.telegram.ui;

import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class so implements org.telegram.ui.Components.mk0 {
    public final uo f42737a;

    public so(uo uoVar) {
        this.f42737a = uoVar;
    }

    @Override
    public final void a(int i9, View view) {
        TLRPC.TL_username tL_username;
        int i10;
        int i11;
        int i12;
        uo uoVar = this.f42737a;
        vo voVar = uoVar.W2;
        if ((view instanceof ja) && (tL_username = ((ja) view).v) != null) {
            if (tL_username.editable) {
                View view2 = voVar.fragmentView;
                if (view2 instanceof ScrollView) {
                    ((ScrollView) view2).smoothScrollTo(0, voVar.f43549y.getTop() - AndroidUtilities.dp(128.0f));
                }
                voVar.f43524a.requestFocus();
                AndroidUtilities.showKeyboard(voVar.f43524a);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uoVar.getContext(), 0, voVar.getResourceProvider());
            if (tL_username.active) {
                i10 = R.string.UsernameDeactivateLink;
            } else {
                i10 = R.string.UsernameActivateLink;
            }
            alertDialog$Builder.f22702a.N = LocaleController.getString(i10);
            if (tL_username.active) {
                i11 = R.string.UsernameDeactivateLinkChannelMessage;
            } else {
                i11 = R.string.UsernameActivateLinkChannelMessage;
            }
            alertDialog$Builder.f22702a.P = LocaleController.getString(i11);
            if (tL_username.active) {
                i12 = R.string.Hide;
            } else {
                i12 = R.string.Show;
            }
            alertDialog$Builder.k(LocaleController.getString(i12), new a7(this, tL_username, view, 8));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new mg.b(24));
            alertDialog$Builder.o();
        }
    }
}

package org.telegram.ui;

import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class to implements org.telegram.ui.Components.wl0 {
    public final vo f41722a;

    public to(vo voVar) {
        this.f41722a = voVar;
    }

    @Override
    public final void a(int i10, View view) {
        TLRPC.TL_username tL_username;
        int i11;
        int i12;
        int i13;
        vo voVar = this.f41722a;
        wo woVar = voVar.Y2;
        if ((view instanceof pa) && (tL_username = ((pa) view).v) != null) {
            if (tL_username.editable) {
                View view2 = woVar.fragmentView;
                if (view2 instanceof ScrollView) {
                    ((ScrollView) view2).smoothScrollTo(0, woVar.f42929y.getTop() - AndroidUtilities.dp(128.0f));
                }
                woVar.f42901a.requestFocus();
                AndroidUtilities.showKeyboard(woVar.f42901a);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(voVar.getContext(), 0, woVar.getResourceProvider());
            if (tL_username.active) {
                i11 = R.string.UsernameDeactivateLink;
            } else {
                i11 = R.string.UsernameActivateLink;
            }
            alertDialog$Builder.f20604a.R = LocaleController.getString(i11);
            if (tL_username.active) {
                i12 = R.string.UsernameDeactivateLinkChannelMessage;
            } else {
                i12 = R.string.UsernameActivateLinkChannelMessage;
            }
            alertDialog$Builder.f20604a.T = LocaleController.getString(i12);
            if (tL_username.active) {
                i13 = R.string.Hide;
            } else {
                i13 = R.string.Show;
            }
            alertDialog$Builder.k(LocaleController.getString(i13), new e7(this, tL_username, view, 8));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4.v0(24));
            alertDialog$Builder.o();
        }
    }
}

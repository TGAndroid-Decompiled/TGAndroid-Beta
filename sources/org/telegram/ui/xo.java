package org.telegram.ui;

import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class xo implements org.telegram.ui.Components.zl0 {
    public final zo f45815a;

    public xo(zo zoVar) {
        this.f45815a = zoVar;
    }

    @Override
    public final void c(int i10, View view) {
        TLRPC.TL_username tL_username;
        int i11;
        int i12;
        int i13;
        zo zoVar = this.f45815a;
        ap apVar = zoVar.f46338i3;
        if ((view instanceof qa) && (tL_username = ((qa) view).v) != null) {
            if (tL_username.editable) {
                if (apVar.fragmentView instanceof ScrollView) {
                    apVar.f37841a.smoothScrollTo(0, apVar.f37868y.getTop() - AndroidUtilities.dp(128.0f));
                }
                apVar.f37843b.requestFocus();
                AndroidUtilities.showKeyboard(apVar.f37843b);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zoVar.getContext(), 0, apVar.getResourceProvider());
            if (tL_username.active) {
                i11 = R.string.UsernameDeactivateLink;
            } else {
                i11 = R.string.UsernameActivateLink;
            }
            alertDialog$Builder.f22366a.R = LocaleController.getString(i11);
            if (tL_username.active) {
                i12 = R.string.UsernameDeactivateLinkChannelMessage;
            } else {
                i12 = R.string.UsernameActivateLinkChannelMessage;
            }
            alertDialog$Builder.f22366a.T = LocaleController.getString(i12);
            if (tL_username.active) {
                i13 = R.string.Hide;
            } else {
                i13 = R.string.Show;
            }
            alertDialog$Builder.k(LocaleController.getString(i13), new e7(this, tL_username, view, 8));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new cg(2));
            alertDialog$Builder.p();
        }
    }
}

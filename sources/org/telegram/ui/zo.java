package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class zo implements View.OnClickListener {
    public final int f45025a;
    public final ip f45026b;

    public zo(ip ipVar, int i10) {
        this.f45025a = i10;
        this.f45026b = ipVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f45025a;
        ip ipVar = this.f45026b;
        switch (i10) {
            case 0:
                TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ipVar.getParentActivity());
                String string = LocaleController.getString(R.string.AppName);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20374a;
                b2Var.R = string;
                if (ipVar.f38707a0) {
                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, ipVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                } else {
                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, ipVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new o(16, ipVar, currentChannel));
                ipVar.showDialog(b2Var);
                return;
            case 1:
                if (!ipVar.V) {
                    ipVar.V = true;
                    ipVar.b0();
                    return;
                }
                return;
            case 2:
                if (ipVar.V) {
                    if (!ipVar.f38711c0) {
                        ipVar.Z();
                        return;
                    }
                    ipVar.V = false;
                    ipVar.b0();
                    return;
                }
                return;
            case 3:
                zh0 zh0Var = new zh0(ipVar.Z, 0L, 0);
                zh0Var.g0(ipVar.Y, ipVar.f38722l0);
                ipVar.presentFragment(zh0Var);
                return;
            default:
                boolean z10 = !ipVar.f38709b0;
                ipVar.f38709b0 = z10;
                ((org.telegram.ui.Cells.w8) view).setChecked(z10);
                return;
        }
    }
}

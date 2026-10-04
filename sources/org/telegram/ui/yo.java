package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class yo implements View.OnClickListener {
    public final int f43590a;
    public final hp f43591b;

    public yo(hp hpVar, int i10) {
        this.f43590a = i10;
        this.f43591b = hpVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f43590a;
        hp hpVar = this.f43591b;
        switch (i10) {
            case 0:
                TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hpVar.getParentActivity());
                String string = LocaleController.getString(R.string.AppName);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20367a;
                b2Var.R = string;
                if (hpVar.f37125a0) {
                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, hpVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                } else {
                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, hpVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new o(17, hpVar, currentChannel));
                hpVar.showDialog(b2Var);
                return;
            case 1:
                if (!hpVar.V) {
                    hpVar.V = true;
                    hpVar.b0();
                    return;
                }
                return;
            case 2:
                if (hpVar.V) {
                    if (!hpVar.f37129c0) {
                        hpVar.Y();
                        return;
                    }
                    hpVar.V = false;
                    hpVar.b0();
                    return;
                }
                return;
            case 3:
                wh0 wh0Var = new wh0(hpVar.Z, 0L, 0);
                wh0Var.g0(hpVar.Y, hpVar.f37140l0);
                hpVar.presentFragment(wh0Var);
                return;
            default:
                boolean z10 = !hpVar.f37127b0;
                hpVar.f37127b0 = z10;
                ((org.telegram.ui.Cells.w8) view).setChecked(z10);
                return;
        }
    }
}

package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ro implements View.OnClickListener {
    public final int f43196a;
    public final ap f43197b;

    public ro(ap apVar, int i10) {
        this.f43196a = i10;
        this.f43197b = apVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f43196a;
        ap apVar = this.f43197b;
        switch (i10) {
            case 0:
                TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(apVar.getParentActivity());
                String string = LocaleController.getString(R.string.AppName);
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
                e2Var.R = string;
                if (apVar.f37845a0) {
                    e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, apVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                } else {
                    e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, apVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new m4.s0(23, apVar, currentChannel));
                apVar.showDialog(e2Var);
                return;
            case 1:
                if (!apVar.V) {
                    apVar.V = true;
                    apVar.d0();
                    return;
                }
                return;
            case 2:
                if (apVar.V) {
                    if (!apVar.f37849c0) {
                        apVar.b0();
                        return;
                    }
                    apVar.V = false;
                    apVar.d0();
                    return;
                }
                return;
            case 3:
                jh0 jh0Var = new jh0(apVar.Z, 0L, 0);
                jh0Var.i0(apVar.Y, apVar.f37859l0);
                apVar.presentFragment(jh0Var);
                return;
            default:
                boolean z10 = !apVar.f37847b0;
                apVar.f37847b0 = z10;
                ((org.telegram.ui.Cells.a9) view).setChecked(z10);
                return;
        }
    }
}

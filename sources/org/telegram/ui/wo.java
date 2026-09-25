package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class wo implements View.OnClickListener {
    public final int f39735a;
    public final fp f39736b;

    public wo(fp fpVar, int i10) {
        this.f39735a = i10;
        this.f39736b = fpVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f39735a;
        fp fpVar = this.f39736b;
        switch (i10) {
            case 0:
                TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fpVar.getParentActivity());
                String string = LocaleController.getString(R.string.AppName);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18662a;
                a2Var.R = string;
                if (fpVar.f33711a0) {
                    a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, fpVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                } else {
                    a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, fpVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new o(16, fpVar, currentChannel));
                fpVar.showDialog(a2Var);
                return;
            case 1:
                if (!fpVar.V) {
                    fpVar.V = true;
                    fpVar.b0();
                    return;
                }
                return;
            case 2:
                if (fpVar.V) {
                    if (!fpVar.f33715c0) {
                        fpVar.Z();
                        return;
                    }
                    fpVar.V = false;
                    fpVar.b0();
                    return;
                }
                return;
            case 3:
                sh0 sh0Var = new sh0(fpVar.Z, 0L, 0);
                sh0Var.g0(fpVar.Y, fpVar.f33725l0);
                fpVar.presentFragment(sh0Var);
                return;
            default:
                boolean z10 = !fpVar.f33713b0;
                fpVar.f33713b0 = z10;
                ((org.telegram.ui.Cells.w8) view).setChecked(z10);
                return;
        }
    }
}

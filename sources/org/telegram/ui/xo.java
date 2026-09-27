package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class xo implements View.OnClickListener {
    public final int f40016a;
    public final gp f40017b;

    public xo(gp gpVar, int i10) {
        this.f40016a = i10;
        this.f40017b = gpVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f40016a;
        gp gpVar = this.f40017b;
        switch (i10) {
            case 0:
                TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gpVar.getParentActivity());
                String string = LocaleController.getString(R.string.AppName);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
                c2Var.R = string;
                if (gpVar.f33986a0) {
                    c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, gpVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                } else {
                    c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, gpVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new p(16, gpVar, currentChannel));
                gpVar.showDialog(c2Var);
                return;
            case 1:
                if (!gpVar.V) {
                    gpVar.V = true;
                    gpVar.b0();
                    return;
                }
                return;
            case 2:
                if (gpVar.V) {
                    if (!gpVar.f33990c0) {
                        gpVar.Z();
                        return;
                    }
                    gpVar.V = false;
                    gpVar.b0();
                    return;
                }
                return;
            case 3:
                vh0 vh0Var = new vh0(gpVar.Z, 0L, 0);
                vh0Var.g0(gpVar.Y, gpVar.f34000l0);
                gpVar.presentFragment(vh0Var);
                return;
            default:
                boolean z10 = !gpVar.f33988b0;
                gpVar.f33988b0 = z10;
                ((org.telegram.ui.Cells.w8) view).setChecked(z10);
                return;
        }
    }
}

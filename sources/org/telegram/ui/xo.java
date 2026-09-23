package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class xo implements View.OnClickListener {
    public final int f39635a;
    public final gp f39636b;

    public xo(gp gpVar, int i10) {
        this.f39635a = i10;
        this.f39636b = gpVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f39635a;
        gp gpVar = this.f39636b;
        switch (i10) {
            case 0:
                TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gpVar.getParentActivity());
                String string = LocaleController.getString(R.string.AppName);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
                b2Var.R = string;
                if (gpVar.f33604a0) {
                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, gpVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                } else {
                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, gpVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new u(15, gpVar, currentChannel));
                gpVar.showDialog(b2Var);
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
                    if (!gpVar.f33608c0) {
                        gpVar.Z();
                        return;
                    }
                    gpVar.V = false;
                    gpVar.b0();
                    return;
                }
                return;
            case 3:
                th0 th0Var = new th0(gpVar.Z, 0L, 0);
                th0Var.g0(gpVar.Y, gpVar.f33618l0);
                gpVar.presentFragment(th0Var);
                return;
            default:
                boolean z10 = !gpVar.f33606b0;
                gpVar.f33606b0 = z10;
                ((org.telegram.ui.Cells.x8) view).setChecked(z10);
                return;
        }
    }
}

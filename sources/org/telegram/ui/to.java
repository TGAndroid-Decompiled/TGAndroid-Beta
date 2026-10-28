package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class to implements View.OnClickListener {
    public final int f43682a;
    public final cp f43683b;

    public to(cp cpVar, int i10) {
        this.f43682a = i10;
        this.f43683b = cpVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f43682a;
        cp cpVar = this.f43683b;
        switch (i10) {
            case 0:
                TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cpVar.getParentActivity());
                String string = LocaleController.getString(R.string.AppName);
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                e2Var.R = string;
                if (cpVar.f38402a0) {
                    e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, cpVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                } else {
                    e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, cpVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new m4.s0(23, cpVar, currentChannel));
                cpVar.showDialog(e2Var);
                return;
            case 1:
                if (!cpVar.V) {
                    cpVar.V = true;
                    cpVar.d0();
                    return;
                }
                return;
            case 2:
                if (cpVar.V) {
                    if (!cpVar.f38406c0) {
                        cpVar.b0();
                        return;
                    }
                    cpVar.V = false;
                    cpVar.d0();
                    return;
                }
                return;
            case 3:
                lh0 lh0Var = new lh0(cpVar.Z, 0L, 0);
                lh0Var.i0(cpVar.Y, cpVar.f38416l0);
                cpVar.presentFragment(lh0Var);
                return;
            default:
                boolean z10 = !cpVar.f38404b0;
                cpVar.f38404b0 = z10;
                ((org.telegram.ui.Cells.a9) view).setChecked(z10);
                return;
        }
    }
}

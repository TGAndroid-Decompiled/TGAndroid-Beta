package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class uo implements View.OnClickListener {
    public final int f38981a;
    public final dp f38982b;

    public uo(dp dpVar, int i10) {
        this.f38981a = i10;
        this.f38982b = dpVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f38981a;
        dp dpVar = this.f38982b;
        switch (i10) {
            case 0:
                TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dpVar.getParentActivity());
                String string = LocaleController.getString(R.string.AppName);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
                d2Var.O = string;
                if (dpVar.X) {
                    d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, dpVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                } else {
                    d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, dpVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new mg.w(22, dpVar, currentChannel));
                dpVar.showDialog(d2Var);
                return;
            case 1:
                if (!dpVar.S) {
                    dpVar.S = true;
                    dpVar.b0();
                    return;
                }
                return;
            case 2:
                if (dpVar.S) {
                    if (!dpVar.Z) {
                        dpVar.Z();
                        return;
                    }
                    dpVar.S = false;
                    dpVar.b0();
                    return;
                }
                return;
            case 3:
                ph0 ph0Var = new ph0(dpVar.W, 0L, 0);
                ph0Var.g0(dpVar.V, dpVar.f33758i0);
                dpVar.presentFragment(ph0Var);
                return;
            default:
                boolean z4 = !dpVar.Y;
                dpVar.Y = z4;
                ((org.telegram.ui.Cells.s8) view).setChecked(z4);
                return;
        }
    }
}

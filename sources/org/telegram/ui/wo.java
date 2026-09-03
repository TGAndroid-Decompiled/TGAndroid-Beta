package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class wo implements View.OnClickListener {
    public final int f39740a;
    public final fp f39741b;

    public wo(fp fpVar, int i10) {
        this.f39740a = i10;
        this.f39741b = fpVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f39740a;
        fp fpVar = this.f39741b;
        switch (i10) {
            case 0:
                TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fpVar.getParentActivity());
                String string = LocaleController.getString(R.string.AppName);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
                d2Var.O = string;
                if (fpVar.X) {
                    d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, fpVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                } else {
                    d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, fpVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new mg.w(22, fpVar, currentChannel));
                fpVar.showDialog(d2Var);
                return;
            case 1:
                if (!fpVar.S) {
                    fpVar.S = true;
                    fpVar.b0();
                    return;
                }
                return;
            case 2:
                if (fpVar.S) {
                    if (!fpVar.Z) {
                        fpVar.Z();
                        return;
                    }
                    fpVar.S = false;
                    fpVar.b0();
                    return;
                }
                return;
            case 3:
                rh0 rh0Var = new rh0(fpVar.W, 0L, 0);
                rh0Var.g0(fpVar.V, fpVar.f34189i0);
                fpVar.presentFragment(rh0Var);
                return;
            default:
                boolean z4 = !fpVar.Y;
                fpVar.Y = z4;
                ((org.telegram.ui.Cells.r8) view).setChecked(z4);
                return;
        }
    }
}

package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class rh0 extends org.telegram.ui.Components.vq0 {
    public final sh0 X0;

    public rh0(sh0 sh0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null, str, false, str2, false, e6Var);
        this.X0 = sh0Var;
    }

    @Override
    public final void O0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String formatString;
        vh0 vh0Var = this.X0.K;
        if (!z10) {
            return;
        }
        if (iVar != null && iVar.m() == 1) {
            long j3 = ((TLRPC.Dialog) iVar.n(0)).f18333id;
            if (j3 != 0 && j3 != vh0Var.getUserConfig().getClientUserId()) {
                formatString = LocaleController.formatString(R.string.InvLinkToUser, vh0Var.getMessagesController().getPeerName(j3, true));
            } else {
                formatString = LocaleController.getString(R.string.InvLinkToSavedMessages);
            }
        } else {
            formatString = LocaleController.formatString(R.string.InvLinkToChats, LocaleController.formatPluralString("Chats", i10, new Object[0]));
        }
        org.telegram.ui.Components.qc Q = org.telegram.ui.Components.xc.a0(vh0Var).Q(R.raw.forward, 36, AndroidUtilities.replaceTags(formatString));
        Q.f27699r = false;
        Q.k(true);
    }
}

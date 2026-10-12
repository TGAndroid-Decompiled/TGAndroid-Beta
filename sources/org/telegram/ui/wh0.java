package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class wh0 extends org.telegram.ui.Components.sr0 {
    public final xh0 f43537b1;

    public wh0(xh0 xh0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null, str, false, str2, false, c6Var);
        this.f43537b1 = xh0Var;
    }

    @Override
    public final void S0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String formatString;
        ai0 ai0Var = this.f43537b1.K;
        if (!z10) {
            return;
        }
        if (iVar != null && iVar.m() == 1) {
            long j3 = ((TLRPC.Dialog) iVar.n(0)).f19807id;
            if (j3 != 0 && j3 != ai0Var.getUserConfig().getClientUserId()) {
                formatString = LocaleController.formatString(R.string.InvLinkToUser, ai0Var.getMessagesController().getPeerName(j3, true));
            } else {
                formatString = LocaleController.getString(R.string.InvLinkToSavedMessages);
            }
        } else {
            formatString = LocaleController.formatString(R.string.InvLinkToChats, LocaleController.formatPluralString("Chats", i10, new Object[0]));
        }
        org.telegram.ui.Components.sc Q = org.telegram.ui.Components.zc.a0(ai0Var).Q(R.raw.forward, 36, AndroidUtilities.replaceTags(formatString));
        Q.f30544r = false;
        Q.k(true);
    }
}

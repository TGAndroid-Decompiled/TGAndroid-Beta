package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class vh0 extends org.telegram.ui.Components.sq0 {
    public final wh0 f37560b1;

    public vh0(wh0 wh0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, str, false, str2, false, f6Var);
        this.f37560b1 = wh0Var;
    }

    @Override
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String formatString;
        zh0 zh0Var = this.f37560b1.K;
        if (!z10) {
            return;
        }
        if (iVar != null && iVar.m() == 1) {
            long j3 = ((TLRPC.Dialog) iVar.n(0)).f17199id;
            if (j3 != 0 && j3 != zh0Var.getUserConfig().getClientUserId()) {
                formatString = LocaleController.formatString(R.string.InvLinkToUser, zh0Var.getMessagesController().getPeerName(j3, true));
            } else {
                formatString = LocaleController.getString(R.string.InvLinkToSavedMessages);
            }
        } else {
            formatString = LocaleController.formatString(R.string.InvLinkToChats, LocaleController.formatPluralString("Chats", i10, new Object[0]));
        }
        org.telegram.ui.Components.pc Q = org.telegram.ui.Components.wc.a0(zh0Var).Q(R.raw.forward, 36, AndroidUtilities.replaceTags(formatString));
        Q.f26089r = false;
        Q.k(true);
    }
}

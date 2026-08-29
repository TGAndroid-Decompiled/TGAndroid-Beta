package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class z8 extends org.telegram.ui.Components.dq0 {
    public final org.telegram.ui.ActionBar.f3 X0;

    public z8(Context context, String str, String str2, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.ActionBar.f3 f3Var) {
        super(context, null, str, false, str2, false, c6Var);
        this.X0 = f3Var;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        int m10;
        String formatString;
        if (!z10) {
            return;
        }
        if (hVar != null && hVar.m() == 1) {
            long j10 = ((TLRPC.Dialog) hVar.n(0)).f22396id;
            if (j10 != 0 && j10 != UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                formatString = LocaleController.formatString(R.string.InvLinkToUser, MessagesController.getInstance(this.currentAccount).getPeerName(j10, true));
            } else {
                formatString = LocaleController.getString(R.string.InvLinkToSavedMessages);
            }
        } else {
            int i11 = R.string.InvLinkToChats;
            if (hVar == null) {
                m10 = 1;
            } else {
                m10 = hVar.m();
            }
            formatString = LocaleController.formatString(i11, LocaleController.formatPluralString("Chats", m10, new Object[0]));
        }
        org.telegram.ui.Components.mc Q = new org.telegram.ui.Components.tc(this.X0.topBulletinContainer, this.resourcesProvider).Q(R.raw.forward, 36, AndroidUtilities.replaceTags(formatString));
        Q.f30660r = false;
        Q.j();
    }
}

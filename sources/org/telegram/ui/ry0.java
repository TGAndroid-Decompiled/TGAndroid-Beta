package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class ry0 implements aq {
    public final TLRPC.Chat f40830a;
    public final dq f40831b;
    public final ProfileActivity f40832c;

    public ry0(ProfileActivity profileActivity, TLRPC.Chat chat, dq dqVar) {
        this.f40832c = profileActivity;
        this.f40830a = chat;
        this.f40831b = dqVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        int i10;
        ProfileActivity profileActivity = this.f40832c;
        UndoView undoView = profileActivity.M;
        long j10 = -profileActivity.f33614g1;
        if (profileActivity.F2.megagroup) {
            i10 = 10;
        } else {
            i10 = 9;
        }
        undoView.m(j10, user, i10);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.Chat chat;
        ProfileActivity profileActivity = this.f40832c;
        profileActivity.removeSelfFromStack();
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f33607f1));
        if (user != null && (chat = this.f40830a) != null && profileActivity.f33607f1 != 0) {
            dq dqVar = this.f40831b;
            if (dqVar.Q && dqVar.getParentLayout() != null) {
                for (org.telegram.ui.ActionBar.n2 n2Var : dqVar.getParentLayout().getFragmentStack()) {
                    if (n2Var instanceof xb) {
                        xb xbVar = (xb) n2Var;
                        xbVar.V0();
                        AndroidUtilities.runOnUIThread(new xe0(xbVar, user, chat, 26));
                        return;
                    }
                }
            }
        }
    }
}

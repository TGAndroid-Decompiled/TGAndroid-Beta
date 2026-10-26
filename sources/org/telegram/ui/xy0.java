package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class xy0 implements dq {
    public final TLRPC.Chat f45901a;
    public final gq f45902b;
    public final ProfileActivity f45903c;

    public xy0(ProfileActivity profileActivity, TLRPC.Chat chat, gq gqVar) {
        this.f45903c = profileActivity;
        this.f45901a = chat;
        this.f45902b = gqVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        int i10;
        ProfileActivity profileActivity = this.f45903c;
        UndoView undoView = profileActivity.L;
        long j10 = -profileActivity.f35987f1;
        if (profileActivity.E2.megagroup) {
            i10 = 10;
        } else {
            i10 = 9;
        }
        undoView.m(j10, user, i10);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.Chat chat;
        ProfileActivity profileActivity = this.f45903c;
        profileActivity.removeSelfFromStack();
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f35979e1));
        if (user != null && (chat = this.f45901a) != null && profileActivity.f35979e1 != 0) {
            gq gqVar = this.f45902b;
            if (gqVar.Q && gqVar.getParentLayout() != null) {
                for (org.telegram.ui.ActionBar.r2 r2Var : gqVar.getParentLayout().getFragmentStack()) {
                    if (r2Var instanceof wb) {
                        wb wbVar = (wb) r2Var;
                        wbVar.W0();
                        AndroidUtilities.runOnUIThread(new oe0(wbVar, user, chat, 28));
                        return;
                    }
                }
            }
        }
    }
}

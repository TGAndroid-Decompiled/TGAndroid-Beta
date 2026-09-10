package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class rz0 implements oq {
    public final TLRPC.Chat f36493a;
    public final rq f36494b;
    public final ProfileActivity f36495c;

    public rz0(ProfileActivity profileActivity, TLRPC.Chat chat, rq rqVar) {
        this.f36495c = profileActivity;
        this.f36493a = chat;
        this.f36494b = rqVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        int i10;
        ProfileActivity profileActivity = this.f36495c;
        UndoView undoView = profileActivity.M;
        long j3 = -profileActivity.f30389f1;
        if (profileActivity.E2.megagroup) {
            i10 = 10;
        } else {
            i10 = 9;
        }
        undoView.m(j3, user, i10);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.Chat chat;
        ProfileActivity profileActivity = this.f36495c;
        profileActivity.removeSelfFromStack();
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f30381e1));
        if (user != null && (chat = this.f36493a) != null && profileActivity.f30381e1 != 0) {
            rq rqVar = this.f36494b;
            if (rqVar.Q && rqVar.getParentLayout() != null) {
                for (org.telegram.ui.ActionBar.p2 p2Var : rqVar.getParentLayout().getFragmentStack()) {
                    if (p2Var instanceof wb) {
                        wb wbVar = (wb) p2Var;
                        wbVar.W0();
                        AndroidUtilities.runOnUIThread(new pf0(wbVar, user, chat, 25));
                        return;
                    }
                }
            }
        }
    }
}

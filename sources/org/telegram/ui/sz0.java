package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class sz0 implements qq {
    public final TLRPC.Chat f39970a;
    public final tq f39971b;
    public final ProfileActivity f39972c;

    public sz0(ProfileActivity profileActivity, TLRPC.Chat chat, tq tqVar) {
        this.f39972c = profileActivity;
        this.f39970a = chat;
        this.f39971b = tqVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        int i10;
        ProfileActivity profileActivity = this.f39972c;
        UndoView undoView = profileActivity.M;
        long j10 = -profileActivity.f32269f1;
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
        ProfileActivity profileActivity = this.f39972c;
        profileActivity.removeSelfFromStack();
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f32261e1));
        if (user != null && (chat = this.f39970a) != null && profileActivity.f32261e1 != 0) {
            tq tqVar = this.f39971b;
            if (tqVar.Q && tqVar.getParentLayout() != null) {
                for (org.telegram.ui.ActionBar.m2 m2Var : tqVar.getParentLayout().getFragmentStack()) {
                    if (m2Var instanceof ac) {
                        ac acVar = (ac) m2Var;
                        acVar.V0();
                        AndroidUtilities.runOnUIThread(new tf0(acVar, user, chat, 25));
                        return;
                    }
                }
            }
        }
    }
}

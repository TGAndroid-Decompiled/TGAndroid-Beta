package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class tz0 implements qq {
    public final TLRPC.Chat f40506a;
    public final tq f40507b;
    public final ProfileActivity f40508c;

    public tz0(ProfileActivity profileActivity, TLRPC.Chat chat, tq tqVar) {
        this.f40508c = profileActivity;
        this.f40506a = chat;
        this.f40507b = tqVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        int i10;
        ProfileActivity profileActivity = this.f40508c;
        UndoView undoView = profileActivity.M;
        long j10 = -profileActivity.f32567f1;
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
        ProfileActivity profileActivity = this.f40508c;
        profileActivity.removeSelfFromStack();
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f32559e1));
        if (user != null && (chat = this.f40506a) != null && profileActivity.f32559e1 != 0) {
            tq tqVar = this.f40507b;
            if (tqVar.Q && tqVar.getParentLayout() != null) {
                for (org.telegram.ui.ActionBar.m2 m2Var : tqVar.getParentLayout().getFragmentStack()) {
                    if (m2Var instanceof ac) {
                        ac acVar = (ac) m2Var;
                        acVar.V0();
                        AndroidUtilities.runOnUIThread(new uf0(acVar, user, chat, 25));
                        return;
                    }
                }
            }
        }
    }
}

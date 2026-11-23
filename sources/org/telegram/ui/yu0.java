package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class yu0 implements kp {
    public final TLRPC.Chat f54298a;
    public final np f54299b;
    public final ProfileActivity f54300c;

    public yu0(ProfileActivity profileActivity, TLRPC.Chat chat, np npVar) {
        this.f54300c = profileActivity;
        this.f54298a = chat;
        this.f54299b = npVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        int i7;
        ProfileActivity profileActivity = this.f54300c;
        UndoView undoView = profileActivity.M;
        long j3 = -profileActivity.f43593f1;
        if (profileActivity.F2.megagroup) {
            i7 = 10;
        } else {
            i7 = 9;
        }
        undoView.m(j3, user, i7);
    }

    @Override
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.Chat chat;
        ProfileActivity profileActivity = this.f54300c;
        profileActivity.removeSelfFromStack();
        TLRPC.User c22 = profileActivity.getMessagesController().c2(Long.valueOf(profileActivity.f43585e1));
        if (c22 != null && (chat = this.f54298a) != null && profileActivity.f43585e1 != 0) {
            np npVar = this.f54299b;
            if (npVar.R && npVar.getParentLayout() != null) {
                for (org.telegram.ui.ActionBar.g2 g2Var : npVar.getParentLayout().getFragmentStack()) {
                    if (g2Var instanceof lb) {
                        lb lbVar = (lb) g2Var;
                        lbVar.a1();
                        org.telegram.messenger.g0.g3(new mc0(lbVar, c22, chat, 28));
                        return;
                    }
                }
            }
        }
    }
}

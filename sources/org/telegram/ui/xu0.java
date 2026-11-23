package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class xu0 implements kp {
    public final TLRPC.Chat f54082a;
    public final np f54083b;
    public final ProfileActivity f54084c;

    public xu0(ProfileActivity profileActivity, TLRPC.Chat chat, np npVar) {
        this.f54084c = profileActivity;
        this.f54082a = chat;
        this.f54083b = npVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        int i7;
        ProfileActivity profileActivity = this.f54084c;
        UndoView undoView = profileActivity.M;
        long j3 = -profileActivity.f43674f1;
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
        ProfileActivity profileActivity = this.f54084c;
        profileActivity.removeSelfFromStack();
        TLRPC.User c22 = profileActivity.getMessagesController().c2(Long.valueOf(profileActivity.f43666e1));
        if (c22 != null && (chat = this.f54082a) != null && profileActivity.f43666e1 != 0) {
            np npVar = this.f54083b;
            if (npVar.R && npVar.getParentLayout() != null) {
                for (org.telegram.ui.ActionBar.g2 g2Var : npVar.getParentLayout().getFragmentStack()) {
                    if (g2Var instanceof lb) {
                        lb lbVar = (lb) g2Var;
                        lbVar.a1();
                        org.telegram.messenger.g0.g3(new lc0(lbVar, c22, chat, 28));
                        return;
                    }
                }
            }
        }
    }
}

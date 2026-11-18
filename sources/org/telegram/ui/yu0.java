package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class yu0 implements kp {
    public final TLRPC.Chat f54252a;
    public final np f54253b;
    public final ProfileActivity f54254c;

    public yu0(ProfileActivity profileActivity, TLRPC.Chat chat, np npVar) {
        this.f54254c = profileActivity;
        this.f54252a = chat;
        this.f54253b = npVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        int i7;
        ProfileActivity profileActivity = this.f54254c;
        UndoView undoView = profileActivity.M;
        long j3 = -profileActivity.f43548f1;
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
        ProfileActivity profileActivity = this.f54254c;
        profileActivity.removeSelfFromStack();
        TLRPC.User c22 = profileActivity.getMessagesController().c2(Long.valueOf(profileActivity.f43540e1));
        if (c22 != null && (chat = this.f54252a) != null && profileActivity.f43540e1 != 0) {
            np npVar = this.f54253b;
            if (npVar.R && npVar.getParentLayout() != null) {
                for (org.telegram.ui.ActionBar.h2 h2Var : npVar.getParentLayout().getFragmentStack()) {
                    if (h2Var instanceof lb) {
                        lb lbVar = (lb) h2Var;
                        lbVar.a1();
                        org.telegram.messenger.g0.g3(new mc0(lbVar, c22, chat, 28));
                        return;
                    }
                }
            }
        }
    }
}

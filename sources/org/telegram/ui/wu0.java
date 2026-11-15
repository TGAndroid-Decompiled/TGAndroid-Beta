package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class wu0 implements jp {
    public final TLRPC.Chat f53001a;
    public final mp f53002b;
    public final ProfileActivity f53003c;

    public wu0(ProfileActivity profileActivity, TLRPC.Chat chat, mp mpVar) {
        this.f53003c = profileActivity;
        this.f53001a = chat;
        this.f53002b = mpVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        int i7;
        ProfileActivity profileActivity = this.f53003c;
        UndoView undoView = profileActivity.M;
        long j3 = -profileActivity.f43102f1;
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
        ProfileActivity profileActivity = this.f53003c;
        profileActivity.removeSelfFromStack();
        TLRPC.User a22 = profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.f43094e1));
        if (a22 != null && (chat = this.f53001a) != null && profileActivity.f43094e1 != 0) {
            mp mpVar = this.f53002b;
            if (mpVar.R && mpVar.getParentLayout() != null) {
                for (org.telegram.ui.ActionBar.e2 e2Var : mpVar.getParentLayout().getFragmentStack()) {
                    if (e2Var instanceof lb) {
                        lb lbVar = (lb) e2Var;
                        lbVar.a1();
                        org.telegram.messenger.g0.h3(new lc0(lbVar, a22, chat, 28));
                        return;
                    }
                }
            }
        }
    }
}

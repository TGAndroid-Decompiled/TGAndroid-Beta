package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class yu0 implements hp {
    public final TLRPC.Chat f52315a;
    public final kp f52316b;
    public final ProfileActivity f52317c;

    public yu0(ProfileActivity profileActivity, TLRPC.Chat chat, kp kpVar) {
        this.f52317c = profileActivity;
        this.f52315a = chat;
        this.f52316b = kpVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        int i7;
        ProfileActivity profileActivity = this.f52317c;
        UndoView undoView = profileActivity.L;
        long j3 = -profileActivity.f41723e1;
        if (profileActivity.D2.megagroup) {
            i7 = 10;
        } else {
            i7 = 9;
        }
        undoView.m(j3, user, i7);
    }

    @Override
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.Chat chat;
        ProfileActivity profileActivity = this.f52317c;
        profileActivity.removeSelfFromStack();
        TLRPC.User a22 = profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.f41716d1));
        if (a22 != null && (chat = this.f52315a) != null && profileActivity.f41716d1 != 0) {
            kp kpVar = this.f52316b;
            if (kpVar.Q && kpVar.getParentLayout() != null) {
                for (org.telegram.ui.ActionBar.f2 f2Var : kpVar.getParentLayout().getFragmentStack()) {
                    if (f2Var instanceof mb) {
                        mb mbVar = (mb) f2Var;
                        mbVar.a1();
                        org.telegram.messenger.g0.h3(new mc0(mbVar, a22, chat, 28));
                        return;
                    }
                }
            }
        }
    }
}

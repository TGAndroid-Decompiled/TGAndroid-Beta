package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class xy0 implements dq {
    public final TLRPC.Chat f45898a;
    public final gq f45899b;
    public final ProfileActivity f45900c;

    public xy0(ProfileActivity profileActivity, TLRPC.Chat chat, gq gqVar) {
        this.f45900c = profileActivity;
        this.f45898a = chat;
        this.f45899b = gqVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        int i10;
        ProfileActivity profileActivity = this.f45900c;
        UndoView undoView = profileActivity.L;
        long j10 = -profileActivity.f35984f1;
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
        ProfileActivity profileActivity = this.f45900c;
        profileActivity.removeSelfFromStack();
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f35976e1));
        if (user != null && (chat = this.f45898a) != null && profileActivity.f35976e1 != 0) {
            gq gqVar = this.f45899b;
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

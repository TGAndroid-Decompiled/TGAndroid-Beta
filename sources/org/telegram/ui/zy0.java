package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class zy0 implements fq {
    public final TLRPC.Chat f46418a;
    public final iq f46419b;
    public final ProfileActivity f46420c;

    public zy0(ProfileActivity profileActivity, TLRPC.Chat chat, iq iqVar) {
        this.f46420c = profileActivity;
        this.f46418a = chat;
        this.f46419b = iqVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        int i10;
        ProfileActivity profileActivity = this.f46420c;
        UndoView undoView = profileActivity.L;
        long j10 = -profileActivity.f36011f1;
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
        ProfileActivity profileActivity = this.f46420c;
        profileActivity.removeSelfFromStack();
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f36003e1));
        if (user != null && (chat = this.f46418a) != null && profileActivity.f36003e1 != 0) {
            iq iqVar = this.f46419b;
            if (iqVar.Q && iqVar.getParentLayout() != null) {
                for (org.telegram.ui.ActionBar.r2 r2Var : iqVar.getParentLayout().getFragmentStack()) {
                    if (r2Var instanceof wb) {
                        wb wbVar = (wb) r2Var;
                        wbVar.W0();
                        AndroidUtilities.runOnUIThread(new ne0(wbVar, user, chat, 29));
                        return;
                    }
                }
            }
        }
    }
}

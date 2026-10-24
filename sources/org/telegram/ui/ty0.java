package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class ty0 implements aq {
    public final TLRPC.Chat f42148a;
    public final dq f42149b;
    public final ProfileActivity f42150c;

    public ty0(ProfileActivity profileActivity, TLRPC.Chat chat, dq dqVar) {
        this.f42150c = profileActivity;
        this.f42148a = chat;
        this.f42149b = dqVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        int i10;
        ProfileActivity profileActivity = this.f42150c;
        UndoView undoView = profileActivity.M;
        long j10 = -profileActivity.f33930g1;
        if (profileActivity.F2.megagroup) {
            i10 = 10;
        } else {
            i10 = 9;
        }
        undoView.m(j10, user, i10);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.Chat chat;
        ProfileActivity profileActivity = this.f42150c;
        profileActivity.removeSelfFromStack();
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f33923f1));
        if (user != null && (chat = this.f42148a) != null && profileActivity.f33923f1 != 0) {
            dq dqVar = this.f42149b;
            if (dqVar.R && dqVar.getParentLayout() != null) {
                for (org.telegram.ui.ActionBar.o2 o2Var : dqVar.getParentLayout().getFragmentStack()) {
                    if (o2Var instanceof vb) {
                        vb vbVar = (vb) o2Var;
                        vbVar.V0();
                        AndroidUtilities.runOnUIThread(new qe0(vbVar, user, chat, 27));
                        return;
                    }
                }
            }
        }
    }
}

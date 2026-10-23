package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class uy0 implements aq {
    public final TLRPC.Chat f42541a;
    public final dq f42542b;
    public final ProfileActivity f42543c;

    public uy0(ProfileActivity profileActivity, TLRPC.Chat chat, dq dqVar) {
        this.f42543c = profileActivity;
        this.f42541a = chat;
        this.f42542b = dqVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        int i10;
        ProfileActivity profileActivity = this.f42543c;
        UndoView undoView = profileActivity.M;
        long j10 = -profileActivity.f33928g1;
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
        ProfileActivity profileActivity = this.f42543c;
        profileActivity.removeSelfFromStack();
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f33921f1));
        if (user != null && (chat = this.f42541a) != null && profileActivity.f33921f1 != 0) {
            dq dqVar = this.f42542b;
            if (dqVar.R && dqVar.getParentLayout() != null) {
                for (org.telegram.ui.ActionBar.o2 o2Var : dqVar.getParentLayout().getFragmentStack()) {
                    if (o2Var instanceof vb) {
                        vb vbVar = (vb) o2Var;
                        vbVar.V0();
                        AndroidUtilities.runOnUIThread(new re0(vbVar, user, chat, 27));
                        return;
                    }
                }
            }
        }
    }
}

package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class uy0 implements gq {
    public final TLRPC.Chat f39020a;
    public final jq f39021b;
    public final ProfileActivity f39022c;

    public uy0(ProfileActivity profileActivity, TLRPC.Chat chat, jq jqVar) {
        this.f39022c = profileActivity;
        this.f39020a = chat;
        this.f39021b = jqVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        int i10;
        ProfileActivity profileActivity = this.f39022c;
        UndoView undoView = profileActivity.J;
        long j10 = -profileActivity.f32045c1;
        if (profileActivity.B2.megagroup) {
            i10 = 10;
        } else {
            i10 = 9;
        }
        undoView.m(j10, user, i10);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.Chat chat;
        ProfileActivity profileActivity = this.f39022c;
        profileActivity.removeSelfFromStack();
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f32037b1));
        if (user != null && (chat = this.f39020a) != null && profileActivity.f32037b1 != 0) {
            jq jqVar = this.f39021b;
            if (jqVar.N && jqVar.getParentLayout() != null) {
                for (org.telegram.ui.ActionBar.p2 p2Var : jqVar.getParentLayout().getFragmentStack()) {
                    if (p2Var instanceof sb) {
                        sb sbVar = (sb) p2Var;
                        sbVar.W0();
                        AndroidUtilities.runOnUIThread(new hf0(sbVar, user, chat, 25));
                        return;
                    }
                }
            }
        }
    }
}

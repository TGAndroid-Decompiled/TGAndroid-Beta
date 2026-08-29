package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class vp implements Runnable {
    public final int f43709a;
    public final dq f43710b;

    public vp(dq dqVar, int i10) {
        this.f43709a = i10;
        this.f43710b = dqVar;
    }

    @Override
    public final void run() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i10 = this.f43709a;
        dq dqVar = this.f43710b;
        int i11 = 1;
        switch (i10) {
            case 0:
                TLRPC.User user = dqVar.v;
                aq aqVar = dqVar.T0;
                if (aqVar != null) {
                    if (dqVar.G) {
                        tL_chatAdminRights = dqVar.I;
                    } else {
                        tL_chatAdminRights = null;
                    }
                    aqVar.b(0, tL_chatAdminRights, null, dqVar.O);
                }
                Bundle i12 = a4.w.i("scrollToTopOnResume", true);
                i12.putLong("chat_id", dqVar.f37602w.f22392id);
                if (!dqVar.getMessagesController().checkCanOpenChat(i12, dqVar)) {
                    dqVar.t0(false);
                    return;
                }
                tn tnVar = new tn(i12);
                dqVar.presentFragment(tnVar, true);
                if (org.telegram.ui.Components.tc.a(tnVar)) {
                    boolean z10 = dqVar.V0;
                    if (z10 && dqVar.G) {
                        String str = user.first_name;
                        org.telegram.ui.Components.ub ubVar = new org.telegram.ui.Components.ub(tnVar.getParentActivity(), tnVar.f42746aa);
                        ubVar.d(R.raw.ic_admin, "Shield");
                        ubVar.f33185b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserAddedAsAdminHint", R.string.UserAddedAsAdminHint, str)));
                        org.telegram.ui.Components.mc.g(tnVar, ubVar, 1500).j();
                        return;
                    } else if (!z10 && !dqVar.H && dqVar.G) {
                        org.telegram.ui.Components.tc.C(tnVar, user.first_name).j();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                dqVar.r0(false);
                return;
            default:
                if (dqVar.f37595r) {
                    long j10 = dqVar.f37590n;
                    org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(dqVar.getParentActivity(), 3, null)};
                    dqVar.getMessagesController().toggleChatJoinRequest(dqVar.f37597s, j10, true, false, true, new lg(c2VarArr, 2), new lg(c2VarArr, 3));
                    c2VarArr[0].q(300L);
                }
                aq aqVar2 = dqVar.T0;
                if (aqVar2 != null) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights2 = dqVar.I;
                    if (!tL_chatAdminRights2.change_info && !tL_chatAdminRights2.post_messages && !tL_chatAdminRights2.manage_direct_messages && !tL_chatAdminRights2.manage_welcome_messages && !tL_chatAdminRights2.edit_messages && !tL_chatAdminRights2.delete_messages && !tL_chatAdminRights2.ban_users && !tL_chatAdminRights2.invite_users && ((!dqVar.C || !tL_chatAdminRights2.manage_topics) && !tL_chatAdminRights2.pin_messages && !tL_chatAdminRights2.manage_ranks && !tL_chatAdminRights2.add_admins && !tL_chatAdminRights2.anonymous && !tL_chatAdminRights2.manage_call && ((!dqVar.A || (!tL_chatAdminRights2.post_stories && !tL_chatAdminRights2.edit_stories && !tL_chatAdminRights2.delete_stories)) && !tL_chatAdminRights2.other))) {
                        i11 = 0;
                    }
                    aqVar2.b(i11, tL_chatAdminRights2, dqVar.K, dqVar.O);
                    dqVar.finishFragment();
                    return;
                }
                return;
        }
    }
}

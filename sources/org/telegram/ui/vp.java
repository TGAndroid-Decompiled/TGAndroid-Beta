package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class vp implements Runnable {
    public final int f42802a;
    public final dq f42803b;

    public vp(dq dqVar, int i10) {
        this.f42802a = i10;
        this.f42803b = dqVar;
    }

    @Override
    public final void run() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i10 = this.f42802a;
        dq dqVar = this.f42803b;
        int i11 = 1;
        switch (i10) {
            case 0:
                TLRPC.User user = dqVar.f36704w;
                aq aqVar = dqVar.Y0;
                if (aqVar != null) {
                    if (dqVar.L) {
                        tL_chatAdminRights = dqVar.N;
                    } else {
                        tL_chatAdminRights = null;
                    }
                    aqVar.b(0, tL_chatAdminRights, null, dqVar.T);
                }
                Bundle h = a1.g.h("scrollToTopOnResume", true);
                h.putLong("chat_id", dqVar.f36706x.f20343id);
                if (!dqVar.getMessagesController().checkCanOpenChat(h, dqVar)) {
                    dqVar.t0(false);
                    return;
                }
                sn snVar = new sn(h);
                dqVar.presentFragment(snVar, true);
                if (org.telegram.ui.Components.xc.a(snVar)) {
                    boolean z10 = dqVar.f36674a1;
                    if (z10 && dqVar.L) {
                        String str = user.first_name;
                        org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(snVar.getParentActivity(), snVar.f41654qa);
                        ybVar.d(R.raw.ic_admin, "Shield");
                        ybVar.f32863b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserAddedAsAdminHint", R.string.UserAddedAsAdminHint, str)));
                        org.telegram.ui.Components.qc.g(snVar, ybVar, 1500).j();
                        return;
                    } else if (!z10 && !dqVar.M && dqVar.L) {
                        org.telegram.ui.Components.xc.C(snVar, user.first_name).j();
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
                if (dqVar.f36699s) {
                    long j10 = dqVar.f36697r;
                    org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(dqVar.getParentActivity(), 3, null)};
                    dqVar.getMessagesController().toggleChatJoinRequest(dqVar.v, j10, true, false, true, new ng(c2VarArr, 2), new ng(c2VarArr, 3));
                    c2VarArr[0].r(300L);
                }
                aq aqVar2 = dqVar.Y0;
                if (aqVar2 != null) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights2 = dqVar.N;
                    if (!tL_chatAdminRights2.change_info && !tL_chatAdminRights2.post_messages && !tL_chatAdminRights2.manage_direct_messages && !tL_chatAdminRights2.manage_welcome_messages && !tL_chatAdminRights2.edit_messages && !tL_chatAdminRights2.delete_messages && !tL_chatAdminRights2.ban_users && !tL_chatAdminRights2.invite_users && ((!dqVar.H || !tL_chatAdminRights2.manage_topics) && !tL_chatAdminRights2.pin_messages && !tL_chatAdminRights2.manage_ranks && !tL_chatAdminRights2.add_admins && !tL_chatAdminRights2.anonymous && !tL_chatAdminRights2.manage_call && ((!dqVar.F || (!tL_chatAdminRights2.post_stories && !tL_chatAdminRights2.edit_stories && !tL_chatAdminRights2.delete_stories)) && !tL_chatAdminRights2.other))) {
                        i11 = 0;
                    }
                    aqVar2.b(i11, tL_chatAdminRights2, dqVar.P, dqVar.T);
                    dqVar.finishFragment();
                    return;
                }
                return;
        }
    }
}

package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class tp implements Runnable {
    public final int f41717a;
    public final bq f41718b;

    public tp(bq bqVar, int i10) {
        this.f41717a = i10;
        this.f41718b = bqVar;
    }

    @Override
    public final void run() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i10 = this.f41717a;
        bq bqVar = this.f41718b;
        int i11 = 1;
        switch (i10) {
            case 0:
                TLRPC.User user = bqVar.v;
                yp ypVar = bqVar.X0;
                if (ypVar != null) {
                    if (bqVar.K) {
                        tL_chatAdminRights = bqVar.M;
                    } else {
                        tL_chatAdminRights = null;
                    }
                    ypVar.b(0, tL_chatAdminRights, null, bqVar.S);
                }
                Bundle h = a1.g.h("scrollToTopOnResume", true);
                h.putLong("chat_id", bqVar.f35719w.f20280id);
                if (!bqVar.getMessagesController().checkCanOpenChat(h, bqVar)) {
                    bqVar.t0(false);
                    return;
                }
                qn qnVar = new qn(h);
                bqVar.presentFragment(qnVar, true);
                if (org.telegram.ui.Components.xc.a(qnVar)) {
                    boolean z10 = bqVar.Z0;
                    if (z10 && bqVar.K) {
                        String str = user.first_name;
                        org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(qnVar.getParentActivity(), qnVar.f40677ea);
                        ybVar.d(R.raw.ic_admin, "Shield");
                        ybVar.f32629b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserAddedAsAdminHint", R.string.UserAddedAsAdminHint, str)));
                        org.telegram.ui.Components.qc.g(qnVar, ybVar, 1500).j();
                        return;
                    } else if (!z10 && !bqVar.L && bqVar.K) {
                        org.telegram.ui.Components.xc.C(qnVar, user.first_name).j();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                bqVar.r0(false);
                return;
            default:
                if (bqVar.f35712r) {
                    long j10 = bqVar.f35707n;
                    org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(bqVar.getParentActivity(), 3, null)};
                    bqVar.getMessagesController().toggleChatJoinRequest(bqVar.f35714s, j10, true, false, true, new ng(b2VarArr, 2), new ng(b2VarArr, 3));
                    b2VarArr[0].r(300L);
                }
                yp ypVar2 = bqVar.X0;
                if (ypVar2 != null) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights2 = bqVar.M;
                    if (!tL_chatAdminRights2.change_info && !tL_chatAdminRights2.post_messages && !tL_chatAdminRights2.manage_direct_messages && !tL_chatAdminRights2.manage_welcome_messages && !tL_chatAdminRights2.edit_messages && !tL_chatAdminRights2.delete_messages && !tL_chatAdminRights2.ban_users && !tL_chatAdminRights2.invite_users && ((!bqVar.G || !tL_chatAdminRights2.manage_topics) && !tL_chatAdminRights2.pin_messages && !tL_chatAdminRights2.manage_ranks && !tL_chatAdminRights2.add_admins && !tL_chatAdminRights2.anonymous && !tL_chatAdminRights2.manage_call && ((!bqVar.E || (!tL_chatAdminRights2.post_stories && !tL_chatAdminRights2.edit_stories && !tL_chatAdminRights2.delete_stories)) && !tL_chatAdminRights2.other))) {
                        i11 = 0;
                    }
                    ypVar2.b(i11, tL_chatAdminRights2, bqVar.O, bqVar.S);
                    bqVar.finishFragment();
                    return;
                }
                return;
        }
    }
}

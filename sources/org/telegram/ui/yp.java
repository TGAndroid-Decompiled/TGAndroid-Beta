package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class yp implements Runnable {
    public final int f46090a;
    public final gq f46091b;

    public yp(gq gqVar, int i10) {
        this.f46090a = i10;
        this.f46091b = gqVar;
    }

    @Override
    public final void run() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i10 = this.f46090a;
        gq gqVar = this.f46091b;
        int i11 = 1;
        switch (i10) {
            case 0:
                TLRPC.User user = gqVar.v;
                dq dqVar = gqVar.X0;
                if (dqVar != null) {
                    if (gqVar.K) {
                        tL_chatAdminRights = gqVar.M;
                    } else {
                        tL_chatAdminRights = null;
                    }
                    dqVar.b(0, tL_chatAdminRights, null, gqVar.S);
                }
                Bundle i12 = a1.g.i("scrollToTopOnResume", true);
                i12.putLong("chat_id", gqVar.f39765w.f22027id);
                if (!gqVar.getMessagesController().checkCanOpenChat(i12, gqVar)) {
                    gqVar.u0(false);
                    return;
                }
                un unVar = new un(i12);
                gqVar.presentFragment(unVar, true);
                if (org.telegram.ui.Components.wc.a(unVar)) {
                    boolean z10 = gqVar.Z0;
                    if (z10 && gqVar.K) {
                        String str = user.first_name;
                        org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(unVar.getParentActivity(), unVar.f44388qa);
                        ybVar.d(R.raw.ic_admin, "Shield");
                        ybVar.f35001b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserAddedAsAdminHint", R.string.UserAddedAsAdminHint, str)));
                        org.telegram.ui.Components.qc.g(unVar, ybVar, 1500).j();
                        return;
                    } else if (!z10 && !gqVar.L && gqVar.K) {
                        org.telegram.ui.Components.wc.C(unVar, user.first_name).j();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                gqVar.s0(false);
                return;
            default:
                if (gqVar.f39758r) {
                    long j10 = gqVar.f39753n;
                    org.telegram.ui.ActionBar.e2[] e2VarArr = {new org.telegram.ui.ActionBar.e2(gqVar.getParentActivity(), 3, null)};
                    gqVar.getMessagesController().toggleChatJoinRequest(gqVar.f39760s, j10, true, false, true, new qg(e2VarArr, 2), new qg(e2VarArr, 3));
                    e2VarArr[0].r(300L);
                }
                dq dqVar2 = gqVar.X0;
                if (dqVar2 != null) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights2 = gqVar.M;
                    if (!tL_chatAdminRights2.change_info && !tL_chatAdminRights2.post_messages && !tL_chatAdminRights2.manage_direct_messages && !tL_chatAdminRights2.manage_welcome_messages && !tL_chatAdminRights2.edit_messages && !tL_chatAdminRights2.delete_messages && !tL_chatAdminRights2.ban_users && !tL_chatAdminRights2.invite_users && ((!gqVar.G || !tL_chatAdminRights2.manage_topics) && !tL_chatAdminRights2.pin_messages && !tL_chatAdminRights2.manage_ranks && !tL_chatAdminRights2.add_admins && !tL_chatAdminRights2.anonymous && !tL_chatAdminRights2.manage_call && ((!gqVar.E || (!tL_chatAdminRights2.post_stories && !tL_chatAdminRights2.edit_stories && !tL_chatAdminRights2.delete_stories)) && !tL_chatAdminRights2.other))) {
                        i11 = 0;
                    }
                    dqVar2.b(i11, tL_chatAdminRights2, gqVar.O, gqVar.S);
                    gqVar.finishFragment();
                    return;
                }
                return;
        }
    }
}

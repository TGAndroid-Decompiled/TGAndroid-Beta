package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class sp implements Runnable {
    public final int f42741a;
    public final bq f42742b;

    public sp(bq bqVar, int i9) {
        this.f42741a = i9;
        this.f42742b = bqVar;
    }

    @Override
    public final void run() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i9 = this.f42741a;
        bq bqVar = this.f42742b;
        int i10 = 1;
        switch (i9) {
            case 0:
                TLRPC.User user = bqVar.v;
                yp ypVar = bqVar.T0;
                if (ypVar != null) {
                    if (bqVar.G) {
                        tL_chatAdminRights = bqVar.I;
                    } else {
                        tL_chatAdminRights = null;
                    }
                    ypVar.b(0, tL_chatAdminRights, null, bqVar.O);
                }
                Bundle i11 = aa.d.i("scrollToTopOnResume", true);
                i11.putLong("chat_id", bqVar.f36948w.f22380id);
                if (!bqVar.getMessagesController().checkCanOpenChat(i11, bqVar)) {
                    bqVar.s0(false);
                    return;
                }
                qn qnVar = new qn(i11);
                bqVar.presentFragment(qnVar, true);
                if (org.telegram.ui.Components.oc.a(qnVar)) {
                    boolean z10 = bqVar.V0;
                    if (z10 && bqVar.G) {
                        String str = user.first_name;
                        org.telegram.ui.Components.ob obVar = new org.telegram.ui.Components.ob(qnVar.getParentActivity(), qnVar.f41848aa);
                        obVar.d(R.raw.ic_admin, "Shield");
                        obVar.f31343b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserAddedAsAdminHint", R.string.UserAddedAsAdminHint, str)));
                        org.telegram.ui.Components.gc.g(qnVar, obVar, 1500).j();
                        return;
                    } else if (!z10 && !bqVar.H && bqVar.G) {
                        org.telegram.ui.Components.oc.C(qnVar, user.first_name).j();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                bqVar.q0(false);
                return;
            default:
                if (bqVar.f36941r) {
                    long j10 = bqVar.f36936n;
                    org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(bqVar.getParentActivity(), 3, null)};
                    bqVar.getMessagesController().toggleChatJoinRequest(bqVar.f36943s, j10, true, false, true, new mg(c2VarArr, 2), new mg(c2VarArr, 3));
                    c2VarArr[0].q(300L);
                }
                yp ypVar2 = bqVar.T0;
                if (ypVar2 != null) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights2 = bqVar.I;
                    if (!tL_chatAdminRights2.change_info && !tL_chatAdminRights2.post_messages && !tL_chatAdminRights2.manage_direct_messages && !tL_chatAdminRights2.manage_welcome_messages && !tL_chatAdminRights2.edit_messages && !tL_chatAdminRights2.delete_messages && !tL_chatAdminRights2.ban_users && !tL_chatAdminRights2.invite_users && ((!bqVar.C || !tL_chatAdminRights2.manage_topics) && !tL_chatAdminRights2.pin_messages && !tL_chatAdminRights2.manage_ranks && !tL_chatAdminRights2.add_admins && !tL_chatAdminRights2.anonymous && !tL_chatAdminRights2.manage_call && ((!bqVar.A || (!tL_chatAdminRights2.post_stories && !tL_chatAdminRights2.edit_stories && !tL_chatAdminRights2.delete_stories)) && !tL_chatAdminRights2.other))) {
                        i10 = 0;
                    }
                    ypVar2.b(i10, tL_chatAdminRights2, bqVar.K, bqVar.O);
                    bqVar.finishFragment();
                    return;
                }
                return;
        }
    }
}

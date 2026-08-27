package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public final class up implements Runnable {

    public final int f43269a;

    public final dq f43270b;

    public up(dq dqVar, int i10) {
        this.f43269a = i10;
        this.f43270b = dqVar;
    }

    @Override
    public final void run() {
        int i10 = this.f43269a;
        dq dqVar = this.f43270b;
        int i11 = 1;
        switch (i10) {
            case 0:
                TLRPC.User user = dqVar.v;
                aq aqVar = dqVar.T0;
                if (aqVar != null) {
                    aqVar.b(0, dqVar.G ? dqVar.I : null, null, dqVar.O);
                }
                Bundle bundleH = a9.p.h("scrollToTopOnResume", true);
                bundleH.putLong("chat_id", dqVar.f37519w.f22380id);
                if (dqVar.getMessagesController().checkCanOpenChat(bundleH, dqVar)) {
                    rn rnVar = new rn(bundleH);
                    dqVar.presentFragment(rnVar, true);
                    if (org.telegram.ui.Components.mc.a(rnVar)) {
                        boolean z10 = dqVar.V0;
                        if (z10 && dqVar.G) {
                            String str = user.first_name;
                            org.telegram.ui.Components.mb mbVar = new org.telegram.ui.Components.mb(rnVar.getParentActivity(), rnVar.f41983aa);
                            mbVar.d(R.raw.ic_admin, "Shield");
                            mbVar.f30639b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserAddedAsAdminHint", R.string.UserAddedAsAdminHint, str)));
                            org.telegram.ui.Components.ec.g(rnVar, mbVar, 1500).j();
                            break;
                        } else if (!z10 && !dqVar.H && dqVar.G) {
                            org.telegram.ui.Components.mc.C(rnVar, user.first_name).j();
                            break;
                        }
                    }
                } else {
                    dqVar.t0(false);
                    break;
                }
                break;
            case 1:
                dqVar.r0(false);
                break;
            default:
                if (dqVar.f37512r) {
                    long j10 = dqVar.f37507n;
                    org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(dqVar.getParentActivity(), 3, null)};
                    dqVar.getMessagesController().toggleChatJoinRequest(dqVar.f37514s, j10, true, false, true, new og(b2VarArr, 2), new og(b2VarArr, 3));
                    b2VarArr[0].q(300L);
                }
                aq aqVar2 = dqVar.T0;
                if (aqVar2 != null) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights = dqVar.I;
                    if (!tL_chatAdminRights.change_info && !tL_chatAdminRights.post_messages && !tL_chatAdminRights.manage_direct_messages && !tL_chatAdminRights.manage_welcome_messages && !tL_chatAdminRights.edit_messages && !tL_chatAdminRights.delete_messages && !tL_chatAdminRights.ban_users && !tL_chatAdminRights.invite_users && ((!dqVar.C || !tL_chatAdminRights.manage_topics) && !tL_chatAdminRights.pin_messages && !tL_chatAdminRights.manage_ranks && !tL_chatAdminRights.add_admins && !tL_chatAdminRights.anonymous && !tL_chatAdminRights.manage_call && ((!dqVar.A || (!tL_chatAdminRights.post_stories && !tL_chatAdminRights.edit_stories && !tL_chatAdminRights.delete_stories)) && !tL_chatAdminRights.other))) {
                        i11 = 0;
                    }
                    aqVar2.b(i11, tL_chatAdminRights, dqVar.K, dqVar.O);
                    dqVar.finishFragment();
                }
                break;
        }
    }
}

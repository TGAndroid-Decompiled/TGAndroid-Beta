package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class se0 implements org.telegram.ui.Components.qj0, org.telegram.ui.ActionBar.r1 {
    public final gf0 f51989a;

    public se0(gf0 gf0Var) {
        this.f51989a = gf0Var;
    }

    @Override
    public boolean c(int i7, View view) {
        gf0 gf0Var = this.f51989a;
        if ((i7 < gf0Var.E || i7 >= gf0Var.F) && (i7 < gf0Var.I || i7 >= gf0Var.J)) {
            return false;
        }
        ((df0) view).f46897y.callOnClick();
        try {
            view.performHapticFeedback(0, 2);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        TLRPC.TL_messages_deleteRevokedExportedChatInvites tL_messages_deleteRevokedExportedChatInvites = new TLRPC.TL_messages_deleteRevokedExportedChatInvites();
        gf0 gf0Var = this.f51989a;
        tL_messages_deleteRevokedExportedChatInvites.peer = gf0Var.getMessagesController().l1(-gf0Var.f48015n);
        long j3 = gf0Var.f48007f;
        if (j3 == gf0Var.getUserConfig().e()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = gf0Var.getMessagesController().s1(gf0Var.getUserConfig().f());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = gf0Var.getMessagesController().q1(j3);
        }
        gf0Var.f48004d0 = true;
        gf0Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new pe0(gf0Var, 1));
    }
}

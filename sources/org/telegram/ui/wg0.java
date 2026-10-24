package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class wg0 implements org.telegram.ui.Components.bm0, org.telegram.ui.ActionBar.z1 {
    public final lh0 f43349a;

    public wg0(lh0 lh0Var) {
        this.f43349a = lh0Var;
    }

    @Override
    public boolean d(int i10, View view) {
        lh0 lh0Var = this.f43349a;
        if ((i10 < lh0Var.f39299y || i10 >= lh0Var.E) && (i10 < lh0Var.H || i10 >= lh0Var.I)) {
            return false;
        }
        ((ih0) view).f38306x.callOnClick();
        try {
            view.performHapticFeedback(0, 2);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        TLRPC.TL_messages_deleteRevokedExportedChatInvites tL_messages_deleteRevokedExportedChatInvites = new TLRPC.TL_messages_deleteRevokedExportedChatInvites();
        lh0 lh0Var = this.f43349a;
        tL_messages_deleteRevokedExportedChatInvites.peer = lh0Var.getMessagesController().getInputPeer(-lh0Var.f39287n);
        long j10 = lh0Var.f39279f;
        if (j10 == lh0Var.getUserConfig().getClientUserId()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = lh0Var.getMessagesController().getInputUser(lh0Var.getUserConfig().getCurrentUser());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = lh0Var.getMessagesController().getInputUser(j10);
        }
        lh0Var.f39276c0 = true;
        lh0Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new tg0(lh0Var, 1));
    }
}

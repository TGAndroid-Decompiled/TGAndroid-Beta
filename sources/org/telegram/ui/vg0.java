package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class vg0 implements org.telegram.ui.Components.bm0, org.telegram.ui.ActionBar.b2 {
    public final jh0 f44806a;

    public vg0(jh0 jh0Var) {
        this.f44806a = jh0Var;
    }

    @Override
    public boolean c(int i10, View view) {
        jh0 jh0Var = this.f44806a;
        if ((i10 < jh0Var.f40673y || i10 >= jh0Var.E) && (i10 < jh0Var.H || i10 >= jh0Var.I)) {
            return false;
        }
        ((gh0) view).f39696x.callOnClick();
        try {
            view.performHapticFeedback(0, 2);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        TLRPC.TL_messages_deleteRevokedExportedChatInvites tL_messages_deleteRevokedExportedChatInvites = new TLRPC.TL_messages_deleteRevokedExportedChatInvites();
        jh0 jh0Var = this.f44806a;
        tL_messages_deleteRevokedExportedChatInvites.peer = jh0Var.getMessagesController().getInputPeer(-jh0Var.f40661n);
        long j10 = jh0Var.f40653f;
        if (j10 == jh0Var.getUserConfig().getClientUserId()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = jh0Var.getMessagesController().getInputUser(jh0Var.getUserConfig().getCurrentUser());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = jh0Var.getMessagesController().getInputUser(j10);
        }
        jh0Var.f40650c0 = true;
        jh0Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new sg0(jh0Var, 1));
    }
}

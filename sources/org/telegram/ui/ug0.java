package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class ug0 implements org.telegram.ui.Components.yl0, org.telegram.ui.ActionBar.a2 {
    public final jh0 f41955a;

    public ug0(jh0 jh0Var) {
        this.f41955a = jh0Var;
    }

    @Override
    public boolean a(int i10, View view) {
        jh0 jh0Var = this.f41955a;
        if ((i10 < jh0Var.f38170y || i10 >= jh0Var.E) && (i10 < jh0Var.H || i10 >= jh0Var.I)) {
            return false;
        }
        ((gh0) view).f37187x.callOnClick();
        try {
            view.performHapticFeedback(0, 2);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        TLRPC.TL_messages_deleteRevokedExportedChatInvites tL_messages_deleteRevokedExportedChatInvites = new TLRPC.TL_messages_deleteRevokedExportedChatInvites();
        jh0 jh0Var = this.f41955a;
        tL_messages_deleteRevokedExportedChatInvites.peer = jh0Var.getMessagesController().getInputPeer(-jh0Var.f38158n);
        long j10 = jh0Var.f38150f;
        if (j10 == jh0Var.getUserConfig().getClientUserId()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = jh0Var.getMessagesController().getInputUser(jh0Var.getUserConfig().getCurrentUser());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = jh0Var.getMessagesController().getInputUser(j10);
        }
        jh0Var.f38147c0 = true;
        jh0Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new rg0(jh0Var, 1));
    }
}

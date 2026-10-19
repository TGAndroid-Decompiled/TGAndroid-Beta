package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class sg0 implements org.telegram.ui.Components.yl0, org.telegram.ui.ActionBar.a2 {
    public final hh0 f41457a;

    public sg0(hh0 hh0Var) {
        this.f41457a = hh0Var;
    }

    @Override
    public boolean a(int i10, View view) {
        hh0 hh0Var = this.f41457a;
        if ((i10 < hh0Var.f37650y || i10 >= hh0Var.E) && (i10 < hh0Var.H || i10 >= hh0Var.I)) {
            return false;
        }
        ((eh0) view).f36670x.callOnClick();
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
        hh0 hh0Var = this.f41457a;
        tL_messages_deleteRevokedExportedChatInvites.peer = hh0Var.getMessagesController().getInputPeer(-hh0Var.f37638n);
        long j10 = hh0Var.f37630f;
        if (j10 == hh0Var.getUserConfig().getClientUserId()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = hh0Var.getMessagesController().getInputUser(hh0Var.getUserConfig().getCurrentUser());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = hh0Var.getMessagesController().getInputUser(j10);
        }
        hh0Var.f37627c0 = true;
        hh0Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new pg0(hh0Var, 1));
    }
}

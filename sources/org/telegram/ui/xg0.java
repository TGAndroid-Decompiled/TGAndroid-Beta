package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class xg0 implements org.telegram.ui.Components.cm0, org.telegram.ui.ActionBar.b2 {
    public final lh0 f45681a;

    public xg0(lh0 lh0Var) {
        this.f45681a = lh0Var;
    }

    @Override
    public boolean c(int i10, View view) {
        lh0 lh0Var = this.f45681a;
        if ((i10 < lh0Var.f41189y || i10 >= lh0Var.E) && (i10 < lh0Var.H || i10 >= lh0Var.I)) {
            return false;
        }
        ((ih0) view).f40185x.callOnClick();
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
        lh0 lh0Var = this.f45681a;
        tL_messages_deleteRevokedExportedChatInvites.peer = lh0Var.getMessagesController().getInputPeer(-lh0Var.f41177n);
        long j10 = lh0Var.f41169f;
        if (j10 == lh0Var.getUserConfig().getClientUserId()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = lh0Var.getMessagesController().getInputUser(lh0Var.getUserConfig().getCurrentUser());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = lh0Var.getMessagesController().getInputUser(j10);
        }
        lh0Var.f41166c0 = true;
        lh0Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new ug0(lh0Var, 1));
    }
}

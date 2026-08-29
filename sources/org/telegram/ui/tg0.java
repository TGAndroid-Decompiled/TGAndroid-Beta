package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class tg0 implements org.telegram.ui.Components.bl0, org.telegram.ui.ActionBar.b2 {
    public final hh0 f42706a;

    public tg0(hh0 hh0Var) {
        this.f42706a = hh0Var;
    }

    @Override
    public boolean c(int i10, View view) {
        hh0 hh0Var = this.f42706a;
        if ((i10 < hh0Var.f38937y || i10 >= hh0Var.A) && (i10 < hh0Var.D || i10 >= hh0Var.E)) {
            return false;
        }
        ((eh0) view).f37836x.callOnClick();
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
        hh0 hh0Var = this.f42706a;
        tL_messages_deleteRevokedExportedChatInvites.peer = hh0Var.getMessagesController().getInputPeer(-hh0Var.f38929n);
        long j10 = hh0Var.f38921f;
        if (j10 == hh0Var.getUserConfig().getClientUserId()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = hh0Var.getMessagesController().getInputUser(hh0Var.getUserConfig().getCurrentUser());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = hh0Var.getMessagesController().getInputUser(j10);
        }
        hh0Var.Y = true;
        hh0Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new qg0(hh0Var, 1));
    }
}

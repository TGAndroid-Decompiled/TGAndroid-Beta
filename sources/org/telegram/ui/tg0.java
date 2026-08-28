package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class tg0 implements org.telegram.ui.Components.ok0, org.telegram.ui.ActionBar.b2 {
    public final hh0 f42996a;

    public tg0(hh0 hh0Var) {
        this.f42996a = hh0Var;
    }

    @Override
    public boolean a(int i9, View view) {
        hh0 hh0Var = this.f42996a;
        if ((i9 < hh0Var.f38816y || i9 >= hh0Var.A) && (i9 < hh0Var.D || i9 >= hh0Var.E)) {
            return false;
        }
        ((eh0) view).f37957x.callOnClick();
        try {
            view.performHapticFeedback(0, 2);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        TLRPC.TL_messages_deleteRevokedExportedChatInvites tL_messages_deleteRevokedExportedChatInvites = new TLRPC.TL_messages_deleteRevokedExportedChatInvites();
        hh0 hh0Var = this.f42996a;
        tL_messages_deleteRevokedExportedChatInvites.peer = hh0Var.getMessagesController().getInputPeer(-hh0Var.f38808n);
        long j10 = hh0Var.f38800f;
        if (j10 == hh0Var.getUserConfig().getClientUserId()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = hh0Var.getMessagesController().getInputUser(hh0Var.getUserConfig().getCurrentUser());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = hh0Var.getMessagesController().getInputUser(j10);
        }
        hh0Var.Y = true;
        hh0Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new qg0(hh0Var, 1));
    }
}

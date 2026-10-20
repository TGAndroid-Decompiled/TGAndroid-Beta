package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class tg0 implements org.telegram.ui.Components.zl0, org.telegram.ui.ActionBar.a2 {
    public final ih0 f41670a;

    public tg0(ih0 ih0Var) {
        this.f41670a = ih0Var;
    }

    @Override
    public boolean a(int i10, View view) {
        ih0 ih0Var = this.f41670a;
        if ((i10 < ih0Var.f38004y || i10 >= ih0Var.E) && (i10 < ih0Var.H || i10 >= ih0Var.I)) {
            return false;
        }
        ((fh0) view).f37013x.callOnClick();
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
        ih0 ih0Var = this.f41670a;
        tL_messages_deleteRevokedExportedChatInvites.peer = ih0Var.getMessagesController().getInputPeer(-ih0Var.f37992n);
        long j10 = ih0Var.f37984f;
        if (j10 == ih0Var.getUserConfig().getClientUserId()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = ih0Var.getMessagesController().getInputUser(ih0Var.getUserConfig().getCurrentUser());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = ih0Var.getMessagesController().getInputUser(j10);
        }
        ih0Var.f37981c0 = true;
        ih0Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new qg0(ih0Var, 1));
    }
}

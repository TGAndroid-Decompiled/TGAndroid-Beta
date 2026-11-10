package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class se0 implements org.telegram.ui.Components.dj0, org.telegram.ui.ActionBar.r1 {
    public final ff0 f49846a;

    public se0(ff0 ff0Var) {
        this.f49846a = ff0Var;
    }

    @Override
    public boolean c(int i7, View view) {
        ff0 ff0Var = this.f49846a;
        if ((i7 < ff0Var.D || i7 >= ff0Var.E) && (i7 < ff0Var.H || i7 >= ff0Var.I)) {
            return false;
        }
        ((cf0) view).f44349y.callOnClick();
        try {
            view.performHapticFeedback(0, 2);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        TLRPC.TL_messages_deleteRevokedExportedChatInvites tL_messages_deleteRevokedExportedChatInvites = new TLRPC.TL_messages_deleteRevokedExportedChatInvites();
        ff0 ff0Var = this.f49846a;
        tL_messages_deleteRevokedExportedChatInvites.peer = ff0Var.getMessagesController().j1(-ff0Var.f45746n);
        long j3 = ff0Var.f45738f;
        if (j3 == ff0Var.getUserConfig().e()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = ff0Var.getMessagesController().q1(ff0Var.getUserConfig().f());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = ff0Var.getMessagesController().o1(j3);
        }
        ff0Var.f45734c0 = true;
        ff0Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new pe0(ff0Var, 1));
    }
}

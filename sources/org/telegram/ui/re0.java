package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class re0 implements org.telegram.ui.Components.ej0, org.telegram.ui.ActionBar.r1 {
    public final ef0 f49472a;

    public re0(ef0 ef0Var) {
        this.f49472a = ef0Var;
    }

    @Override
    public boolean c(int i7, View view) {
        ef0 ef0Var = this.f49472a;
        if ((i7 < ef0Var.D || i7 >= ef0Var.E) && (i7 < ef0Var.H || i7 >= ef0Var.I)) {
            return false;
        }
        ((bf0) view).f44034y.callOnClick();
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
        ef0 ef0Var = this.f49472a;
        tL_messages_deleteRevokedExportedChatInvites.peer = ef0Var.getMessagesController().j1(-ef0Var.f45422n);
        long j3 = ef0Var.f45414f;
        if (j3 == ef0Var.getUserConfig().e()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = ef0Var.getMessagesController().q1(ef0Var.getUserConfig().f());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = ef0Var.getMessagesController().o1(j3);
        }
        ef0Var.f45410c0 = true;
        ef0Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new oe0(ef0Var, 1));
    }
}

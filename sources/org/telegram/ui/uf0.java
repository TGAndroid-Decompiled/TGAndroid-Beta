package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class uf0 implements org.telegram.ui.Components.jk0, org.telegram.ui.ActionBar.u1 {
    public final ig0 f41935a;

    public uf0(ig0 ig0Var) {
        this.f41935a = ig0Var;
    }

    @Override
    public boolean f(int i10, View view) {
        ig0 ig0Var = this.f41935a;
        if ((i10 < ig0Var.D || i10 >= ig0Var.E) && (i10 < ig0Var.H || i10 >= ig0Var.I)) {
            return false;
        }
        ((fg0) view).f37146y.callOnClick();
        try {
            view.performHapticFeedback(0, 2);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        TLRPC.TL_messages_deleteRevokedExportedChatInvites tL_messages_deleteRevokedExportedChatInvites = new TLRPC.TL_messages_deleteRevokedExportedChatInvites();
        ig0 ig0Var = this.f41935a;
        tL_messages_deleteRevokedExportedChatInvites.peer = ig0Var.getMessagesController().i1(-ig0Var.f38042n);
        long j10 = ig0Var.f38034f;
        if (j10 == ig0Var.getUserConfig().e()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = ig0Var.getMessagesController().p1(ig0Var.getUserConfig().f());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = ig0Var.getMessagesController().n1(j10);
        }
        ig0Var.f38031c0 = true;
        ig0Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new rf0(ig0Var, 1));
    }
}

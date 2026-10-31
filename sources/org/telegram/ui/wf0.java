package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class wf0 implements org.telegram.ui.Components.ik0, org.telegram.ui.ActionBar.u1 {
    public final kg0 f43297a;

    public wf0(kg0 kg0Var) {
        this.f43297a = kg0Var;
    }

    @Override
    public boolean f(int i10, View view) {
        kg0 kg0Var = this.f43297a;
        if ((i10 < kg0Var.D || i10 >= kg0Var.E) && (i10 < kg0Var.H || i10 >= kg0Var.I)) {
            return false;
        }
        ((hg0) view).f37963y.callOnClick();
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
        kg0 kg0Var = this.f43297a;
        tL_messages_deleteRevokedExportedChatInvites.peer = kg0Var.getMessagesController().i1(-kg0Var.f38810n);
        long j10 = kg0Var.f38802f;
        if (j10 == kg0Var.getUserConfig().e()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = kg0Var.getMessagesController().p1(kg0Var.getUserConfig().f());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = kg0Var.getMessagesController().n1(j10);
        }
        kg0Var.f38799c0 = true;
        kg0Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new sf0(kg0Var, 1));
    }
}

package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class re0 implements org.telegram.ui.Components.sj0, org.telegram.ui.ActionBar.q1 {
    public final ef0 f51713a;

    public re0(ef0 ef0Var) {
        this.f51713a = ef0Var;
    }

    @Override
    public boolean b(int i7, View view) {
        ef0 ef0Var = this.f51713a;
        if ((i7 < ef0Var.E || i7 >= ef0Var.F) && (i7 < ef0Var.I || i7 >= ef0Var.J)) {
            return false;
        }
        ((bf0) view).f46040y.callOnClick();
        try {
            view.performHapticFeedback(0, 2);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        TLRPC.TL_messages_deleteRevokedExportedChatInvites tL_messages_deleteRevokedExportedChatInvites = new TLRPC.TL_messages_deleteRevokedExportedChatInvites();
        ef0 ef0Var = this.f51713a;
        tL_messages_deleteRevokedExportedChatInvites.peer = ef0Var.getMessagesController().l1(-ef0Var.f47533n);
        long j3 = ef0Var.f47525f;
        if (j3 == ef0Var.getUserConfig().e()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = ef0Var.getMessagesController().s1(ef0Var.getUserConfig().f());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = ef0Var.getMessagesController().q1(j3);
        }
        ef0Var.f47522d0 = true;
        ef0Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new oe0(ef0Var, 1));
    }
}

package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class re0 implements org.telegram.ui.Components.sj0, org.telegram.ui.ActionBar.q1 {
    public final ff0 f51598a;

    public re0(ff0 ff0Var) {
        this.f51598a = ff0Var;
    }

    @Override
    public boolean c(int i7, View view) {
        ff0 ff0Var = this.f51598a;
        if ((i7 < ff0Var.E || i7 >= ff0Var.F) && (i7 < ff0Var.I || i7 >= ff0Var.J)) {
            return false;
        }
        ((cf0) view).f46547y.callOnClick();
        try {
            view.performHapticFeedback(0, 2);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        TLRPC.TL_messages_deleteRevokedExportedChatInvites tL_messages_deleteRevokedExportedChatInvites = new TLRPC.TL_messages_deleteRevokedExportedChatInvites();
        ff0 ff0Var = this.f51598a;
        tL_messages_deleteRevokedExportedChatInvites.peer = ff0Var.getMessagesController().l1(-ff0Var.f47673n);
        long j3 = ff0Var.f47665f;
        if (j3 == ff0Var.getUserConfig().e()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = ff0Var.getMessagesController().s1(ff0Var.getUserConfig().f());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = ff0Var.getMessagesController().q1(j3);
        }
        ff0Var.f47662d0 = true;
        ff0Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new oe0(ff0Var, 1));
    }
}

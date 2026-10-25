package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class vg0 implements org.telegram.ui.Components.bm0, org.telegram.ui.ActionBar.b2 {
    public final jh0 f44803a;

    public vg0(jh0 jh0Var) {
        this.f44803a = jh0Var;
    }

    @Override
    public boolean c(int i10, View view) {
        jh0 jh0Var = this.f44803a;
        if ((i10 < jh0Var.f40670y || i10 >= jh0Var.E) && (i10 < jh0Var.H || i10 >= jh0Var.I)) {
            return false;
        }
        ((gh0) view).f39693x.callOnClick();
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
        jh0 jh0Var = this.f44803a;
        tL_messages_deleteRevokedExportedChatInvites.peer = jh0Var.getMessagesController().getInputPeer(-jh0Var.f40658n);
        long j10 = jh0Var.f40650f;
        if (j10 == jh0Var.getUserConfig().getClientUserId()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = jh0Var.getMessagesController().getInputUser(jh0Var.getUserConfig().getCurrentUser());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = jh0Var.getMessagesController().getInputUser(j10);
        }
        jh0Var.f40647c0 = true;
        jh0Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new sg0(jh0Var, 1));
    }
}

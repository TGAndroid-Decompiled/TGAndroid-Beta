package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class vg0 implements org.telegram.ui.Components.yl0, org.telegram.ui.ActionBar.a2 {
    public final kh0 f42220a;

    public vg0(kh0 kh0Var) {
        this.f42220a = kh0Var;
    }

    @Override
    public boolean a(int i10, View view) {
        kh0 kh0Var = this.f42220a;
        if ((i10 < kh0Var.f38563y || i10 >= kh0Var.E) && (i10 < kh0Var.H || i10 >= kh0Var.I)) {
            return false;
        }
        ((hh0) view).f37578x.callOnClick();
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
        kh0 kh0Var = this.f42220a;
        tL_messages_deleteRevokedExportedChatInvites.peer = kh0Var.getMessagesController().getInputPeer(-kh0Var.f38551n);
        long j10 = kh0Var.f38543f;
        if (j10 == kh0Var.getUserConfig().getClientUserId()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = kh0Var.getMessagesController().getInputUser(kh0Var.getUserConfig().getCurrentUser());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = kh0Var.getMessagesController().getInputUser(j10);
        }
        kh0Var.f38540c0 = true;
        kh0Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new sg0(kh0Var, 1));
    }
}

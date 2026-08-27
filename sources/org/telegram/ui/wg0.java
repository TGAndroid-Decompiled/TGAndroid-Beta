package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

public final class wg0 implements org.telegram.ui.Components.rk0, org.telegram.ui.ActionBar.a2 {

    public final kh0 f44116a;

    public wg0(kh0 kh0Var) {
        this.f44116a = kh0Var;
    }

    @Override
    public boolean a(int i10, View view) {
        kh0 kh0Var = this.f44116a;
        if ((i10 < kh0Var.f39761y || i10 >= kh0Var.A) && (i10 < kh0Var.D || i10 >= kh0Var.E)) {
            return false;
        }
        ((hh0) view).f38834x.callOnClick();
        try {
            view.performHapticFeedback(0, 2);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        TLRPC.TL_messages_deleteRevokedExportedChatInvites tL_messages_deleteRevokedExportedChatInvites = new TLRPC.TL_messages_deleteRevokedExportedChatInvites();
        kh0 kh0Var = this.f44116a;
        tL_messages_deleteRevokedExportedChatInvites.peer = kh0Var.getMessagesController().getInputPeer(-kh0Var.f39753n);
        long j10 = kh0Var.f39745f;
        if (j10 == kh0Var.getUserConfig().getClientUserId()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = kh0Var.getMessagesController().getInputUser(kh0Var.getUserConfig().getCurrentUser());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = kh0Var.getMessagesController().getInputUser(j10);
        }
        kh0Var.Y = true;
        kh0Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new tg0(kh0Var, 1));
    }
}

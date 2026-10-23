package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class xg0 implements org.telegram.ui.Components.cm0, org.telegram.ui.ActionBar.z1 {
    public final mh0 f43599a;

    public xg0(mh0 mh0Var) {
        this.f43599a = mh0Var;
    }

    @Override
    public boolean d(int i10, View view) {
        mh0 mh0Var = this.f43599a;
        if ((i10 < mh0Var.f39604y || i10 >= mh0Var.E) && (i10 < mh0Var.H || i10 >= mh0Var.I)) {
            return false;
        }
        ((jh0) view).f38582x.callOnClick();
        try {
            view.performHapticFeedback(0, 2);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        TLRPC.TL_messages_deleteRevokedExportedChatInvites tL_messages_deleteRevokedExportedChatInvites = new TLRPC.TL_messages_deleteRevokedExportedChatInvites();
        mh0 mh0Var = this.f43599a;
        tL_messages_deleteRevokedExportedChatInvites.peer = mh0Var.getMessagesController().getInputPeer(-mh0Var.f39592n);
        long j10 = mh0Var.f39584f;
        if (j10 == mh0Var.getUserConfig().getClientUserId()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = mh0Var.getMessagesController().getInputUser(mh0Var.getUserConfig().getCurrentUser());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = mh0Var.getMessagesController().getInputUser(j10);
        }
        mh0Var.f39581c0 = true;
        mh0Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new ug0(mh0Var, 1));
    }
}

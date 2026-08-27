package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

public final class vh implements org.telegram.ui.Components.f8 {

    public final rn f43461a;

    public vh(rn rnVar) {
        this.f43461a = rnVar;
    }

    @Override
    public final void V0(int i10, int i11) {
        rn rnVar = this.f43461a;
        rnVar.getMessagesController().setDialogHistoryTTL(rnVar.P5, i10);
        if (rnVar.W7 == null && rnVar.V7 == null) {
            return;
        }
        rnVar.Q7();
        UndoView undoView = rnVar.f42229u3;
        if (undoView == null) {
            return;
        }
        long j10 = rnVar.P5;
        TLRPC.User user = rnVar.f42039f;
        TLRPC.UserFull userFull = rnVar.W7;
        undoView.k(j10, i11, user, Integer.valueOf(userFull != null ? userFull.ttl_period : rnVar.V7.ttl_period), null, null);
    }

    @Override
    public final void dismiss() {
        org.telegram.ui.ActionBar.n1 n1Var = this.f43461a.M8;
        if (n1Var != null) {
            n1Var.dismiss();
        }
    }

    @Override
    public final void j1() {
    }
}

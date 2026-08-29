package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class wh implements org.telegram.ui.Components.l8 {
    public final tn f44309a;

    public wh(tn tnVar) {
        this.f44309a = tnVar;
    }

    @Override
    public final void T0(int i10, int i11) {
        int i12;
        tn tnVar = this.f44309a;
        tnVar.getMessagesController().setDialogHistoryTTL(tnVar.P5, i10);
        if (tnVar.W7 != null || tnVar.V7 != null) {
            tnVar.Q7();
            UndoView undoView = tnVar.f42989u3;
            if (undoView == null) {
                return;
            }
            long j10 = tnVar.P5;
            TLRPC.User user = tnVar.f42801f;
            TLRPC.UserFull userFull = tnVar.W7;
            if (userFull != null) {
                i12 = userFull.ttl_period;
            } else {
                i12 = tnVar.V7.ttl_period;
            }
            undoView.k(j10, i11, user, Integer.valueOf(i12), null, null);
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.ui.ActionBar.o1 o1Var = this.f44309a.M8;
        if (o1Var != null) {
            o1Var.dismiss();
        }
    }

    @Override
    public final void e1() {
    }
}

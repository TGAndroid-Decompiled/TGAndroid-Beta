package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class th implements org.telegram.ui.Components.g8 {
    public final qn f43005a;

    public th(qn qnVar) {
        this.f43005a = qnVar;
    }

    @Override
    public final void V0(int i9, int i10) {
        int i11;
        qn qnVar = this.f43005a;
        qnVar.getMessagesController().setDialogHistoryTTL(qnVar.P5, i9);
        if (qnVar.W7 != null || qnVar.V7 != null) {
            qnVar.Q7();
            UndoView undoView = qnVar.f42093u3;
            if (undoView == null) {
                return;
            }
            long j10 = qnVar.P5;
            TLRPC.User user = qnVar.f41903f;
            TLRPC.UserFull userFull = qnVar.W7;
            if (userFull != null) {
                i11 = userFull.ttl_period;
            } else {
                i11 = qnVar.V7.ttl_period;
            }
            undoView.k(j10, i10, user, Integer.valueOf(i11), null, null);
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.ui.ActionBar.o1 o1Var = this.f43005a.M8;
        if (o1Var != null) {
            o1Var.dismiss();
        }
    }

    @Override
    public final void h1() {
    }
}

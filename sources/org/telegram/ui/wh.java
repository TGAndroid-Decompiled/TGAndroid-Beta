package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class wh implements org.telegram.ui.Components.o8 {
    public final qn f42874a;

    public wh(qn qnVar) {
        this.f42874a = qnVar;
    }

    @Override
    public final void H0(int i10, int i11) {
        int i12;
        qn qnVar = this.f42874a;
        qnVar.getMessagesController().setDialogHistoryTTL(qnVar.T5, i10);
        if (qnVar.f40613a8 != null || qnVar.Z7 != null) {
            qnVar.T7();
            UndoView undoView = qnVar.y3;
            if (undoView == null) {
                return;
            }
            long j10 = qnVar.T5;
            TLRPC.User user = qnVar.f40670f;
            TLRPC.UserFull userFull = qnVar.f40613a8;
            if (userFull != null) {
                i12 = userFull.ttl_period;
            } else {
                i12 = qnVar.Z7.ttl_period;
            }
            undoView.k(j10, i11, user, Integer.valueOf(i12), null, null);
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.ui.ActionBar.m1 m1Var = this.f42874a.Q8;
        if (m1Var != null) {
            m1Var.dismiss();
        }
    }

    @Override
    public final void Y0() {
    }
}

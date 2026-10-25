package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class xh implements org.telegram.ui.Components.q8 {
    public final un f45772a;

    public xh(un unVar) {
        this.f45772a = unVar;
    }

    @Override
    public final void T0(int i10, int i11) {
        int i12;
        un unVar = this.f45772a;
        unVar.getMessagesController().setDialogHistoryTTL(unVar.f44249f6, i10);
        if (unVar.f44334m8 != null || unVar.f44322l8 != null) {
            unVar.X7();
            UndoView undoView = unVar.K3;
            if (undoView == null) {
                return;
            }
            long j10 = unVar.f44249f6;
            TLRPC.User user = unVar.f44242f;
            TLRPC.UserFull userFull = unVar.f44334m8;
            if (userFull != null) {
                i12 = userFull.ttl_period;
            } else {
                i12 = unVar.f44322l8.ttl_period;
            }
            undoView.k(j10, i11, user, Integer.valueOf(i12), null, null);
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.ui.ActionBar.o1 o1Var = this.f45772a.f44213c9;
        if (o1Var != null) {
            o1Var.dismiss();
        }
    }

    @Override
    public final void e1() {
    }
}

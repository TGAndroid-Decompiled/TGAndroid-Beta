package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class wh implements org.telegram.ui.Components.m8 {
    public final sn f43353a;

    public wh(sn snVar) {
        this.f43353a = snVar;
    }

    @Override
    public final void H0(int i10, int i11) {
        int i12;
        sn snVar = this.f43353a;
        snVar.getMessagesController().setDialogHistoryTTL(snVar.f41516f6, i10);
        if (snVar.f41601m8 != null || snVar.f41589l8 != null) {
            snVar.T7();
            UndoView undoView = snVar.K3;
            if (undoView == null) {
                return;
            }
            long j10 = snVar.f41516f6;
            TLRPC.User user = snVar.f41509f;
            TLRPC.UserFull userFull = snVar.f41601m8;
            if (userFull != null) {
                i12 = userFull.ttl_period;
            } else {
                i12 = snVar.f41589l8.ttl_period;
            }
            undoView.k(j10, i11, user, Integer.valueOf(i12), null, null);
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.ui.ActionBar.m1 m1Var = this.f43353a.f41481c9;
        if (m1Var != null) {
            m1Var.dismiss();
        }
    }

    @Override
    public final void Y0() {
    }
}

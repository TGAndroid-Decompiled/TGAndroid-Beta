package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class yh implements org.telegram.ui.Components.o8 {
    public final sn f43408a;

    public yh(sn snVar) {
        this.f43408a = snVar;
    }

    @Override
    public final void H0(int i10, int i11) {
        int i12;
        sn snVar = this.f43408a;
        snVar.getMessagesController().setDialogHistoryTTL(snVar.T5, i10);
        if (snVar.f41151a8 != null || snVar.Z7 != null) {
            snVar.T7();
            UndoView undoView = snVar.y3;
            if (undoView == null) {
                return;
            }
            long j10 = snVar.T5;
            TLRPC.User user = snVar.f41208f;
            TLRPC.UserFull userFull = snVar.f41151a8;
            if (userFull != null) {
                i12 = userFull.ttl_period;
            } else {
                i12 = snVar.Z7.ttl_period;
            }
            undoView.k(j10, i11, user, Integer.valueOf(i12), null, null);
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.ui.ActionBar.m1 m1Var = this.f43408a.Q8;
        if (m1Var != null) {
            m1Var.dismiss();
        }
    }

    @Override
    public final void Y0() {
    }
}

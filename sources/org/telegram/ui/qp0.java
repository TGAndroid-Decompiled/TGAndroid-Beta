package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class qp0 implements org.telegram.ui.ActionBar.t0 {
    public final zp0 f41759a;

    public qp0(zp0 zp0Var) {
        this.f41759a = zp0Var;
    }

    @Override
    public final void e() {
        int i10;
        int i11;
        zp0 zp0Var = this.f41759a;
        org.telegram.ui.ActionBar.g1 g1Var = zp0Var.M;
        if (zp0Var.U) {
            i10 = R.string.ShowAsGrid;
        } else {
            i10 = R.string.ShowAsList;
        }
        g1Var.setText(LocaleController.getString(i10));
        org.telegram.ui.ActionBar.g1 g1Var2 = zp0Var.M;
        if (zp0Var.U) {
            i11 = R.drawable.msg_media;
        } else {
            i11 = R.drawable.msg_list;
        }
        g1Var2.setIcon(i11);
    }

    @Override
    public final void b() {
    }
}

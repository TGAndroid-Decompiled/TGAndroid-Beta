package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class qp0 implements org.telegram.ui.ActionBar.t0 {
    public final zp0 f42174a;

    public qp0(zp0 zp0Var) {
        this.f42174a = zp0Var;
    }

    @Override
    public final void d() {
        int i9;
        int i10;
        zp0 zp0Var = this.f42174a;
        org.telegram.ui.ActionBar.g1 g1Var = zp0Var.M;
        if (zp0Var.U) {
            i9 = R.string.ShowAsGrid;
        } else {
            i9 = R.string.ShowAsList;
        }
        g1Var.setText(LocaleController.getString(i9));
        org.telegram.ui.ActionBar.g1 g1Var2 = zp0Var.M;
        if (zp0Var.U) {
            i10 = R.drawable.msg_media;
        } else {
            i10 = R.drawable.msg_list;
        }
        g1Var2.setIcon(i10);
    }

    @Override
    public final void c() {
    }
}

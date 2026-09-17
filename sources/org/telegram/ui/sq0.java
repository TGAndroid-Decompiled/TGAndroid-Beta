package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class sq0 implements org.telegram.ui.ActionBar.t0 {
    public final cr0 f37544a;

    public sq0(cr0 cr0Var) {
        this.f37544a = cr0Var;
    }

    @Override
    public final void e() {
        int i10;
        int i11;
        cr0 cr0Var = this.f37544a;
        org.telegram.ui.ActionBar.g1 g1Var = cr0Var.Q;
        if (cr0Var.Y) {
            i10 = R.string.ShowAsGrid;
        } else {
            i10 = R.string.ShowAsList;
        }
        g1Var.setText(LocaleController.getString(i10));
        org.telegram.ui.ActionBar.g1 g1Var2 = cr0Var.Q;
        if (cr0Var.Y) {
            i11 = R.drawable.msg_media;
        } else {
            i11 = R.drawable.msg_list;
        }
        g1Var2.setIcon(i11);
    }

    @Override
    public final void c() {
    }
}

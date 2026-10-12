package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class tq0 implements org.telegram.ui.ActionBar.r0 {
    public final dr0 f42267a;

    public tq0(dr0 dr0Var) {
        this.f42267a = dr0Var;
    }

    @Override
    public final void e() {
        int i10;
        int i11;
        dr0 dr0Var = this.f42267a;
        org.telegram.ui.ActionBar.e1 e1Var = dr0Var.Q;
        if (dr0Var.Y) {
            i10 = R.string.ShowAsGrid;
        } else {
            i10 = R.string.ShowAsList;
        }
        e1Var.setText(LocaleController.getString(i10));
        org.telegram.ui.ActionBar.e1 e1Var2 = dr0Var.Q;
        if (dr0Var.Y) {
            i11 = R.drawable.msg_media;
        } else {
            i11 = R.drawable.msg_list;
        }
        e1Var2.setIcon(i11);
    }

    @Override
    public final void c() {
    }
}

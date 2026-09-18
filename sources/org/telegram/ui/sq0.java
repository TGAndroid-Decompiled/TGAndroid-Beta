package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class sq0 implements org.telegram.ui.ActionBar.s0 {
    public final cr0 f37391a;

    public sq0(cr0 cr0Var) {
        this.f37391a = cr0Var;
    }

    @Override
    public final void e() {
        int i10;
        int i11;
        cr0 cr0Var = this.f37391a;
        org.telegram.ui.ActionBar.f1 f1Var = cr0Var.Q;
        if (cr0Var.Y) {
            i10 = R.string.ShowAsGrid;
        } else {
            i10 = R.string.ShowAsList;
        }
        f1Var.setText(LocaleController.getString(i10));
        org.telegram.ui.ActionBar.f1 f1Var2 = cr0Var.Q;
        if (cr0Var.Y) {
            i11 = R.drawable.msg_media;
        } else {
            i11 = R.drawable.msg_list;
        }
        f1Var2.setIcon(i11);
    }

    @Override
    public final void c() {
    }
}

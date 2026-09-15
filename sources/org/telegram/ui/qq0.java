package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class qq0 implements org.telegram.ui.ActionBar.s0 {
    public final ar0 f36932a;

    public qq0(ar0 ar0Var) {
        this.f36932a = ar0Var;
    }

    @Override
    public final void e() {
        int i10;
        int i11;
        ar0 ar0Var = this.f36932a;
        org.telegram.ui.ActionBar.f1 f1Var = ar0Var.Q;
        if (ar0Var.Y) {
            i10 = R.string.ShowAsGrid;
        } else {
            i10 = R.string.ShowAsList;
        }
        f1Var.setText(LocaleController.getString(i10));
        org.telegram.ui.ActionBar.f1 f1Var2 = ar0Var.Q;
        if (ar0Var.Y) {
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

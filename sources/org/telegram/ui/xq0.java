package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class xq0 implements org.telegram.ui.ActionBar.r0 {
    public final hr0 f41914a;

    public xq0(hr0 hr0Var) {
        this.f41914a = hr0Var;
    }

    @Override
    public final void e() {
        int i10;
        int i11;
        hr0 hr0Var = this.f41914a;
        org.telegram.ui.ActionBar.e1 e1Var = hr0Var.Q;
        if (hr0Var.Y) {
            i10 = R.string.ShowAsGrid;
        } else {
            i10 = R.string.ShowAsList;
        }
        e1Var.setText(LocaleController.getString(i10));
        org.telegram.ui.ActionBar.e1 e1Var2 = hr0Var.Q;
        if (hr0Var.Y) {
            i11 = R.drawable.msg_media;
        } else {
            i11 = R.drawable.msg_list;
        }
        e1Var2.setIcon(i11);
    }

    @Override
    public final void d() {
    }
}

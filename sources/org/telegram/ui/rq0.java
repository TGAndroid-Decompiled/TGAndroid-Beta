package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class rq0 implements org.telegram.ui.ActionBar.t0 {
    public final br0 f36444a;

    public rq0(br0 br0Var) {
        this.f36444a = br0Var;
    }

    @Override
    public final void e() {
        int i10;
        int i11;
        br0 br0Var = this.f36444a;
        org.telegram.ui.ActionBar.g1 g1Var = br0Var.Q;
        if (br0Var.Y) {
            i10 = R.string.ShowAsGrid;
        } else {
            i10 = R.string.ShowAsList;
        }
        g1Var.setText(LocaleController.getString(i10));
        org.telegram.ui.ActionBar.g1 g1Var2 = br0Var.Q;
        if (br0Var.Y) {
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

package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class zp0 implements org.telegram.ui.ActionBar.r0 {
    public final jq0 f43794a;

    public zp0(jq0 jq0Var) {
        this.f43794a = jq0Var;
    }

    @Override
    public final void f() {
        int i10;
        int i11;
        jq0 jq0Var = this.f43794a;
        org.telegram.ui.ActionBar.e1 e1Var = jq0Var.Q;
        if (jq0Var.Y) {
            i10 = R.string.ShowAsGrid;
        } else {
            i10 = R.string.ShowAsList;
        }
        e1Var.setText(LocaleController.getString(i10));
        org.telegram.ui.ActionBar.e1 e1Var2 = jq0Var.Q;
        if (jq0Var.Y) {
            i11 = R.drawable.msg_media;
        } else {
            i11 = R.drawable.msg_list;
        }
        e1Var2.setIcon(i11);
    }

    @Override
    public final void e() {
    }
}

package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class vq0 implements org.telegram.ui.ActionBar.r0 {
    public final fr0 f40751a;

    public vq0(fr0 fr0Var) {
        this.f40751a = fr0Var;
    }

    @Override
    public final void e() {
        int i10;
        int i11;
        fr0 fr0Var = this.f40751a;
        org.telegram.ui.ActionBar.e1 e1Var = fr0Var.Q;
        if (fr0Var.Y) {
            i10 = R.string.ShowAsGrid;
        } else {
            i10 = R.string.ShowAsList;
        }
        e1Var.setText(LocaleController.getString(i10));
        org.telegram.ui.ActionBar.e1 e1Var2 = fr0Var.Q;
        if (fr0Var.Y) {
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

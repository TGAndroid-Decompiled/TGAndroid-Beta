package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class rp0 implements org.telegram.ui.ActionBar.s0 {

    public final aq0 f42308a;

    public rp0(aq0 aq0Var) {
        this.f42308a = aq0Var;
    }

    @Override
    public final void d() {
        aq0 aq0Var = this.f42308a;
        aq0Var.M.setText(LocaleController.getString(aq0Var.U ? R.string.ShowAsGrid : R.string.ShowAsList));
        aq0Var.M.setIcon(aq0Var.U ? R.drawable.msg_media : R.drawable.msg_list);
    }

    @Override
    public final void c() {
    }
}

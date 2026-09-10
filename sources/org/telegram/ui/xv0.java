package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
public final class xv0 extends org.telegram.ui.Cells.e6 {
    public final zv0 F;

    public xv0(zv0 zv0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.F = zv0Var;
    }

    @Override
    public final void g(org.telegram.ui.Cells.d6 d6Var, ActionMode actionMode) {
        if (d6Var.isFocused() && d6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                eo.k8(menu, this.F.d.f31432f.h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(boolean z10) {
        bw0.d0(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.e6 e6Var) {
        bw0.e0(this.F.d, e6Var);
    }
}

package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
public final class qv0 extends org.telegram.ui.Cells.d6 {
    public final sv0 F;

    public qv0(sv0 sv0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.F = sv0Var;
    }

    @Override
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
        if (c6Var.isFocused() && c6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                xn.k8(menu, this.F.d.f38345f.h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(boolean z10) {
        uv0.d0(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        uv0.e0(this.F.d, d6Var);
    }
}

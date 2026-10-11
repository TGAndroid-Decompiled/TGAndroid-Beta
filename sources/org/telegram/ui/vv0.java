package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
public final class vv0 extends org.telegram.ui.Cells.d6 {
    public final xv0 F;

    public vv0(xv0 xv0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.F = xv0Var;
    }

    @Override
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
        if (c6Var.isFocused() && c6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                zn.n8(menu, this.F.d.f45097f.h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(boolean z10) {
        zv0.d0(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        zv0.e0(this.F.d, d6Var);
    }
}

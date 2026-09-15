package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
public final class wv0 extends org.telegram.ui.Cells.c6 {
    public final yv0 F;

    public wv0(yv0 yv0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.F = yv0Var;
    }

    @Override
    public final void g(org.telegram.ui.Cells.b6 b6Var, ActionMode actionMode) {
        if (b6Var.isFocused() && b6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                bo.k8(menu, this.F.d.f31975f.h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(boolean z10) {
        aw0.d0(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        aw0.e0(this.F.d, c6Var);
    }
}

package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
public final class vs0 extends org.telegram.ui.Cells.e6 {
    public final xs0 F;

    public vs0(xs0 xs0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.F = xs0Var;
    }

    @Override
    public final void g(ih.b bVar, ActionMode actionMode) {
        if (bVar.isFocused() && bVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                un.x8(menu, this.F.d.f44060f.h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(boolean z10) {
        zs0.i0(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.e6 e6Var) {
        zs0.j0(this.F.d, e6Var);
    }
}

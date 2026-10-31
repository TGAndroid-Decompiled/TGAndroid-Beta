package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
public final class ws0 extends org.telegram.ui.Cells.e6 {
    public final ys0 F;

    public ws0(ys0 ys0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.F = ys0Var;
    }

    @Override
    public final void g(ih.b bVar, ActionMode actionMode) {
        if (bVar.isFocused() && bVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                un.t8(menu, this.F.d.f35717f.h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(boolean z10) {
        at0.h0(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.e6 e6Var) {
        at0.i0(this.F.d, e6Var);
    }
}

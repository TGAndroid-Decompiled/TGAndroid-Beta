package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
public final class ru0 extends org.telegram.ui.Cells.a6 {
    public final tu0 B;

    public ru0(tu0 tu0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.B = tu0Var;
    }

    @Override
    public final void g(bh.b bVar, ActionMode actionMode) {
        if (bVar.isFocused() && bVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                tn.k8(menu, this.B.d.f43761f.h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(boolean z10) {
        vu0.d0(this.B.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.a6 a6Var) {
        vu0.e0(this.B.d, a6Var);
    }
}

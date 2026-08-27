package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;

public final class uu0 extends org.telegram.ui.Cells.z5 {
    public final wu0 B;

    public uu0(wu0 wu0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.B = wu0Var;
    }

    @Override
    public final void g(gh.r rVar, ActionMode actionMode) {
        if (rVar.isFocused() && rVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) == null) {
                return;
            }
            rn.k8(menu, this.B.d.f44925f.h, false, true, true, true);
        }
    }

    @Override
    public final void i(boolean z10) {
        yu0.d0(this.B.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.z5 z5Var) {
        yu0.e0(this.B.d, z5Var);
    }
}

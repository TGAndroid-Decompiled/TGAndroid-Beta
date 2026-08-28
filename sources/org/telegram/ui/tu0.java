package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
public final class tu0 extends org.telegram.ui.Cells.c6 {
    public final vu0 B;

    public tu0(vu0 vu0Var, Context context, int i9) {
        super(context, i9, null, null);
        this.B = vu0Var;
    }

    @Override
    public final void g(fh.s sVar, ActionMode actionMode) {
        if (sVar.isFocused() && sVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                qn.k8(menu, this.B.d.f44616f.h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(boolean z10) {
        xu0.c0(this.B.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        xu0.d0(this.B.d, c6Var);
    }
}

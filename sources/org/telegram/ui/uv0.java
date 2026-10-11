package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;
public final class uv0 extends org.telegram.ui.Cells.d6 {
    public final xv0 F;

    public uv0(xv0 xv0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.F = xv0Var;
    }

    @Override
    public final void i(boolean z10) {
        zv0.d0(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        zv0.e0(this.F.d, d6Var);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        zv0 zv0Var = this.F.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.c6 c6Var = this.d;
        c6Var.getText().replace(c6Var.getSelectionStart(), c6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < zv0Var.f45139n) {
            for (int length = zv0Var.v.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = zv0Var.v;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            zv0Var.v[i10] = (CharSequence) arrayList.remove(0);
            zv0Var.f45155y++;
            i10++;
        }
        zv0Var.r0();
        zv0Var.f45133g0 = (zv0Var.f45140n0 + i10) - 1;
        zv0Var.f45124b.l();
        return true;
    }

    @Override
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
    }
}

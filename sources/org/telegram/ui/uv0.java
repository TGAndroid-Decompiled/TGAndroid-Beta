package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;
public final class uv0 extends org.telegram.ui.Cells.c6 {
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
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        zv0.e0(this.F.d, c6Var);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        zv0 zv0Var = this.F.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.b6 b6Var = this.d;
        b6Var.getText().replace(b6Var.getSelectionStart(), b6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < zv0Var.f43544n) {
            for (int length = zv0Var.v.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = zv0Var.v;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            zv0Var.v[i10] = (CharSequence) arrayList.remove(0);
            zv0Var.f43560y++;
            i10++;
        }
        zv0Var.r0();
        zv0Var.f43538g0 = (zv0Var.f43545n0 + i10) - 1;
        zv0Var.f43529b.l();
        return true;
    }

    @Override
    public final void g(org.telegram.ui.Cells.b6 b6Var, ActionMode actionMode) {
    }
}

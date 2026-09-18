package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;
public final class xv0 extends org.telegram.ui.Cells.c6 {
    public final aw0 F;

    public xv0(aw0 aw0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.F = aw0Var;
    }

    @Override
    public final void i(boolean z10) {
        cw0.d0(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        cw0.e0(this.F.d, c6Var);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        cw0 cw0Var = this.F.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.b6 b6Var = this.d;
        b6Var.getText().replace(b6Var.getSelectionStart(), b6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < cw0Var.f32950n) {
            for (int length = cw0Var.v.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = cw0Var.v;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            cw0Var.v[i10] = (CharSequence) arrayList.remove(0);
            cw0Var.f32966y++;
            i10++;
        }
        cw0Var.r0();
        cw0Var.f32944g0 = (cw0Var.f32951n0 + i10) - 1;
        cw0Var.f32936b.l();
        return true;
    }

    @Override
    public final void g(org.telegram.ui.Cells.b6 b6Var, ActionMode actionMode) {
    }
}

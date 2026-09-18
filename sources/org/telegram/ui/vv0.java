package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;
public final class vv0 extends org.telegram.ui.Cells.d6 {
    public final yv0 F;

    public vv0(yv0 yv0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.F = yv0Var;
    }

    @Override
    public final void i(boolean z10) {
        aw0.d0(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        aw0.e0(this.F.d, d6Var);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        aw0 aw0Var = this.F.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.c6 c6Var = this.d;
        c6Var.getText().replace(c6Var.getSelectionStart(), c6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < aw0Var.f32177n) {
            for (int length = aw0Var.v.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = aw0Var.v;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            aw0Var.v[i10] = (CharSequence) arrayList.remove(0);
            aw0Var.f32193y++;
            i10++;
        }
        aw0Var.r0();
        aw0Var.f32171g0 = (aw0Var.f32178n0 + i10) - 1;
        aw0Var.f32163b.l();
        return true;
    }

    @Override
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
    }
}

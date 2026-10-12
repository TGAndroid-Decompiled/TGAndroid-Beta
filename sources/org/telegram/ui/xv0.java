package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;
public final class xv0 extends org.telegram.ui.Cells.d6 {
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
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        cw0.e0(this.F.d, d6Var);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        cw0 cw0Var = this.F.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.c6 c6Var = this.d;
        c6Var.getText().replace(c6Var.getSelectionStart(), c6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < cw0Var.f36557n) {
            for (int length = cw0Var.v.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = cw0Var.v;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            cw0Var.v[i10] = (CharSequence) arrayList.remove(0);
            cw0Var.f36573y++;
            i10++;
        }
        cw0Var.r0();
        cw0Var.f36551g0 = (cw0Var.f36558n0 + i10) - 1;
        cw0Var.f36542b.l();
        return true;
    }

    @Override
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
    }
}

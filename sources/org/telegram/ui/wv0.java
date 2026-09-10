package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;
public final class wv0 extends org.telegram.ui.Cells.e6 {
    public final zv0 F;

    public wv0(zv0 zv0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.F = zv0Var;
    }

    @Override
    public final void i(boolean z10) {
        bw0.d0(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.e6 e6Var) {
        bw0.e0(this.F.d, e6Var);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        bw0 bw0Var = this.F.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.d6 d6Var = this.d;
        d6Var.getText().replace(d6Var.getSelectionStart(), d6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < bw0Var.f31440n) {
            for (int length = bw0Var.v.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = bw0Var.v;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            bw0Var.v[i10] = (CharSequence) arrayList.remove(0);
            bw0Var.f31456y++;
            i10++;
        }
        bw0Var.r0();
        bw0Var.f31434g0 = (bw0Var.f31441n0 + i10) - 1;
        bw0Var.f31426b.l();
        return true;
    }

    @Override
    public final void g(org.telegram.ui.Cells.d6 d6Var, ActionMode actionMode) {
    }
}

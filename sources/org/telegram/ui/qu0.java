package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;
public final class qu0 extends org.telegram.ui.Cells.a6 {
    public final tu0 B;

    public qu0(tu0 tu0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.B = tu0Var;
    }

    @Override
    public final void i(boolean z10) {
        vu0.d0(this.B.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.a6 a6Var) {
        vu0.e0(this.B.d, a6Var);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        vu0 vu0Var = this.B.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        bh.b bVar = this.d;
        bVar.getText().replace(bVar.getSelectionStart(), bVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < vu0Var.f43769n) {
            for (int length = vu0Var.v.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = vu0Var.v;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            vu0Var.v[i10] = (CharSequence) arrayList.remove(0);
            vu0Var.f43785y++;
            i10++;
        }
        vu0Var.r0();
        vu0Var.f43757c0 = (vu0Var.f43766j0 + i10) - 1;
        vu0Var.f43754b.l();
        return true;
    }

    @Override
    public final void g(bh.b bVar, ActionMode actionMode) {
    }
}

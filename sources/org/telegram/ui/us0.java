package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;
public final class us0 extends org.telegram.ui.Cells.e6 {
    public final xs0 F;

    public us0(xs0 xs0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.F = xs0Var;
    }

    @Override
    public final void i(boolean z10) {
        zs0.i0(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.e6 e6Var) {
        zs0.j0(this.F.d, e6Var);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        zs0 zs0Var = this.F.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        ih.b bVar = this.d;
        bVar.getText().replace(bVar.getSelectionStart(), bVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < zs0Var.f44068n) {
            for (int length = zs0Var.f44080w.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = zs0Var.f44080w;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            zs0Var.f44080w[i10] = (CharSequence) arrayList.remove(0);
            zs0Var.D++;
            i10++;
        }
        zs0Var.w0();
        zs0Var.f44062g0 = (zs0Var.f44069n0 + i10) - 1;
        zs0Var.f44054b.f();
        return true;
    }

    @Override
    public final void g(ih.b bVar, ActionMode actionMode) {
    }
}

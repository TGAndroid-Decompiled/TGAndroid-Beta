package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;
public final class vv0 extends org.telegram.ui.Cells.e6 {
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
    public final void j(org.telegram.ui.Cells.e6 e6Var) {
        aw0.e0(this.F.d, e6Var);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        aw0 aw0Var = this.F.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.d6 d6Var = this.d;
        d6Var.getText().replace(d6Var.getSelectionStart(), d6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < aw0Var.f32212n) {
            for (int length = aw0Var.v.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = aw0Var.v;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            aw0Var.v[i10] = (CharSequence) arrayList.remove(0);
            aw0Var.f32228y++;
            i10++;
        }
        aw0Var.r0();
        aw0Var.f32206g0 = (aw0Var.f32213n0 + i10) - 1;
        aw0Var.f32198b.l();
        return true;
    }

    @Override
    public final void g(org.telegram.ui.Cells.d6 d6Var, ActionMode actionMode) {
    }
}

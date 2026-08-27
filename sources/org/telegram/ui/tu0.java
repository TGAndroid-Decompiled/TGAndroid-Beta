package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;

public final class tu0 extends org.telegram.ui.Cells.z5 {
    public final wu0 B;

    public tu0(wu0 wu0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.B = wu0Var;
    }

    @Override
    public final void i(boolean z10) {
        yu0.d0(this.B.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.z5 z5Var) {
        yu0.e0(this.B.d, z5Var);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        yu0 yu0Var = this.B.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        gh.r rVar = this.d;
        rVar.getText().replace(rVar.getSelectionStart(), rVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < yu0Var.f44933n) {
            for (int length = yu0Var.v.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = yu0Var.v;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            yu0Var.v[i10] = (CharSequence) arrayList.remove(0);
            yu0Var.f44949y++;
            i10++;
        }
        yu0Var.r0();
        yu0Var.f44921c0 = (yu0Var.f44930j0 + i10) - 1;
        yu0Var.f44918b.l();
        return true;
    }

    @Override
    public final void g(gh.r rVar, ActionMode actionMode) {
    }
}

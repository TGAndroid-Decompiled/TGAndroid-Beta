package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;

public final class vu0 extends org.telegram.ui.Cells.z5 {
    public final wu0 B;

    public vu0(wu0 wu0Var, Context context, int i10, u50 u50Var) {
        super(context, i10, u50Var, null);
        this.B = wu0Var;
    }

    @Override
    public final boolean e() {
        yu0 yu0Var = this.B.d;
        ta1 ta1Var = yu0Var.f44920c;
        View viewF = ta1Var.F(this);
        f2.o1 o1VarT = viewF == null ? null : ta1Var.T(viewF);
        if (o1VarT != null) {
            int iB = o1VarT.b();
            int i10 = yu0Var.f44949y;
            if (i10 == yu0Var.f44933n && iB == (yu0Var.f44930j0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f(org.telegram.ui.Cells.z5 z5Var) {
        int iB;
        yu0 yu0Var = this.B.d;
        ta1 ta1Var = yu0Var.f44920c;
        View viewF = ta1Var.F(z5Var);
        f2.o1 o1VarT = viewF == null ? null : ta1Var.T(viewF);
        if (o1VarT == null || (iB = o1VarT.b()) == -1) {
            return false;
        }
        return yu0Var.f44945w[iB - yu0Var.f44930j0];
    }

    @Override
    public final void g(gh.r rVar, ActionMode actionMode) {
        if (rVar.isFocused() && rVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) == null) {
                return;
            }
            rn.k8(menu, this.B.d.f44925f.h, false, true, true, true);
        }
    }

    @Override
    public final void h(org.telegram.ui.Cells.z5 z5Var, boolean z10) {
        int iB;
        yu0 yu0Var = this.B.d;
        if (z10 && yu0Var.H) {
            Arrays.fill(yu0Var.f44945w, false);
            yu0Var.f44920c.getChildCount();
            for (int i10 = yu0Var.f44930j0; i10 < yu0Var.f44930j0 + yu0Var.f44949y; i10++) {
                f2.o1 o1VarK = yu0Var.f44920c.K(i10);
                if (o1VarK != null) {
                    View view = o1VarK.f5789a;
                    if (view instanceof org.telegram.ui.Cells.z5) {
                        ((org.telegram.ui.Cells.z5) view).f26037r.a(false, true);
                    }
                }
            }
        }
        super.h(z5Var, z10);
        ta1 ta1Var = yu0Var.f44920c;
        View viewF = ta1Var.F(z5Var);
        f2.o1 o1VarT = viewF == null ? null : ta1Var.T(viewF);
        if (o1VarT != null && (iB = o1VarT.b()) != -1) {
            yu0Var.f44945w[iB - yu0Var.f44930j0] = z10;
        }
        yu0Var.i0();
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
        if (!arrayList.isEmpty()) {
            yu0Var.f44920c.getClass();
            int iR = RecyclerView.R(this) - yu0Var.f44930j0;
            if (iR >= 0) {
                gh.r rVar = this.d;
                rVar.getText().replace(rVar.getSelectionStart(), rVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = iR + 1;
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
        }
        return false;
    }

    @Override
    public final boolean p() {
        return this.B.d.H;
    }
}

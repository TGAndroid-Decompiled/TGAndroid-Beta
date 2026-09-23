package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
public final class qv0 extends org.telegram.ui.Cells.d6 {
    public final rv0 F;

    public qv0(rv0 rv0Var, Context context, int i10, h60 h60Var) {
        super(context, i10, h60Var, null);
        this.F = rv0Var;
    }

    @Override
    public final boolean e() {
        s4.c1 T;
        tv0 tv0Var = this.F.d;
        wb1 wb1Var = tv0Var.f37771c;
        View F = wb1Var.F(this);
        if (F == null) {
            T = null;
        } else {
            T = wb1Var.T(F);
        }
        if (T != null) {
            int b10 = T.b();
            int i10 = tv0Var.f37799y;
            if (i10 == tv0Var.f37783n && b10 == (tv0Var.f37784n0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f(org.telegram.ui.Cells.d6 d6Var) {
        s4.c1 T;
        int b10;
        tv0 tv0Var = this.F.d;
        wb1 wb1Var = tv0Var.f37771c;
        View F = wb1Var.F(d6Var);
        if (F == null) {
            T = null;
        } else {
            T = wb1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            return tv0Var.f37795w[b10 - tv0Var.f37784n0];
        }
        return false;
    }

    @Override
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
        if (c6Var.isFocused() && c6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                xn.k8(menu, this.F.d.f37775f.h, false, true, true, true);
            }
        }
    }

    @Override
    public final void h(org.telegram.ui.Cells.d6 d6Var, boolean z10) {
        s4.c1 T;
        int b10;
        tv0 tv0Var = this.F.d;
        if (z10 && tv0Var.L) {
            Arrays.fill(tv0Var.f37795w, false);
            tv0Var.f37771c.getChildCount();
            for (int i10 = tv0Var.f37784n0; i10 < tv0Var.f37784n0 + tv0Var.f37799y; i10++) {
                s4.c1 K = tv0Var.f37771c.K(i10);
                if (K != null) {
                    View view = K.f42627a;
                    if (view instanceof org.telegram.ui.Cells.d6) {
                        ((org.telegram.ui.Cells.d6) view).f19866r.a(false, true);
                    }
                }
            }
        }
        super.h(d6Var, z10);
        wb1 wb1Var = tv0Var.f37771c;
        View F = wb1Var.F(d6Var);
        if (F == null) {
            T = null;
        } else {
            T = wb1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            tv0Var.f37795w[b10 - tv0Var.f37784n0] = z10;
        }
        tv0Var.i0();
    }

    @Override
    public final void i(boolean z10) {
        tv0.d0(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        tv0.e0(this.F.d, d6Var);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        tv0 tv0Var = this.F.d;
        if (!arrayList.isEmpty()) {
            tv0Var.f37771c.getClass();
            int R = RecyclerView.R(this) - tv0Var.f37784n0;
            if (R >= 0) {
                org.telegram.ui.Cells.c6 c6Var = this.d;
                c6Var.getText().replace(c6Var.getSelectionStart(), c6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < tv0Var.f37783n) {
                    for (int length = tv0Var.v.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = tv0Var.v;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    tv0Var.v[i10] = (CharSequence) arrayList.remove(0);
                    tv0Var.f37799y++;
                    i10++;
                }
                tv0Var.r0();
                tv0Var.f37777g0 = (tv0Var.f37784n0 + i10) - 1;
                tv0Var.f37769b.l();
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean o() {
        return this.F.d.L;
    }
}

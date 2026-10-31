package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
public final class xs0 extends org.telegram.ui.Cells.e6 {
    public final ys0 F;

    public xs0(ys0 ys0Var, Context context, int i10, f50 f50Var) {
        super(context, i10, f50Var, null);
        this.F = ys0Var;
    }

    @Override
    public final boolean e() {
        s4.c1 T;
        at0 at0Var = this.F.d;
        w71 w71Var = at0Var.f35713c;
        View F = w71Var.F(this);
        if (F == null) {
            T = null;
        } else {
            T = w71Var.T(F);
        }
        if (T != null) {
            int b10 = T.b();
            int i10 = at0Var.D;
            if (i10 == at0Var.f35725n && b10 == (at0Var.f35726n0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f(org.telegram.ui.Cells.e6 e6Var) {
        s4.c1 T;
        int b10;
        at0 at0Var = this.F.d;
        w71 w71Var = at0Var.f35713c;
        View F = w71Var.F(e6Var);
        if (F == null) {
            T = null;
        } else {
            T = w71Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            return at0Var.f35739x[b10 - at0Var.f35726n0];
        }
        return false;
    }

    @Override
    public final void g(ih.b bVar, ActionMode actionMode) {
        if (bVar.isFocused() && bVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                un.t8(menu, this.F.d.f35717f.h, false, true, true, true);
            }
        }
    }

    @Override
    public final void h(org.telegram.ui.Cells.e6 e6Var, boolean z10) {
        s4.c1 T;
        int b10;
        at0 at0Var = this.F.d;
        at0Var.f35713c.getChildCount();
        if (z10 && at0Var.L) {
            Arrays.fill(at0Var.f35739x, false);
            for (int i10 = at0Var.f35726n0; i10 < at0Var.f35726n0 + at0Var.D; i10++) {
                s4.c1 K = at0Var.f35713c.K(i10);
                if (K != null) {
                    View view = K.f47898a;
                    if (view instanceof org.telegram.ui.Cells.e6) {
                        ((org.telegram.ui.Cells.e6) view).f21863r.a(false, true);
                    }
                }
            }
        }
        super.h(e6Var, z10);
        w71 w71Var = at0Var.f35713c;
        View F = w71Var.F(e6Var);
        if (F == null) {
            T = null;
        } else {
            T = w71Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            at0Var.f35739x[b10 - at0Var.f35726n0] = z10;
        }
        at0Var.m0();
    }

    @Override
    public final void i(boolean z10) {
        at0.h0(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.e6 e6Var) {
        at0.i0(this.F.d, e6Var);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        at0 at0Var = this.F.d;
        if (!arrayList.isEmpty()) {
            at0Var.f35713c.getClass();
            int R = RecyclerView.R(this) - at0Var.f35726n0;
            if (R >= 0) {
                ih.b bVar = this.d;
                bVar.getText().replace(bVar.getSelectionStart(), bVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < at0Var.f35725n) {
                    for (int length = at0Var.f35737w.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = at0Var.f35737w;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    at0Var.f35737w[i10] = (CharSequence) arrayList.remove(0);
                    at0Var.D++;
                    i10++;
                }
                at0Var.v0();
                at0Var.f35719g0 = (at0Var.f35726n0 + i10) - 1;
                at0Var.f35711b.f();
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

package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
public final class su0 extends org.telegram.ui.Cells.a6 {
    public final tu0 B;

    public su0(tu0 tu0Var, Context context, int i10, t50 t50Var) {
        super(context, i10, t50Var, null);
        this.B = tu0Var;
    }

    @Override
    public final boolean e() {
        f2.n1 T;
        vu0 vu0Var = this.B.d;
        wa1 wa1Var = vu0Var.f43756c;
        View F = wa1Var.F(this);
        if (F == null) {
            T = null;
        } else {
            T = wa1Var.T(F);
        }
        if (T != null) {
            int b10 = T.b();
            int i10 = vu0Var.f43785y;
            if (i10 == vu0Var.f43769n && b10 == (vu0Var.f43766j0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f(org.telegram.ui.Cells.a6 a6Var) {
        f2.n1 T;
        int b10;
        vu0 vu0Var = this.B.d;
        wa1 wa1Var = vu0Var.f43756c;
        View F = wa1Var.F(a6Var);
        if (F == null) {
            T = null;
        } else {
            T = wa1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            return vu0Var.f43781w[b10 - vu0Var.f43766j0];
        }
        return false;
    }

    @Override
    public final void g(bh.b bVar, ActionMode actionMode) {
        if (bVar.isFocused() && bVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                tn.k8(menu, this.B.d.f43761f.h, false, true, true, true);
            }
        }
    }

    @Override
    public final void h(org.telegram.ui.Cells.a6 a6Var, boolean z10) {
        f2.n1 T;
        int b10;
        vu0 vu0Var = this.B.d;
        if (z10 && vu0Var.H) {
            Arrays.fill(vu0Var.f43781w, false);
            vu0Var.f43756c.getChildCount();
            for (int i10 = vu0Var.f43766j0; i10 < vu0Var.f43766j0 + vu0Var.f43785y; i10++) {
                f2.n1 K = vu0Var.f43756c.K(i10);
                if (K != null) {
                    View view = K.f6432a;
                    if (view instanceof org.telegram.ui.Cells.a6) {
                        ((org.telegram.ui.Cells.a6) view).f24087r.a(false, true);
                    }
                }
            }
        }
        super.h(a6Var, z10);
        wa1 wa1Var = vu0Var.f43756c;
        View F = wa1Var.F(a6Var);
        if (F == null) {
            T = null;
        } else {
            T = wa1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            vu0Var.f43781w[b10 - vu0Var.f43766j0] = z10;
        }
        vu0Var.i0();
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
        if (!arrayList.isEmpty()) {
            vu0Var.f43756c.getClass();
            int R = RecyclerView.R(this) - vu0Var.f43766j0;
            if (R >= 0) {
                bh.b bVar = this.d;
                bVar.getText().replace(bVar.getSelectionStart(), bVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
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
        }
        return false;
    }

    @Override
    public final boolean o() {
        return this.B.d.H;
    }
}

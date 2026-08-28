package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
public final class uu0 extends org.telegram.ui.Cells.c6 {
    public final vu0 B;

    public uu0(vu0 vu0Var, Context context, int i9, q50 q50Var) {
        super(context, i9, q50Var, null);
        this.B = vu0Var;
    }

    @Override
    public final boolean d() {
        f2.q1 T;
        xu0 xu0Var = this.B.d;
        va1 va1Var = xu0Var.f44611c;
        View F = va1Var.F(this);
        if (F == null) {
            T = null;
        } else {
            T = va1Var.T(F);
        }
        if (T != null) {
            int b10 = T.b();
            int i9 = xu0Var.f44640y;
            if (i9 == xu0Var.f44624n && b10 == (xu0Var.f44621j0 + i9) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f(org.telegram.ui.Cells.c6 c6Var) {
        f2.q1 T;
        int b10;
        xu0 xu0Var = this.B.d;
        va1 va1Var = xu0Var.f44611c;
        View F = va1Var.F(c6Var);
        if (F == null) {
            T = null;
        } else {
            T = va1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            return xu0Var.f44636w[b10 - xu0Var.f44621j0];
        }
        return false;
    }

    @Override
    public final void g(fh.s sVar, ActionMode actionMode) {
        if (sVar.isFocused() && sVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                qn.k8(menu, this.B.d.f44616f.h, false, true, true, true);
            }
        }
    }

    @Override
    public final void h(org.telegram.ui.Cells.c6 c6Var, boolean z10) {
        f2.q1 T;
        int b10;
        xu0 xu0Var = this.B.d;
        if (z10 && xu0Var.H) {
            Arrays.fill(xu0Var.f44636w, false);
            xu0Var.f44611c.getChildCount();
            for (int i9 = xu0Var.f44621j0; i9 < xu0Var.f44621j0 + xu0Var.f44640y; i9++) {
                f2.q1 K = xu0Var.f44611c.K(i9);
                if (K != null) {
                    View view = K.f5501a;
                    if (view instanceof org.telegram.ui.Cells.c6) {
                        ((org.telegram.ui.Cells.c6) view).f24201r.a(false, true);
                    }
                }
            }
        }
        super.h(c6Var, z10);
        va1 va1Var = xu0Var.f44611c;
        View F = va1Var.F(c6Var);
        if (F == null) {
            T = null;
        } else {
            T = va1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            xu0Var.f44636w[b10 - xu0Var.f44621j0] = z10;
        }
        xu0Var.h0();
    }

    @Override
    public final void i(boolean z10) {
        xu0.c0(this.B.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        xu0.d0(this.B.d, c6Var);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        xu0 xu0Var = this.B.d;
        if (!arrayList.isEmpty()) {
            xu0Var.f44611c.getClass();
            int R = RecyclerView.R(this) - xu0Var.f44621j0;
            if (R >= 0) {
                fh.s sVar = this.d;
                sVar.getText().replace(sVar.getSelectionStart(), sVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i9 = R + 1;
                while (!arrayList.isEmpty() && i9 < xu0Var.f44624n) {
                    for (int length = xu0Var.v.length - 1; length > i9; length--) {
                        CharSequence[] charSequenceArr = xu0Var.v;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    xu0Var.v[i9] = (CharSequence) arrayList.remove(0);
                    xu0Var.f44640y++;
                    i9++;
                }
                xu0Var.q0();
                xu0Var.f44612c0 = (xu0Var.f44621j0 + i9) - 1;
                xu0Var.f44609b.l();
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

package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
public final class xv0 extends org.telegram.ui.Cells.c6 {
    public final yv0 F;

    public xv0(yv0 yv0Var, Context context, int i10, k60 k60Var) {
        super(context, i10, k60Var, null);
        this.F = yv0Var;
    }

    @Override
    public final boolean e() {
        s4.c1 T;
        aw0 aw0Var = this.F.d;
        dc1 dc1Var = aw0Var.f31971c;
        View F = dc1Var.F(this);
        if (F == null) {
            T = null;
        } else {
            T = dc1Var.T(F);
        }
        if (T != null) {
            int b10 = T.b();
            int i10 = aw0Var.f31999y;
            if (i10 == aw0Var.f31983n && b10 == (aw0Var.f31984n0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f(org.telegram.ui.Cells.c6 c6Var) {
        s4.c1 T;
        int b10;
        aw0 aw0Var = this.F.d;
        dc1 dc1Var = aw0Var.f31971c;
        View F = dc1Var.F(c6Var);
        if (F == null) {
            T = null;
        } else {
            T = dc1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            return aw0Var.f31995w[b10 - aw0Var.f31984n0];
        }
        return false;
    }

    @Override
    public final void g(org.telegram.ui.Cells.b6 b6Var, ActionMode actionMode) {
        if (b6Var.isFocused() && b6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                bo.k8(menu, this.F.d.f31975f.h, false, true, true, true);
            }
        }
    }

    @Override
    public final void h(org.telegram.ui.Cells.c6 c6Var, boolean z10) {
        s4.c1 T;
        int b10;
        aw0 aw0Var = this.F.d;
        if (z10 && aw0Var.L) {
            Arrays.fill(aw0Var.f31995w, false);
            aw0Var.f31971c.getChildCount();
            for (int i10 = aw0Var.f31984n0; i10 < aw0Var.f31984n0 + aw0Var.f31999y; i10++) {
                s4.c1 K = aw0Var.f31971c.K(i10);
                if (K != null) {
                    View view = K.f42675a;
                    if (view instanceof org.telegram.ui.Cells.c6) {
                        ((org.telegram.ui.Cells.c6) view).f19865r.a(false, true);
                    }
                }
            }
        }
        super.h(c6Var, z10);
        dc1 dc1Var = aw0Var.f31971c;
        View F = dc1Var.F(c6Var);
        if (F == null) {
            T = null;
        } else {
            T = dc1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            aw0Var.f31995w[b10 - aw0Var.f31984n0] = z10;
        }
        aw0Var.i0();
    }

    @Override
    public final void i(boolean z10) {
        aw0.d0(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        aw0.e0(this.F.d, c6Var);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        aw0 aw0Var = this.F.d;
        if (!arrayList.isEmpty()) {
            aw0Var.f31971c.getClass();
            int R = RecyclerView.R(this) - aw0Var.f31984n0;
            if (R >= 0) {
                org.telegram.ui.Cells.b6 b6Var = this.d;
                b6Var.getText().replace(b6Var.getSelectionStart(), b6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < aw0Var.f31983n) {
                    for (int length = aw0Var.v.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = aw0Var.v;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    aw0Var.v[i10] = (CharSequence) arrayList.remove(0);
                    aw0Var.f31999y++;
                    i10++;
                }
                aw0Var.r0();
                aw0Var.f31977g0 = (aw0Var.f31984n0 + i10) - 1;
                aw0Var.f31969b.l();
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

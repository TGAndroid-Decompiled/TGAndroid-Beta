package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
public final class xv0 extends org.telegram.ui.Cells.d6 {
    public final yv0 F;

    public xv0(yv0 yv0Var, Context context, int i10, k60 k60Var) {
        super(context, i10, k60Var, null);
        this.F = yv0Var;
    }

    @Override
    public final boolean e() {
        s4.c1 U;
        aw0 aw0Var = this.F.d;
        dc1 dc1Var = aw0Var.f32165c;
        View G = dc1Var.G(this);
        if (G == null) {
            U = null;
        } else {
            U = dc1Var.U(G);
        }
        if (U != null) {
            int b10 = U.b();
            int i10 = aw0Var.f32193y;
            if (i10 == aw0Var.f32177n && b10 == (aw0Var.f32178n0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f(org.telegram.ui.Cells.d6 d6Var) {
        s4.c1 U;
        int b10;
        aw0 aw0Var = this.F.d;
        dc1 dc1Var = aw0Var.f32165c;
        View G = dc1Var.G(d6Var);
        if (G == null) {
            U = null;
        } else {
            U = dc1Var.U(G);
        }
        if (U != null && (b10 = U.b()) != -1) {
            return aw0Var.f32189w[b10 - aw0Var.f32178n0];
        }
        return false;
    }

    @Override
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
        if (c6Var.isFocused() && c6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                zn.k8(menu, this.F.d.f32169f.h, false, true, true, true);
            }
        }
    }

    @Override
    public final void h(org.telegram.ui.Cells.d6 d6Var, boolean z10) {
        s4.c1 U;
        int b10;
        aw0 aw0Var = this.F.d;
        if (z10 && aw0Var.L) {
            Arrays.fill(aw0Var.f32189w, false);
            aw0Var.f32165c.getChildCount();
            for (int i10 = aw0Var.f32178n0; i10 < aw0Var.f32178n0 + aw0Var.f32193y; i10++) {
                s4.c1 L = aw0Var.f32165c.L(i10);
                if (L != null) {
                    View view = L.f42929a;
                    if (view instanceof org.telegram.ui.Cells.d6) {
                        ((org.telegram.ui.Cells.d6) view).f20103r.a(false, true);
                    }
                }
            }
        }
        super.h(d6Var, z10);
        dc1 dc1Var = aw0Var.f32165c;
        View G = dc1Var.G(d6Var);
        if (G == null) {
            U = null;
        } else {
            U = dc1Var.U(G);
        }
        if (U != null && (b10 = U.b()) != -1) {
            aw0Var.f32189w[b10 - aw0Var.f32178n0] = z10;
        }
        aw0Var.i0();
    }

    @Override
    public final void i(boolean z10) {
        aw0.d0(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        aw0.e0(this.F.d, d6Var);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        aw0 aw0Var = this.F.d;
        if (!arrayList.isEmpty()) {
            aw0Var.f32165c.getClass();
            int S = RecyclerView.S(this) - aw0Var.f32178n0;
            if (S >= 0) {
                org.telegram.ui.Cells.c6 c6Var = this.d;
                c6Var.getText().replace(c6Var.getSelectionStart(), c6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = S + 1;
                while (!arrayList.isEmpty() && i10 < aw0Var.f32177n) {
                    for (int length = aw0Var.v.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = aw0Var.v;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    aw0Var.v[i10] = (CharSequence) arrayList.remove(0);
                    aw0Var.f32193y++;
                    i10++;
                }
                aw0Var.r0();
                aw0Var.f32171g0 = (aw0Var.f32178n0 + i10) - 1;
                aw0Var.f32163b.l();
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

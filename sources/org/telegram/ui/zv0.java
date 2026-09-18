package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
public final class zv0 extends org.telegram.ui.Cells.c6 {
    public final aw0 F;

    public zv0(aw0 aw0Var, Context context, int i10, m60 m60Var) {
        super(context, i10, m60Var, null);
        this.F = aw0Var;
    }

    @Override
    public final boolean e() {
        s4.c1 U;
        cw0 cw0Var = this.F.d;
        fc1 fc1Var = cw0Var.f32938c;
        View G = fc1Var.G(this);
        if (G == null) {
            U = null;
        } else {
            U = fc1Var.U(G);
        }
        if (U != null) {
            int b10 = U.b();
            int i10 = cw0Var.f32966y;
            if (i10 == cw0Var.f32950n && b10 == (cw0Var.f32951n0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f(org.telegram.ui.Cells.c6 c6Var) {
        s4.c1 U;
        int b10;
        cw0 cw0Var = this.F.d;
        fc1 fc1Var = cw0Var.f32938c;
        View G = fc1Var.G(c6Var);
        if (G == null) {
            U = null;
        } else {
            U = fc1Var.U(G);
        }
        if (U != null && (b10 = U.b()) != -1) {
            return cw0Var.f32962w[b10 - cw0Var.f32951n0];
        }
        return false;
    }

    @Override
    public final void g(org.telegram.ui.Cells.b6 b6Var, ActionMode actionMode) {
        if (b6Var.isFocused() && b6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                bo.k8(menu, this.F.d.f32942f.h, false, true, true, true);
            }
        }
    }

    @Override
    public final void h(org.telegram.ui.Cells.c6 c6Var, boolean z10) {
        s4.c1 U;
        int b10;
        cw0 cw0Var = this.F.d;
        if (z10 && cw0Var.L) {
            Arrays.fill(cw0Var.f32962w, false);
            cw0Var.f32938c.getChildCount();
            for (int i10 = cw0Var.f32951n0; i10 < cw0Var.f32951n0 + cw0Var.f32966y; i10++) {
                s4.c1 L = cw0Var.f32938c.L(i10);
                if (L != null) {
                    View view = L.f42702a;
                    if (view instanceof org.telegram.ui.Cells.c6) {
                        ((org.telegram.ui.Cells.c6) view).f19876r.a(false, true);
                    }
                }
            }
        }
        super.h(c6Var, z10);
        fc1 fc1Var = cw0Var.f32938c;
        View G = fc1Var.G(c6Var);
        if (G == null) {
            U = null;
        } else {
            U = fc1Var.U(G);
        }
        if (U != null && (b10 = U.b()) != -1) {
            cw0Var.f32962w[b10 - cw0Var.f32951n0] = z10;
        }
        cw0Var.i0();
    }

    @Override
    public final void i(boolean z10) {
        cw0.d0(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        cw0.e0(this.F.d, c6Var);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        cw0 cw0Var = this.F.d;
        if (!arrayList.isEmpty()) {
            cw0Var.f32938c.getClass();
            int S = RecyclerView.S(this) - cw0Var.f32951n0;
            if (S >= 0) {
                org.telegram.ui.Cells.b6 b6Var = this.d;
                b6Var.getText().replace(b6Var.getSelectionStart(), b6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = S + 1;
                while (!arrayList.isEmpty() && i10 < cw0Var.f32950n) {
                    for (int length = cw0Var.v.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = cw0Var.v;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    cw0Var.v[i10] = (CharSequence) arrayList.remove(0);
                    cw0Var.f32966y++;
                    i10++;
                }
                cw0Var.r0();
                cw0Var.f32944g0 = (cw0Var.f32951n0 + i10) - 1;
                cw0Var.f32936b.l();
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

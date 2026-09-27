package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
public final class rv0 extends org.telegram.ui.Cells.d6 {
    public final sv0 F;

    public rv0(sv0 sv0Var, Context context, int i10, i60 i60Var) {
        super(context, i10, i60Var, null);
        this.F = sv0Var;
    }

    @Override
    public final boolean e() {
        s4.c1 U;
        uv0 uv0Var = this.F.d;
        wb1 wb1Var = uv0Var.f38341c;
        View G = wb1Var.G(this);
        if (G == null) {
            U = null;
        } else {
            U = wb1Var.U(G);
        }
        if (U != null) {
            int b10 = U.b();
            int i10 = uv0Var.f38369y;
            if (i10 == uv0Var.f38353n && b10 == (uv0Var.f38354n0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f(org.telegram.ui.Cells.d6 d6Var) {
        s4.c1 U;
        int b10;
        uv0 uv0Var = this.F.d;
        wb1 wb1Var = uv0Var.f38341c;
        View G = wb1Var.G(d6Var);
        if (G == null) {
            U = null;
        } else {
            U = wb1Var.U(G);
        }
        if (U != null && (b10 = U.b()) != -1) {
            return uv0Var.f38365w[b10 - uv0Var.f38354n0];
        }
        return false;
    }

    @Override
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
        if (c6Var.isFocused() && c6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                xn.k8(menu, this.F.d.f38345f.h, false, true, true, true);
            }
        }
    }

    @Override
    public final void h(org.telegram.ui.Cells.d6 d6Var, boolean z10) {
        s4.c1 U;
        int b10;
        uv0 uv0Var = this.F.d;
        if (z10 && uv0Var.L) {
            Arrays.fill(uv0Var.f38365w, false);
            uv0Var.f38341c.getChildCount();
            for (int i10 = uv0Var.f38354n0; i10 < uv0Var.f38354n0 + uv0Var.f38369y; i10++) {
                s4.c1 L = uv0Var.f38341c.L(i10);
                if (L != null) {
                    View view = L.f43005a;
                    if (view instanceof org.telegram.ui.Cells.d6) {
                        ((org.telegram.ui.Cells.d6) view).f20141r.a(false, true);
                    }
                }
            }
        }
        super.h(d6Var, z10);
        wb1 wb1Var = uv0Var.f38341c;
        View G = wb1Var.G(d6Var);
        if (G == null) {
            U = null;
        } else {
            U = wb1Var.U(G);
        }
        if (U != null && (b10 = U.b()) != -1) {
            uv0Var.f38365w[b10 - uv0Var.f38354n0] = z10;
        }
        uv0Var.i0();
    }

    @Override
    public final void i(boolean z10) {
        uv0.d0(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        uv0.e0(this.F.d, d6Var);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        uv0 uv0Var = this.F.d;
        if (!arrayList.isEmpty()) {
            uv0Var.f38341c.getClass();
            int S = RecyclerView.S(this) - uv0Var.f38354n0;
            if (S >= 0) {
                org.telegram.ui.Cells.c6 c6Var = this.d;
                c6Var.getText().replace(c6Var.getSelectionStart(), c6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = S + 1;
                while (!arrayList.isEmpty() && i10 < uv0Var.f38353n) {
                    for (int length = uv0Var.v.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = uv0Var.v;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    uv0Var.v[i10] = (CharSequence) arrayList.remove(0);
                    uv0Var.f38369y++;
                    i10++;
                }
                uv0Var.r0();
                uv0Var.f38347g0 = (uv0Var.f38354n0 + i10) - 1;
                uv0Var.f38339b.l();
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

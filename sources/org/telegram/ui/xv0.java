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

    public xv0(yv0 yv0Var, Context context, int i10, m60 m60Var) {
        super(context, i10, m60Var, null);
        this.F = yv0Var;
    }

    @Override
    public final boolean e() {
        s4.d1 T;
        aw0 aw0Var = this.F.d;
        fc1 fc1Var = aw0Var.f36036c;
        View F = fc1Var.F(this);
        if (F == null) {
            T = null;
        } else {
            T = fc1Var.T(F);
        }
        if (T != null) {
            int b10 = T.b();
            int i10 = aw0Var.f36065y;
            if (i10 == aw0Var.f36049n && b10 == (aw0Var.f36050n0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f(org.telegram.ui.Cells.d6 d6Var) {
        s4.d1 T;
        int b10;
        aw0 aw0Var = this.F.d;
        fc1 fc1Var = aw0Var.f36036c;
        View F = fc1Var.F(d6Var);
        if (F == null) {
            T = null;
        } else {
            T = fc1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            return aw0Var.f36061w[b10 - aw0Var.f36050n0];
        }
        return false;
    }

    @Override
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
        if (c6Var.isFocused() && c6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                zn.n8(menu, this.F.d.f36041f.h, false, true, true, true);
            }
        }
    }

    @Override
    public final void h(org.telegram.ui.Cells.d6 d6Var, boolean z10) {
        s4.d1 T;
        int b10;
        aw0 aw0Var = this.F.d;
        if (z10 && aw0Var.L) {
            Arrays.fill(aw0Var.f36061w, false);
            aw0Var.f36036c.getChildCount();
            for (int i10 = aw0Var.f36050n0; i10 < aw0Var.f36050n0 + aw0Var.f36065y; i10++) {
                s4.d1 K = aw0Var.f36036c.K(i10);
                if (K != null) {
                    View view = K.f47656a;
                    if (view instanceof org.telegram.ui.Cells.d6) {
                        ((org.telegram.ui.Cells.d6) view).f21977r.a(false, true);
                    }
                }
            }
        }
        super.h(d6Var, z10);
        fc1 fc1Var = aw0Var.f36036c;
        View F = fc1Var.F(d6Var);
        if (F == null) {
            T = null;
        } else {
            T = fc1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            aw0Var.f36061w[b10 - aw0Var.f36050n0] = z10;
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
            aw0Var.f36036c.getClass();
            int R = RecyclerView.R(this) - aw0Var.f36050n0;
            if (R >= 0) {
                org.telegram.ui.Cells.c6 c6Var = this.d;
                c6Var.getText().replace(c6Var.getSelectionStart(), c6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < aw0Var.f36049n) {
                    for (int length = aw0Var.v.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = aw0Var.v;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    aw0Var.v[i10] = (CharSequence) arrayList.remove(0);
                    aw0Var.f36065y++;
                    i10++;
                }
                aw0Var.r0();
                aw0Var.f36043g0 = (aw0Var.f36050n0 + i10) - 1;
                aw0Var.f36034b.l();
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean p() {
        return this.F.d.L;
    }
}

package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
public final class zv0 extends org.telegram.ui.Cells.d6 {
    public final aw0 F;

    public zv0(aw0 aw0Var, Context context, int i10, o60 o60Var) {
        super(context, i10, o60Var, null);
        this.F = aw0Var;
    }

    @Override
    public final boolean e() {
        s4.d1 T;
        cw0 cw0Var = this.F.d;
        hc1 hc1Var = cw0Var.f36542c;
        View F = hc1Var.F(this);
        if (F == null) {
            T = null;
        } else {
            T = hc1Var.T(F);
        }
        if (T != null) {
            int b10 = T.b();
            int i10 = cw0Var.f36571y;
            if (i10 == cw0Var.f36555n && b10 == (cw0Var.f36556n0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f(org.telegram.ui.Cells.d6 d6Var) {
        s4.d1 T;
        int b10;
        cw0 cw0Var = this.F.d;
        hc1 hc1Var = cw0Var.f36542c;
        View F = hc1Var.F(d6Var);
        if (F == null) {
            T = null;
        } else {
            T = hc1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            return cw0Var.f36567w[b10 - cw0Var.f36556n0];
        }
        return false;
    }

    @Override
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
        if (c6Var.isFocused() && c6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                eo.n8(menu, this.F.d.f36547f.h, false, true, true, true);
            }
        }
    }

    @Override
    public final void h(org.telegram.ui.Cells.d6 d6Var, boolean z10) {
        s4.d1 T;
        int b10;
        cw0 cw0Var = this.F.d;
        if (z10 && cw0Var.L) {
            Arrays.fill(cw0Var.f36567w, false);
            cw0Var.f36542c.getChildCount();
            for (int i10 = cw0Var.f36556n0; i10 < cw0Var.f36556n0 + cw0Var.f36571y; i10++) {
                s4.d1 K = cw0Var.f36542c.K(i10);
                if (K != null) {
                    View view = K.f47889a;
                    if (view instanceof org.telegram.ui.Cells.d6) {
                        ((org.telegram.ui.Cells.d6) view).f21739r.a(false, true);
                    }
                }
            }
        }
        super.h(d6Var, z10);
        hc1 hc1Var = cw0Var.f36542c;
        View F = hc1Var.F(d6Var);
        if (F == null) {
            T = null;
        } else {
            T = hc1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            cw0Var.f36567w[b10 - cw0Var.f36556n0] = z10;
        }
        cw0Var.i0();
    }

    @Override
    public final void i(boolean z10) {
        cw0.d0(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        cw0.e0(this.F.d, d6Var);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        cw0 cw0Var = this.F.d;
        if (!arrayList.isEmpty()) {
            cw0Var.f36542c.getClass();
            int R = RecyclerView.R(this) - cw0Var.f36556n0;
            if (R >= 0) {
                org.telegram.ui.Cells.c6 c6Var = this.d;
                c6Var.getText().replace(c6Var.getSelectionStart(), c6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < cw0Var.f36555n) {
                    for (int length = cw0Var.v.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = cw0Var.v;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    cw0Var.v[i10] = (CharSequence) arrayList.remove(0);
                    cw0Var.f36571y++;
                    i10++;
                }
                cw0Var.r0();
                cw0Var.f36549g0 = (cw0Var.f36556n0 + i10) - 1;
                cw0Var.f36540b.l();
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

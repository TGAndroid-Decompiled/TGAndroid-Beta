package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
public final class wv0 extends org.telegram.ui.Cells.c6 {
    public final xv0 F;

    public wv0(xv0 xv0Var, Context context, int i10, l60 l60Var) {
        super(context, i10, l60Var, null);
        this.F = xv0Var;
    }

    @Override
    public final boolean d() {
        s4.c1 T;
        zv0 zv0Var = this.F.d;
        ec1 ec1Var = zv0Var.f43531c;
        View F = ec1Var.F(this);
        if (F == null) {
            T = null;
        } else {
            T = ec1Var.T(F);
        }
        if (T != null) {
            int b10 = T.b();
            int i10 = zv0Var.f43560y;
            if (i10 == zv0Var.f43544n && b10 == (zv0Var.f43545n0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f(org.telegram.ui.Cells.c6 c6Var) {
        s4.c1 T;
        int b10;
        zv0 zv0Var = this.F.d;
        ec1 ec1Var = zv0Var.f43531c;
        View F = ec1Var.F(c6Var);
        if (F == null) {
            T = null;
        } else {
            T = ec1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            return zv0Var.f43556w[b10 - zv0Var.f43545n0];
        }
        return false;
    }

    @Override
    public final void g(org.telegram.ui.Cells.b6 b6Var, ActionMode actionMode) {
        if (b6Var.isFocused() && b6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                co.k8(menu, this.F.d.f43536f.h, false, true, true, true);
            }
        }
    }

    @Override
    public final void h(org.telegram.ui.Cells.c6 c6Var, boolean z10) {
        s4.c1 T;
        int b10;
        zv0 zv0Var = this.F.d;
        if (z10 && zv0Var.L) {
            Arrays.fill(zv0Var.f43556w, false);
            zv0Var.f43531c.getChildCount();
            for (int i10 = zv0Var.f43545n0; i10 < zv0Var.f43545n0 + zv0Var.f43560y; i10++) {
                s4.c1 K = zv0Var.f43531c.K(i10);
                if (K != null) {
                    View view = K.f45738a;
                    if (view instanceof org.telegram.ui.Cells.c6) {
                        ((org.telegram.ui.Cells.c6) view).f21688r.a(false, true);
                    }
                }
            }
        }
        super.h(c6Var, z10);
        ec1 ec1Var = zv0Var.f43531c;
        View F = ec1Var.F(c6Var);
        if (F == null) {
            T = null;
        } else {
            T = ec1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            zv0Var.f43556w[b10 - zv0Var.f43545n0] = z10;
        }
        zv0Var.i0();
    }

    @Override
    public final void i(boolean z10) {
        zv0.d0(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        zv0.e0(this.F.d, c6Var);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        zv0 zv0Var = this.F.d;
        if (!arrayList.isEmpty()) {
            zv0Var.f43531c.getClass();
            int R = RecyclerView.R(this) - zv0Var.f43545n0;
            if (R >= 0) {
                org.telegram.ui.Cells.b6 b6Var = this.d;
                b6Var.getText().replace(b6Var.getSelectionStart(), b6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < zv0Var.f43544n) {
                    for (int length = zv0Var.v.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = zv0Var.v;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    zv0Var.v[i10] = (CharSequence) arrayList.remove(0);
                    zv0Var.f43560y++;
                    i10++;
                }
                zv0Var.r0();
                zv0Var.f43538g0 = (zv0Var.f43545n0 + i10) - 1;
                zv0Var.f43529b.l();
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

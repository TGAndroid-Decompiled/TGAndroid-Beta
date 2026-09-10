package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
public final class yv0 extends org.telegram.ui.Cells.e6 {
    public final zv0 F;

    public yv0(zv0 zv0Var, Context context, int i10, l60 l60Var) {
        super(context, i10, l60Var, null);
        this.F = zv0Var;
    }

    @Override
    public final boolean e() {
        s4.c1 T;
        bw0 bw0Var = this.F.d;
        ic1 ic1Var = bw0Var.f31428c;
        View F = ic1Var.F(this);
        if (F == null) {
            T = null;
        } else {
            T = ic1Var.T(F);
        }
        if (T != null) {
            int b10 = T.b();
            int i10 = bw0Var.f31456y;
            if (i10 == bw0Var.f31440n && b10 == (bw0Var.f31441n0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f(org.telegram.ui.Cells.e6 e6Var) {
        s4.c1 T;
        int b10;
        bw0 bw0Var = this.F.d;
        ic1 ic1Var = bw0Var.f31428c;
        View F = ic1Var.F(e6Var);
        if (F == null) {
            T = null;
        } else {
            T = ic1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            return bw0Var.f31452w[b10 - bw0Var.f31441n0];
        }
        return false;
    }

    @Override
    public final void g(org.telegram.ui.Cells.d6 d6Var, ActionMode actionMode) {
        if (d6Var.isFocused() && d6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                eo.k8(menu, this.F.d.f31432f.h, false, true, true, true);
            }
        }
    }

    @Override
    public final void h(org.telegram.ui.Cells.e6 e6Var, boolean z10) {
        s4.c1 T;
        int b10;
        bw0 bw0Var = this.F.d;
        if (z10 && bw0Var.L) {
            Arrays.fill(bw0Var.f31452w, false);
            bw0Var.f31428c.getChildCount();
            for (int i10 = bw0Var.f31441n0; i10 < bw0Var.f31441n0 + bw0Var.f31456y; i10++) {
                s4.c1 K = bw0Var.f31428c.K(i10);
                if (K != null) {
                    View view = K.f41610a;
                    if (view instanceof org.telegram.ui.Cells.e6) {
                        ((org.telegram.ui.Cells.e6) view).f19078r.a(false, true);
                    }
                }
            }
        }
        super.h(e6Var, z10);
        ic1 ic1Var = bw0Var.f31428c;
        View F = ic1Var.F(e6Var);
        if (F == null) {
            T = null;
        } else {
            T = ic1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            bw0Var.f31452w[b10 - bw0Var.f31441n0] = z10;
        }
        bw0Var.i0();
    }

    @Override
    public final void i(boolean z10) {
        bw0.d0(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.e6 e6Var) {
        bw0.e0(this.F.d, e6Var);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        bw0 bw0Var = this.F.d;
        if (!arrayList.isEmpty()) {
            bw0Var.f31428c.getClass();
            int R = RecyclerView.R(this) - bw0Var.f31441n0;
            if (R >= 0) {
                org.telegram.ui.Cells.d6 d6Var = this.d;
                d6Var.getText().replace(d6Var.getSelectionStart(), d6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < bw0Var.f31440n) {
                    for (int length = bw0Var.v.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = bw0Var.v;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    bw0Var.v[i10] = (CharSequence) arrayList.remove(0);
                    bw0Var.f31456y++;
                    i10++;
                }
                bw0Var.r0();
                bw0Var.f31434g0 = (bw0Var.f31441n0 + i10) - 1;
                bw0Var.f31426b.l();
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

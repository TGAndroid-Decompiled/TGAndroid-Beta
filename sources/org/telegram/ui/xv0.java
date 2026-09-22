package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
public final class xv0 extends org.telegram.ui.Cells.e6 {
    public final yv0 F;

    public xv0(yv0 yv0Var, Context context, int i10, k60 k60Var) {
        super(context, i10, k60Var, null);
        this.F = yv0Var;
    }

    @Override
    public final boolean e() {
        s4.c1 U;
        aw0 aw0Var = this.F.d;
        fc1 fc1Var = aw0Var.f32200c;
        View G = fc1Var.G(this);
        if (G == null) {
            U = null;
        } else {
            U = fc1Var.U(G);
        }
        if (U != null) {
            int b10 = U.b();
            int i10 = aw0Var.f32228y;
            if (i10 == aw0Var.f32212n && b10 == (aw0Var.f32213n0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f(org.telegram.ui.Cells.e6 e6Var) {
        s4.c1 U;
        int b10;
        aw0 aw0Var = this.F.d;
        fc1 fc1Var = aw0Var.f32200c;
        View G = fc1Var.G(e6Var);
        if (G == null) {
            U = null;
        } else {
            U = fc1Var.U(G);
        }
        if (U != null && (b10 = U.b()) != -1) {
            return aw0Var.f32224w[b10 - aw0Var.f32213n0];
        }
        return false;
    }

    @Override
    public final void g(org.telegram.ui.Cells.d6 d6Var, ActionMode actionMode) {
        if (d6Var.isFocused() && d6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                zn.k8(menu, this.F.d.f32204f.h, false, true, true, true);
            }
        }
    }

    @Override
    public final void h(org.telegram.ui.Cells.e6 e6Var, boolean z10) {
        s4.c1 U;
        int b10;
        aw0 aw0Var = this.F.d;
        if (z10 && aw0Var.L) {
            Arrays.fill(aw0Var.f32224w, false);
            aw0Var.f32200c.getChildCount();
            for (int i10 = aw0Var.f32213n0; i10 < aw0Var.f32213n0 + aw0Var.f32228y; i10++) {
                s4.c1 L = aw0Var.f32200c.L(i10);
                if (L != null) {
                    View view = L.f42995a;
                    if (view instanceof org.telegram.ui.Cells.e6) {
                        ((org.telegram.ui.Cells.e6) view).f20202r.a(false, true);
                    }
                }
            }
        }
        super.h(e6Var, z10);
        fc1 fc1Var = aw0Var.f32200c;
        View G = fc1Var.G(e6Var);
        if (G == null) {
            U = null;
        } else {
            U = fc1Var.U(G);
        }
        if (U != null && (b10 = U.b()) != -1) {
            aw0Var.f32224w[b10 - aw0Var.f32213n0] = z10;
        }
        aw0Var.i0();
    }

    @Override
    public final void i(boolean z10) {
        aw0.d0(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.e6 e6Var) {
        aw0.e0(this.F.d, e6Var);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        aw0 aw0Var = this.F.d;
        if (!arrayList.isEmpty()) {
            aw0Var.f32200c.getClass();
            int S = RecyclerView.S(this) - aw0Var.f32213n0;
            if (S >= 0) {
                org.telegram.ui.Cells.d6 d6Var = this.d;
                d6Var.getText().replace(d6Var.getSelectionStart(), d6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = S + 1;
                while (!arrayList.isEmpty() && i10 < aw0Var.f32212n) {
                    for (int length = aw0Var.v.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = aw0Var.v;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    aw0Var.v[i10] = (CharSequence) arrayList.remove(0);
                    aw0Var.f32228y++;
                    i10++;
                }
                aw0Var.r0();
                aw0Var.f32206g0 = (aw0Var.f32213n0 + i10) - 1;
                aw0Var.f32198b.l();
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

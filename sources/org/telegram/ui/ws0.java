package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
public final class ws0 extends org.telegram.ui.Cells.e6 {
    public final xs0 F;

    public ws0(xs0 xs0Var, Context context, int i10, e50 e50Var) {
        super(context, i10, e50Var, null);
        this.F = xs0Var;
    }

    @Override
    public final boolean e() {
        s4.c1 T;
        zs0 zs0Var = this.F.d;
        u71 u71Var = zs0Var.f44056c;
        View F = u71Var.F(this);
        if (F == null) {
            T = null;
        } else {
            T = u71Var.T(F);
        }
        if (T != null) {
            int b10 = T.b();
            int i10 = zs0Var.D;
            if (i10 == zs0Var.f44068n && b10 == (zs0Var.f44069n0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f(org.telegram.ui.Cells.e6 e6Var) {
        s4.c1 T;
        int b10;
        zs0 zs0Var = this.F.d;
        u71 u71Var = zs0Var.f44056c;
        View F = u71Var.F(e6Var);
        if (F == null) {
            T = null;
        } else {
            T = u71Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            return zs0Var.f44082x[b10 - zs0Var.f44069n0];
        }
        return false;
    }

    @Override
    public final void g(ih.b bVar, ActionMode actionMode) {
        if (bVar.isFocused() && bVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                un.x8(menu, this.F.d.f44060f.h, false, true, true, true);
            }
        }
    }

    @Override
    public final void h(org.telegram.ui.Cells.e6 e6Var, boolean z10) {
        s4.c1 T;
        int b10;
        zs0 zs0Var = this.F.d;
        zs0Var.f44056c.getChildCount();
        if (z10 && zs0Var.L) {
            Arrays.fill(zs0Var.f44082x, false);
            for (int i10 = zs0Var.f44069n0; i10 < zs0Var.f44069n0 + zs0Var.D; i10++) {
                s4.c1 K = zs0Var.f44056c.K(i10);
                if (K != null) {
                    View view = K.f47909a;
                    if (view instanceof org.telegram.ui.Cells.e6) {
                        ((org.telegram.ui.Cells.e6) view).f21864r.a(false, true);
                    }
                }
            }
        }
        super.h(e6Var, z10);
        u71 u71Var = zs0Var.f44056c;
        View F = u71Var.F(e6Var);
        if (F == null) {
            T = null;
        } else {
            T = u71Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            zs0Var.f44082x[b10 - zs0Var.f44069n0] = z10;
        }
        zs0Var.n0();
    }

    @Override
    public final void i(boolean z10) {
        zs0.i0(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.e6 e6Var) {
        zs0.j0(this.F.d, e6Var);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        zs0 zs0Var = this.F.d;
        if (!arrayList.isEmpty()) {
            zs0Var.f44056c.getClass();
            int R = RecyclerView.R(this) - zs0Var.f44069n0;
            if (R >= 0) {
                ih.b bVar = this.d;
                bVar.getText().replace(bVar.getSelectionStart(), bVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < zs0Var.f44068n) {
                    for (int length = zs0Var.f44080w.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = zs0Var.f44080w;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    zs0Var.f44080w[i10] = (CharSequence) arrayList.remove(0);
                    zs0Var.D++;
                    i10++;
                }
                zs0Var.w0();
                zs0Var.f44062g0 = (zs0Var.f44069n0 + i10) - 1;
                zs0Var.f44054b.f();
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

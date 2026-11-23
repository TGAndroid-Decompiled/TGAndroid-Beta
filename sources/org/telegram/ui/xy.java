package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class xy extends rg.b {
    public final yy d;

    public xy(yy yyVar) {
        this.d = yyVar;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59249f;
        if (i7 != 8 && i7 != 7) {
            return false;
        }
        return true;
    }

    public final v4.i0 F() {
        return this.d.f39246o1.getAdapter();
    }

    @Override
    public final int b() {
        return this.d.f54448a2.size();
    }

    @Override
    public final int d(int i7) {
        return ((bz) this.d.f54448a2.get(i7)).f56712a;
    }

    @Override
    public final void f() {
        F().f();
    }

    @Override
    public final void g(int i7) {
        F().g(i7 + 1);
    }

    @Override
    public final void j(int i7, int i10) {
        F().j(i7 + 1, i10);
    }

    @Override
    public final void k(int i7, int i10) {
        F().k(i7 + 1, i10);
    }

    @Override
    public final void n(int i7, int i10, Object obj) {
        F().n(i7 + 1, i10, obj);
    }

    @Override
    public final void o(int i7, int i10) {
        F().o(i7 + 1, i10);
    }

    @Override
    public final void p(int i7, int i10) {
        F().p(i7 + 1, i10);
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        int i10;
        int i11 = f1Var.f59249f;
        View view = f1Var.f59245a;
        ArrayList arrayList = this.d.f54448a2;
        bz bzVar = (bz) arrayList.get(i7);
        int i12 = i7 + 1;
        if (i12 < arrayList.size() && (i10 = ((bz) arrayList.get(i12)).f56712a) != 3 && i10 != 6) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i11 == 7) {
            ((dz) view).e(bzVar.f46673m, z10);
        } else if (i11 != 6 && i11 != 3) {
            if (i11 != 0 && i11 == 8) {
                uy uyVar = (uy) view;
                uyVar.f52756a.setText(org.telegram.messenger.gd.N0(2131751702, null));
                if (uyVar.f52758c != z10) {
                    uyVar.f52758c = z10;
                    uyVar.setWillNotDraw(!z10);
                }
            }
        } else {
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            if (i11 == 6) {
                z8Var.setFixedSize(0);
                z8Var.setText(bzVar.d);
                return;
            }
            z8Var.setFixedSize(12);
            z8Var.setText("");
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View z8Var;
        yy yyVar = this.d;
        if (i7 == 8) {
            z8Var = new uy(yyVar.getContext());
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29524h5, z8Var, null);
        } else if (i7 == 7) {
            z8Var = new wy(this, yyVar.getContext(), yyVar.f30223a, yyVar.U1.f26773a);
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29524h5, z8Var, null);
        } else if (i7 != 6 && i7 != 3) {
            z8Var = new k0(yyVar, yyVar.getContext());
        } else {
            z8Var = new org.telegram.ui.Cells.z8(yyVar.getContext());
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394a7, z8Var, null);
        }
        return new v4.f1(z8Var);
    }
}

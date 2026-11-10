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
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f57056f;
        if (i7 != 8 && i7 != 7) {
            return false;
        }
        return true;
    }

    public final v4.g0 F() {
        return this.d.n1.getAdapter();
    }

    @Override
    public final int b() {
        return this.d.Z1.size();
    }

    @Override
    public final int d(int i7) {
        return ((bz) this.d.Z1.get(i7)).f54543a;
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
    public final void t(v4.d1 d1Var, int i7) {
        boolean z9;
        int i10;
        int i11 = d1Var.f57056f;
        View view = d1Var.f57052a;
        ArrayList arrayList = this.d.Z1;
        bz bzVar = (bz) arrayList.get(i7);
        int i12 = i7 + 1;
        if (i12 < arrayList.size() && (i10 = ((bz) arrayList.get(i12)).f54543a) != 3 && i10 != 6) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (i11 == 7) {
            ((dz) view).e(bzVar.f44183m, z9);
        } else if (i11 != 6 && i11 != 3) {
            if (i11 != 0 && i11 == 8) {
                uy uyVar = (uy) view;
                uyVar.f50583a.setText(org.telegram.messenger.id.M0(2131751714, null));
                if (uyVar.f50585c != z9) {
                    uyVar.f50585c = z9;
                    uyVar.setWillNotDraw(!z9);
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
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View z8Var;
        yy yyVar = this.d;
        if (i7 == 8) {
            z8Var = new uy(yyVar.getContext());
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27963h5, z8Var, null);
        } else if (i7 == 7) {
            z8Var = new wy(this, yyVar.getContext(), yyVar.f28669a, yyVar.T1.f26074a);
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27963h5, z8Var, null);
        } else if (i7 != 6 && i7 != 3) {
            z8Var = new k0(yyVar, yyVar.getContext());
        } else {
            z8Var = new org.telegram.ui.Cells.z8(yyVar.getContext());
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27834a7, z8Var, null);
        }
        return new v4.d1(z8Var);
    }
}

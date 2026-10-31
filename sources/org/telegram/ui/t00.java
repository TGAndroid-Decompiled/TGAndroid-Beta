package org.telegram.ui;

import android.view.ViewGroup;
public final class t00 extends org.telegram.ui.Components.sk0 {
    public final z00 f41679c;

    public t00(z00 z00Var) {
        this.f41679c = z00Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int b() {
        z00 z00Var = this.f41679c;
        if (z00Var.f43947f.isEmpty()) {
            return 0;
        }
        return z00Var.f43947f.size() + (!z00Var.N ? 1 : 0);
    }

    @Override
    public final int d(int i10) {
        if (i10 >= this.f41679c.f43947f.size()) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        boolean z10;
        boolean z11;
        if (c1Var.f47901f == 0) {
            org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) c1Var.f47898a;
            z00 z00Var = this.f41679c;
            org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) z00Var.f43947f.get(i10);
            v2Var.O = z00Var.f43958p0;
            v2Var.d0(org.telegram.messenger.jj.B0(jjVar.f16337k), jjVar, jjVar.f16337k.date, false, false);
            if (i10 != b() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            v2Var.f23265s2 = z10;
            if (v2Var.getMessage() != null && v2Var.getMessage().f1() == jjVar.f1()) {
                z11 = true;
            } else {
                z11 = false;
            }
            v2Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.vj(this, v2Var, jjVar, z11, 1));
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Components.kt0 kt0Var;
        if (i10 != 0) {
            if (i10 != 3) {
                org.telegram.ui.Cells.z3 z3Var = new org.telegram.ui.Cells.z3(viewGroup.getContext(), null);
                z3Var.setText(org.telegram.messenger.cd.L0(2131745773, null));
                kt0Var = z3Var;
            } else {
                org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(viewGroup.getContext(), null);
                zzVar.setIsSingleCell(true);
                zzVar.setViewType(1);
                kt0Var = zzVar;
            }
        } else {
            kt0Var = new org.telegram.ui.Components.kt0(1, viewGroup.getContext(), true);
        }
        return sc.e.o(kt0Var, kt0Var, -1, -2);
    }
}

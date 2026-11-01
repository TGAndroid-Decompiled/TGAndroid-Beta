package org.telegram.ui;

import android.view.ViewGroup;
public final class s00 extends org.telegram.ui.Components.tk0 {
    public final y00 f41182c;

    public s00(y00 y00Var) {
        this.f41182c = y00Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int b() {
        y00 y00Var = this.f41182c;
        if (y00Var.f43504f.isEmpty()) {
            return 0;
        }
        return y00Var.f43504f.size() + (!y00Var.N ? 1 : 0);
    }

    @Override
    public final int d(int i10) {
        if (i10 >= this.f41182c.f43504f.size()) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        boolean z10;
        boolean z11;
        if (c1Var.f47912f == 0) {
            org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) c1Var.f47909a;
            y00 y00Var = this.f41182c;
            org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) y00Var.f43504f.get(i10);
            v2Var.O = y00Var.f43515p0;
            v2Var.d0(org.telegram.messenger.kj.B0(kjVar.f16690k), kjVar, kjVar.f16690k.date, false, false);
            if (i10 != b() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            v2Var.f23266s2 = z10;
            if (v2Var.getMessage() != null && v2Var.getMessage().f1() == kjVar.f1()) {
                z11 = true;
            } else {
                z11 = false;
            }
            v2Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.vj(this, v2Var, kjVar, z11, 1));
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Components.lt0 lt0Var;
        if (i10 != 0) {
            if (i10 != 3) {
                org.telegram.ui.Cells.z3 z3Var = new org.telegram.ui.Cells.z3(viewGroup.getContext(), null);
                z3Var.setText(org.telegram.messenger.dd.L0(2131745773, null));
                lt0Var = z3Var;
            } else {
                org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(viewGroup.getContext(), null);
                zzVar.setIsSingleCell(true);
                zzVar.setViewType(1);
                lt0Var = zzVar;
            }
        } else {
            lt0Var = new org.telegram.ui.Components.lt0(1, viewGroup.getContext(), true);
        }
        return sc.e.o(lt0Var, lt0Var, -1, -2);
    }
}

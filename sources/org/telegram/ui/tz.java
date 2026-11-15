package org.telegram.ui;

import android.view.ViewGroup;
public final class tz extends org.telegram.ui.Components.tj0 {
    public final zz f51701c;

    public tz(zz zzVar) {
        this.f51701c = zzVar;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        return true;
    }

    @Override
    public final int b() {
        zz zzVar = this.f51701c;
        if (zzVar.f54082f.isEmpty()) {
            return 0;
        }
        return zzVar.f54082f.size() + (!zzVar.O ? 1 : 0);
    }

    @Override
    public final int d(int i7) {
        if (i7 >= this.f51701c.f54082f.size()) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        boolean z10;
        boolean z11;
        if (e1Var.f58539f == 0) {
            org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) e1Var.f58535a;
            zz zzVar = this.f51701c;
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) zzVar.f54082f.get(i7);
            t2Var.P = zzVar.f54094q0;
            t2Var.f0(org.telegram.messenger.gj.B0(gjVar.f23819k), gjVar, gjVar.f23819k.date, false, false);
            if (i7 != b() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            t2Var.f31637t2 = z10;
            if (t2Var.getMessage() != null && t2Var.getMessage().e1() == gjVar.e1()) {
                z11 = true;
            } else {
                z11 = false;
            }
            t2Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.bk(this, t2Var, gjVar, z11, 1));
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        jg.a0 a0Var;
        if (i7 != 0) {
            if (i7 != 3) {
                org.telegram.ui.Cells.x3 x3Var = new org.telegram.ui.Cells.x3(viewGroup.getContext(), null);
                x3Var.setText(org.telegram.messenger.hd.M0(2131745756, null));
                a0Var = x3Var;
            } else {
                org.telegram.ui.Components.pz pzVar = new org.telegram.ui.Components.pz(viewGroup.getContext(), null);
                pzVar.setIsSingleCell(true);
                pzVar.setViewType(1);
                a0Var = pzVar;
            }
        } else {
            a0Var = new jg.a0(2, viewGroup.getContext(), true);
        }
        return i5.c.q(a0Var, a0Var, -1, -2);
    }
}

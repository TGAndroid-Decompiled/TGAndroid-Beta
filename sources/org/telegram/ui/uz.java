package org.telegram.ui;

import android.view.ViewGroup;
public final class uz extends org.telegram.ui.Components.pj0 {
    public final a00 f50499c;

    public uz(a00 a00Var) {
        this.f50499c = a00Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    @Override
    public final int b() {
        a00 a00Var = this.f50499c;
        if (a00Var.f43519f.isEmpty()) {
            return 0;
        }
        return a00Var.f43519f.size() + (!a00Var.N ? 1 : 0);
    }

    @Override
    public final int d(int i7) {
        if (i7 >= this.f50499c.f43519f.size()) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        boolean z9;
        boolean z10;
        if (d1Var.f57060f == 0) {
            org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) d1Var.f57056a;
            a00 a00Var = this.f50499c;
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) a00Var.f43519f.get(i7);
            t2Var.O = a00Var.f43530p0;
            t2Var.d0(org.telegram.messenger.ij.B0(ijVar.f23262k), ijVar, ijVar.f23262k.date, false, false);
            if (i7 != b() - 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            t2Var.f30484s2 = z9;
            if (t2Var.getMessage() != null && t2Var.getMessage().e1() == ijVar.e1()) {
                z10 = true;
            } else {
                z10 = false;
            }
            t2Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.tj(this, t2Var, ijVar, z10, 1));
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        jg.a0 a0Var;
        if (i7 != 0) {
            if (i7 != 3) {
                org.telegram.ui.Cells.x3 x3Var = new org.telegram.ui.Cells.x3(viewGroup.getContext(), null);
                x3Var.setText(org.telegram.messenger.id.M0(2131745756, null));
                a0Var = x3Var;
            } else {
                org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(viewGroup.getContext(), null);
                mzVar.setIsSingleCell(true);
                mzVar.setViewType(1);
                a0Var = mzVar;
            }
        } else {
            a0Var = new jg.a0(2, viewGroup.getContext(), true);
        }
        return jg.g.r(a0Var, a0Var, -1, -2);
    }
}

package org.telegram.ui;

import android.view.ViewGroup;
public final class vz extends org.telegram.ui.Components.oj0 {
    public final b00 f50828c;

    public vz(b00 b00Var) {
        this.f50828c = b00Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    @Override
    public final int b() {
        b00 b00Var = this.f50828c;
        if (b00Var.f43869f.isEmpty()) {
            return 0;
        }
        return b00Var.f43869f.size() + (!b00Var.N ? 1 : 0);
    }

    @Override
    public final int d(int i7) {
        if (i7 >= this.f50828c.f43869f.size()) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        boolean z9;
        boolean z10;
        if (d1Var.f57056f == 0) {
            org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) d1Var.f57052a;
            b00 b00Var = this.f50828c;
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) b00Var.f43869f.get(i7);
            t2Var.O = b00Var.f43880p0;
            t2Var.d0(org.telegram.messenger.ij.B0(ijVar.f23266k), ijVar, ijVar.f23266k.date, false, false);
            if (i7 != b() - 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            t2Var.f30495s2 = z9;
            if (t2Var.getMessage() != null && t2Var.getMessage().e1() == ijVar.e1()) {
                z10 = true;
            } else {
                z10 = false;
            }
            t2Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.sj(this, t2Var, ijVar, z10, 1));
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
                org.telegram.ui.Components.lz lzVar = new org.telegram.ui.Components.lz(viewGroup.getContext(), null);
                lzVar.setIsSingleCell(true);
                lzVar.setViewType(1);
                a0Var = lzVar;
            }
        } else {
            a0Var = new jg.a0(2, viewGroup.getContext(), true);
        }
        return jg.g.r(a0Var, a0Var, -1, -2);
    }
}

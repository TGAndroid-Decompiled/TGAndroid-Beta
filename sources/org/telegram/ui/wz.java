package org.telegram.ui;

import android.view.ViewGroup;
public final class wz extends org.telegram.ui.Components.bk0 {
    public final c00 f53560c;

    public wz(c00 c00Var) {
        this.f53560c = c00Var;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    @Override
    public final int b() {
        c00 c00Var = this.f53560c;
        if (c00Var.f46338f.isEmpty()) {
            return 0;
        }
        return c00Var.f46338f.size() + (!c00Var.O ? 1 : 0);
    }

    @Override
    public final int d(int i7) {
        if (i7 >= this.f53560c.f46338f.size()) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        boolean z11;
        if (f1Var.f59126f == 0) {
            org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) f1Var.f59122a;
            c00 c00Var = this.f53560c;
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) c00Var.f46338f.get(i7);
            t2Var.P = c00Var.f46350q0;
            t2Var.d0(org.telegram.messenger.fj.B0(fjVar.f23968k), fjVar, fjVar.f23968k.date, false, false);
            if (i7 != b() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            t2Var.f31939t2 = z10;
            if (t2Var.getMessage() != null && t2Var.getMessage().e1() == fjVar.e1()) {
                z11 = true;
            } else {
                z11 = false;
            }
            t2Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.ik(this, t2Var, fjVar, z11, 1));
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        jg.a0 a0Var;
        if (i7 != 0) {
            if (i7 != 3) {
                org.telegram.ui.Cells.x3 x3Var = new org.telegram.ui.Cells.x3(viewGroup.getContext(), null);
                x3Var.setText(org.telegram.messenger.gd.M0(2131745561, null));
                a0Var = x3Var;
            } else {
                org.telegram.ui.Components.wz wzVar = new org.telegram.ui.Components.wz(viewGroup.getContext(), null);
                wzVar.setIsSingleCell(true);
                wzVar.setViewType(1);
                a0Var = wzVar;
            }
        } else {
            a0Var = new jg.a0(2, viewGroup.getContext(), true);
        }
        return i5.c.q(a0Var, a0Var, -1, -2);
    }
}

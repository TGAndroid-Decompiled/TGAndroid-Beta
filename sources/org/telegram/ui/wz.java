package org.telegram.ui;

import android.view.ViewGroup;
public final class wz extends org.telegram.ui.Components.dk0 {
    public final c00 f53557c;

    public wz(c00 c00Var) {
        this.f53557c = c00Var;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    @Override
    public final int b() {
        c00 c00Var = this.f53557c;
        if (c00Var.f46352f.isEmpty()) {
            return 0;
        }
        return c00Var.f46352f.size() + (!c00Var.O ? 1 : 0);
    }

    @Override
    public final int d(int i7) {
        if (i7 >= this.f53557c.f46352f.size()) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        boolean z11;
        if (f1Var.f59165f == 0) {
            org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) f1Var.f59161a;
            c00 c00Var = this.f53557c;
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) c00Var.f46352f.get(i7);
            u2Var.P = c00Var.f46364q0;
            u2Var.d0(org.telegram.messenger.fj.B0(fjVar.f23993k), fjVar, fjVar.f23993k.date, false, false);
            if (i7 != b() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            u2Var.f32015t2 = z10;
            if (u2Var.getMessage() != null && u2Var.getMessage().e1() == fjVar.e1()) {
                z11 = true;
            } else {
                z11 = false;
            }
            u2Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.kk(this, u2Var, fjVar, z11, 1));
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        jg.a0 a0Var;
        if (i7 != 0) {
            if (i7 != 3) {
                org.telegram.ui.Cells.y3 y3Var = new org.telegram.ui.Cells.y3(viewGroup.getContext(), null);
                y3Var.setText(org.telegram.messenger.gd.N0(2131745560, null));
                a0Var = y3Var;
            } else {
                org.telegram.ui.Components.yz yzVar = new org.telegram.ui.Components.yz(viewGroup.getContext(), null);
                yzVar.setIsSingleCell(true);
                yzVar.setViewType(1);
                a0Var = yzVar;
            }
        } else {
            a0Var = new jg.a0(2, viewGroup.getContext(), true);
        }
        return i5.c.q(a0Var, a0Var, -1, -2);
    }
}

package org.telegram.ui;

import android.view.ViewGroup;
public final class wz extends org.telegram.ui.Components.dk0 {
    public final c00 f53561c;

    public wz(c00 c00Var) {
        this.f53561c = c00Var;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    @Override
    public final int b() {
        c00 c00Var = this.f53561c;
        if (c00Var.f46355f.isEmpty()) {
            return 0;
        }
        return c00Var.f46355f.size() + (!c00Var.O ? 1 : 0);
    }

    @Override
    public final int d(int i7) {
        if (i7 >= this.f53561c.f46355f.size()) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        boolean z11;
        if (f1Var.f59169f == 0) {
            org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) f1Var.f59165a;
            c00 c00Var = this.f53561c;
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) c00Var.f46355f.get(i7);
            u2Var.P = c00Var.f46367q0;
            u2Var.d0(org.telegram.messenger.gj.B0(gjVar.f24213k), gjVar, gjVar.f24213k.date, false, false);
            if (i7 != b() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            u2Var.f32018t2 = z10;
            if (u2Var.getMessage() != null && u2Var.getMessage().e1() == gjVar.e1()) {
                z11 = true;
            } else {
                z11 = false;
            }
            u2Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.kk(this, u2Var, gjVar, z11, 1));
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        jg.a0 a0Var;
        if (i7 != 0) {
            if (i7 != 3) {
                org.telegram.ui.Cells.y3 y3Var = new org.telegram.ui.Cells.y3(viewGroup.getContext(), null);
                y3Var.setText(org.telegram.messenger.hd.N0(2131745560, null));
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

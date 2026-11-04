package org.telegram.ui;

import android.view.ViewGroup;
public final class qz extends org.telegram.ui.Components.sj0 {
    public final wz f48972c;

    public qz(wz wzVar) {
        this.f48972c = wzVar;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        return true;
    }

    @Override
    public final int b() {
        wz wzVar = this.f48972c;
        if (wzVar.f51645f.isEmpty()) {
            return 0;
        }
        return wzVar.f51645f.size() + (!wzVar.O ? 1 : 0);
    }

    @Override
    public final int d(int i3) {
        if (i3 >= this.f48972c.f51645f.size()) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        boolean z10;
        boolean z11;
        if (d1Var.f55544f == 0) {
            org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) d1Var.f55540a;
            wz wzVar = this.f48972c;
            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) wzVar.f51645f.get(i3);
            t2Var.P = wzVar.f51657q0;
            t2Var.d0(org.telegram.messenger.zi.B0(ziVar.f26868k), ziVar, ziVar.f26868k.date, false, false);
            if (i3 != b() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            t2Var.f30561t2 = z10;
            if (t2Var.getMessage() != null && t2Var.getMessage().f1() == ziVar.f1()) {
                z11 = true;
            } else {
                z11 = false;
            }
            t2Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.sj(this, t2Var, ziVar, z11, 1));
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        kg.x xVar;
        if (i3 != 0) {
            if (i3 != 3) {
                org.telegram.ui.Cells.x3 x3Var = new org.telegram.ui.Cells.x3(viewGroup.getContext(), null);
                x3Var.setText(org.telegram.messenger.bd.M0(2131745766, null));
                xVar = x3Var;
            } else {
                org.telegram.ui.Components.iz izVar = new org.telegram.ui.Components.iz(viewGroup.getContext(), null);
                izVar.setIsSingleCell(true);
                izVar.setViewType(1);
                xVar = izVar;
            }
        } else {
            xVar = new kg.x(2, viewGroup.getContext(), true);
        }
        return k2.p1.p(xVar, xVar, -1, -2);
    }
}

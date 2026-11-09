package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class wy extends rg.b {
    public final xy d;

    public wy(xy xyVar) {
        this.d = xyVar;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f57060f;
        if (i7 != 8 && i7 != 7) {
            return false;
        }
        return true;
    }

    public final v4.g0 F() {
        return this.d.f36303k1.getAdapter();
    }

    @Override
    public final int b() {
        return this.d.W1.size();
    }

    @Override
    public final int d(int i7) {
        return ((az) this.d.W1.get(i7)).f54544a;
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
        int i11 = d1Var.f57060f;
        View view = d1Var.f57056a;
        ArrayList arrayList = this.d.W1;
        az azVar = (az) arrayList.get(i7);
        int i12 = i7 + 1;
        if (i12 < arrayList.size() && (i10 = ((az) arrayList.get(i12)).f54544a) != 3 && i10 != 6) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (i11 == 7) {
            ((cz) view).e(azVar.f43836m, z9);
        } else if (i11 != 6 && i11 != 3) {
            if (i11 != 0 && i11 == 8) {
                ty tyVar = (ty) view;
                tyVar.f50255a.setText(org.telegram.messenger.id.M0(2131751714, null));
                if (tyVar.f50257c != z9) {
                    tyVar.f50257c = z9;
                    tyVar.setWillNotDraw(!z9);
                }
            }
        } else {
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            if (i11 == 6) {
                z8Var.setFixedSize(0);
                z8Var.setText(azVar.d);
                return;
            }
            z8Var.setFixedSize(12);
            z8Var.setText("");
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View z8Var;
        xy xyVar = this.d;
        if (i7 == 8) {
            z8Var = new ty(xyVar.getContext());
            org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27938h5, z8Var, null);
        } else if (i7 == 7) {
            z8Var = new vy(this, xyVar.getContext(), xyVar.f28621a, xyVar.Q1.f26070a);
            org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27938h5, z8Var, null);
        } else if (i7 != 6 && i7 != 3) {
            z8Var = new k0(xyVar, xyVar.getContext());
        } else {
            z8Var = new org.telegram.ui.Cells.z8(xyVar.getContext());
            org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27809a7, z8Var, null);
        }
        return new v4.d1(z8Var);
    }
}

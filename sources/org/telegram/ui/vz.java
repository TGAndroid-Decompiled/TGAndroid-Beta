package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class vz extends hg.c {
    public final wz d;

    public vz(wz wzVar) {
        this.d = wzVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f47901f;
        if (i10 != 8 && i10 != 7) {
            return false;
        }
        return true;
    }

    public final s4.g0 F() {
        return this.d.f26666k1.getAdapter();
    }

    @Override
    public final int b() {
        return this.d.W1.size();
    }

    @Override
    public final int d(int i10) {
        return ((a00) this.d.W1.get(i10)).f7680a;
    }

    @Override
    public final void f() {
        F().f();
    }

    @Override
    public final void g(int i10) {
        F().g(i10 + 1);
    }

    @Override
    public final void j(int i10, int i11) {
        F().j(i10 + 1, i11);
    }

    @Override
    public final void k(int i10, int i11) {
        F().k(i10 + 1, i11);
    }

    @Override
    public final void n(int i10, int i11, Object obj) {
        F().n(i10 + 1, i11, obj);
    }

    @Override
    public final void o(int i10, int i11) {
        F().o(i10 + 1, i11);
    }

    @Override
    public final void p(int i10, int i11) {
        F().p(i10 + 1, i11);
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        boolean z10;
        int i11;
        int i12 = c1Var.f47901f;
        View view = c1Var.f47898a;
        ArrayList arrayList = this.d.W1;
        a00 a00Var = (a00) arrayList.get(i10);
        int i13 = i10 + 1;
        if (i13 < arrayList.size() && (i11 = ((a00) arrayList.get(i13)).f7680a) != 3 && i11 != 6) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i12 == 7) {
            ((c00) view).e(a00Var.f35502m, z10);
        } else if (i12 != 6 && i12 != 3) {
            if (i12 != 0 && i12 == 8) {
                sz szVar = (sz) view;
                szVar.f41669a.setText(org.telegram.messenger.cd.L0(2131751715, null));
                if (szVar.f41671c != z10) {
                    szVar.f41671c = z10;
                    szVar.setWillNotDraw(!z10);
                }
            }
        } else {
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
            if (i12 == 6) {
                b9Var.setFixedSize(0);
                b9Var.setText(a00Var.d);
                return;
            }
            b9Var.setFixedSize(12);
            b9Var.setText("");
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View b9Var;
        wz wzVar = this.d;
        if (i10 == 8) {
            b9Var = new sz(wzVar.getContext());
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f21001h5, b9Var, null);
        } else if (i10 == 7) {
            b9Var = new uz(this, wzVar.getContext(), wzVar.f21583a, wzVar.Q1.f14645a);
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f21001h5, b9Var, null);
        } else if (i10 != 6 && i10 != 3) {
            b9Var = new l0(wzVar, wzVar.getContext());
        } else {
            b9Var = new org.telegram.ui.Cells.b9(wzVar.getContext());
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20872a7, b9Var, null);
        }
        return new s4.c1(b9Var);
    }
}

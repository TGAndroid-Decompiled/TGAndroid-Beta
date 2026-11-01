package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class uz extends hg.c {
    public final vz d;

    public uz(vz vzVar) {
        this.d = vzVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f47912f;
        if (i10 != 8 && i10 != 7) {
            return false;
        }
        return true;
    }

    public final s4.g0 F() {
        return this.d.f26724k1.getAdapter();
    }

    @Override
    public final int b() {
        return this.d.W1.size();
    }

    @Override
    public final int d(int i10) {
        return ((zz) this.d.W1.get(i10)).f7681a;
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
        int i12 = c1Var.f47912f;
        View view = c1Var.f47909a;
        ArrayList arrayList = this.d.W1;
        zz zzVar = (zz) arrayList.get(i10);
        int i13 = i10 + 1;
        if (i13 < arrayList.size() && (i11 = ((zz) arrayList.get(i13)).f7681a) != 3 && i11 != 6) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i12 == 7) {
            ((b00) view).e(zzVar.f44263m, z10);
        } else if (i12 != 6 && i12 != 3) {
            if (i12 != 0 && i12 == 8) {
                rz rzVar = (rz) view;
                rzVar.f41174a.setText(org.telegram.messenger.dd.L0(2131751715, null));
                if (rzVar.f41176c != z10) {
                    rzVar.f41176c = z10;
                    rzVar.setWillNotDraw(!z10);
                }
            }
        } else {
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
            if (i12 == 6) {
                b9Var.setFixedSize(0);
                b9Var.setText(zzVar.d);
                return;
            }
            b9Var.setFixedSize(12);
            b9Var.setText("");
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View b9Var;
        vz vzVar = this.d;
        if (i10 == 8) {
            b9Var = new rz(vzVar.getContext());
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f21002h5, b9Var, null);
        } else if (i10 == 7) {
            b9Var = new tz(this, vzVar.getContext(), vzVar.f21584a, vzVar.Q1.f15000a);
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f21002h5, b9Var, null);
        } else if (i10 != 6 && i10 != 3) {
            b9Var = new l0(vzVar, vzVar.getContext());
        } else {
            b9Var = new org.telegram.ui.Cells.b9(vzVar.getContext());
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20873a7, b9Var, null);
        }
        return new s4.c1(b9Var);
    }
}

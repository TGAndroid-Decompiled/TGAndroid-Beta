package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class yy extends rg.b {
    public final zy d;

    public yy(zy zyVar) {
        this.d = zyVar;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59126f;
        if (i7 != 8 && i7 != 7) {
            return false;
        }
        return true;
    }

    public final v4.i0 F() {
        return this.d.f39534o1.getAdapter();
    }

    @Override
    public final int b() {
        return this.d.f54613a2.size();
    }

    @Override
    public final int d(int i7) {
        return ((cz) this.d.f54613a2.get(i7)).f56589a;
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
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        int i10;
        int i11 = f1Var.f59126f;
        View view = f1Var.f59122a;
        ArrayList arrayList = this.d.f54613a2;
        cz czVar = (cz) arrayList.get(i7);
        int i12 = i7 + 1;
        if (i12 < arrayList.size() && (i10 = ((cz) arrayList.get(i12)).f56589a) != 3 && i10 != 6) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i11 == 7) {
            ((ez) view).e(czVar.f46801m, z10);
        } else if (i11 != 6 && i11 != 3) {
            if (i11 != 0 && i11 == 8) {
                vy vyVar = (vy) view;
                vyVar.f52881a.setText(org.telegram.messenger.gd.M0(2131751703, null));
                if (vyVar.f52883c != z10) {
                    vyVar.f52883c = z10;
                    vyVar.setWillNotDraw(!z10);
                }
            }
        } else {
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            if (i11 == 6) {
                z8Var.setFixedSize(0);
                z8Var.setText(czVar.d);
                return;
            }
            z8Var.setFixedSize(12);
            z8Var.setText("");
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View z8Var;
        zy zyVar = this.d;
        if (i7 == 8) {
            z8Var = new vy(zyVar.getContext());
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29469h5, z8Var, null);
        } else if (i7 == 7) {
            z8Var = new xy(this, zyVar.getContext(), zyVar.f30189a, zyVar.U1.f26674a);
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29469h5, z8Var, null);
        } else if (i7 != 6 && i7 != 3) {
            z8Var = new k0(zyVar, zyVar.getContext());
        } else {
            z8Var = new org.telegram.ui.Cells.z8(zyVar.getContext());
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29339a7, z8Var, null);
        }
        return new v4.f1(z8Var);
    }
}

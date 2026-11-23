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
        int i7 = f1Var.f59169f;
        if (i7 != 8 && i7 != 7) {
            return false;
        }
        return true;
    }

    public final v4.i0 F() {
        return this.d.f39531o1.getAdapter();
    }

    @Override
    public final int b() {
        return this.d.f54665a2.size();
    }

    @Override
    public final int d(int i7) {
        return ((cz) this.d.f54665a2.get(i7)).f56634a;
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
        int i11 = f1Var.f59169f;
        View view = f1Var.f59165a;
        ArrayList arrayList = this.d.f54665a2;
        cz czVar = (cz) arrayList.get(i7);
        int i12 = i7 + 1;
        if (i12 < arrayList.size() && (i10 = ((cz) arrayList.get(i12)).f56634a) != 3 && i10 != 6) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i11 == 7) {
            ((ez) view).e(czVar.f46840m, z10);
        } else if (i11 != 6 && i11 != 3) {
            if (i11 != 0 && i11 == 8) {
                vy vyVar = (vy) view;
                vyVar.f52916a.setText(org.telegram.messenger.hd.N0(2131751702, null));
                if (vyVar.f52918c != z10) {
                    vyVar.f52918c = z10;
                    vyVar.setWillNotDraw(!z10);
                }
            }
        } else {
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            if (i11 == 6) {
                a9Var.setFixedSize(0);
                a9Var.setText(czVar.d);
                return;
            }
            a9Var.setFixedSize(12);
            a9Var.setText("");
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View a9Var;
        zy zyVar = this.d;
        if (i7 == 8) {
            a9Var = new vy(zyVar.getContext());
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29454h5, a9Var, null);
        } else if (i7 == 7) {
            a9Var = new xy(this, zyVar.getContext(), zyVar.f30173a, zyVar.U1.f26886a);
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29454h5, a9Var, null);
        } else if (i7 != 6 && i7 != 3) {
            a9Var = new k0(zyVar, zyVar.getContext());
        } else {
            a9Var = new org.telegram.ui.Cells.a9(zyVar.getContext());
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29324a7, a9Var, null);
        }
        return new v4.f1(a9Var);
    }
}

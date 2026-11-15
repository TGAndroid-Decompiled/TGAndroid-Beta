package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class vy extends rg.b {
    public final wy d;

    public vy(wy wyVar) {
        this.d = wyVar;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f58539f;
        if (i7 != 8 && i7 != 7) {
            return false;
        }
        return true;
    }

    public final v4.h0 F() {
        return this.d.f35931o1.getAdapter();
    }

    @Override
    public final int b() {
        return this.d.f53027a2.size();
    }

    @Override
    public final int d(int i7) {
        return ((zy) this.d.f53027a2.get(i7)).f56015a;
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
    public final void t(v4.e1 e1Var, int i7) {
        boolean z10;
        int i10;
        int i11 = e1Var.f58539f;
        View view = e1Var.f58535a;
        ArrayList arrayList = this.d.f53027a2;
        zy zyVar = (zy) arrayList.get(i7);
        int i12 = i7 + 1;
        if (i12 < arrayList.size() && (i10 = ((zy) arrayList.get(i12)).f56015a) != 3 && i10 != 6) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i11 == 7) {
            ((bz) view).e(zyVar.f54068m, z10);
        } else if (i11 != 6 && i11 != 3) {
            if (i11 != 0 && i11 == 8) {
                sy syVar = (sy) view;
                syVar.f51300a.setText(org.telegram.messenger.hd.M0(2131751714, null));
                if (syVar.f51302c != z10) {
                    syVar.f51302c = z10;
                    syVar.setWillNotDraw(!z10);
                }
            }
        } else {
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            if (i11 == 6) {
                y8Var.setFixedSize(0);
                y8Var.setText(zyVar.d);
                return;
            }
            y8Var.setFixedSize(12);
            y8Var.setText("");
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View y8Var;
        wy wyVar = this.d;
        if (i7 == 8) {
            y8Var = new sy(wyVar.getContext());
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28922h5, y8Var, null);
        } else if (i7 == 7) {
            y8Var = new uy(this, wyVar.getContext(), wyVar.f29679a, wyVar.U1.f26552a);
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28922h5, y8Var, null);
        } else if (i7 != 6 && i7 != 3) {
            y8Var = new k0(wyVar, wyVar.getContext());
        } else {
            y8Var = new org.telegram.ui.Cells.y8(wyVar.getContext());
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28792a7, y8Var, null);
        }
        return new v4.e1(y8Var);
    }
}

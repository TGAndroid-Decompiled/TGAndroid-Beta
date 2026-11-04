package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class ry extends sg.b {
    public final sy d;

    public ry(sy syVar) {
        this.d = syVar;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f55544f;
        if (i3 != 8 && i3 != 7) {
            return false;
        }
        return true;
    }

    public final u4.h0 F() {
        return this.d.f36102l1.getAdapter();
    }

    @Override
    public final int b() {
        return this.d.X1.size();
    }

    @Override
    public final int d(int i3) {
        return ((vy) this.d.X1.get(i3)).f54715a;
    }

    @Override
    public final void f() {
        F().f();
    }

    @Override
    public final void g(int i3) {
        F().g(i3 + 1);
    }

    @Override
    public final void j(int i3, int i10) {
        F().j(i3 + 1, i10);
    }

    @Override
    public final void k(int i3, int i10) {
        F().k(i3 + 1, i10);
    }

    @Override
    public final void n(int i3, int i10, Object obj) {
        F().n(i3 + 1, i10, obj);
    }

    @Override
    public final void o(int i3, int i10) {
        F().o(i3 + 1, i10);
    }

    @Override
    public final void p(int i3, int i10) {
        F().p(i3 + 1, i10);
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        boolean z10;
        int i10;
        int i11 = d1Var.f55544f;
        View view = d1Var.f55540a;
        ArrayList arrayList = this.d.X1;
        vy vyVar = (vy) arrayList.get(i3);
        int i12 = i3 + 1;
        if (i12 < arrayList.size() && (i10 = ((vy) arrayList.get(i12)).f54715a) != 3 && i10 != 6) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i11 == 7) {
            ((yy) view).e(vyVar.f50640m, z10);
        } else if (i11 != 6 && i11 != 3) {
            if (i11 != 0 && i11 == 8) {
                oy oyVar = (oy) view;
                oyVar.f48379a.setText(org.telegram.messenger.bd.M0(2131751715, null));
                if (oyVar.f48381c != z10) {
                    oyVar.f48381c = z10;
                    oyVar.setWillNotDraw(!z10);
                }
            }
        } else {
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            if (i11 == 6) {
                y8Var.setFixedSize(0);
                y8Var.setText(vyVar.d);
                return;
            }
            y8Var.setFixedSize(12);
            y8Var.setText("");
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View y8Var;
        sy syVar = this.d;
        if (i3 == 8) {
            y8Var = new oy(syVar.getContext());
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27954h5, y8Var, null);
        } else if (i3 == 7) {
            y8Var = new qy(this, syVar.getContext(), syVar.f28583a, syVar.R1.f24237a);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27954h5, y8Var, null);
        } else if (i3 != 6 && i3 != 3) {
            y8Var = new l0(syVar, syVar.getContext());
        } else {
            y8Var = new org.telegram.ui.Cells.y8(syVar.getContext());
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27824a7, y8Var, null);
        }
        return new u4.d1(y8Var);
    }
}

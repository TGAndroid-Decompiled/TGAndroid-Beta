package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class r00 extends ng.b {
    public final t00 d;

    public r00(t00 t00Var) {
        this.d = t00Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f41613f;
        if (i10 != 8 && i10 != 7) {
            return false;
        }
        return true;
    }

    public final s4.h0 F() {
        return this.d.d.getAdapter();
    }

    @Override
    public final int h() {
        return this.d.f36805d0.size();
    }

    @Override
    public final int j(int i10) {
        return ((y00) this.d.f36805d0.get(i10)).f14046a;
    }

    @Override
    public final void l() {
        F().l();
    }

    @Override
    public final void m(int i10) {
        F().m(i10 + 1);
    }

    @Override
    public final void p(int i10, int i11) {
        F().p(i10 + 1, i11);
    }

    @Override
    public final void q(int i10, int i11) {
        F().q(i10 + 1, i11);
    }

    @Override
    public final void r(int i10, int i11, Object obj) {
        F().r(i10 + 1, i11, obj);
    }

    @Override
    public final void s(int i10, int i11) {
        F().s(i10 + 1, i11);
    }

    @Override
    public final void t(int i10, int i11) {
        F().t(i10 + 1, i11);
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        int i11;
        int i12 = c1Var.f41613f;
        View view = c1Var.f41610a;
        ArrayList arrayList = this.d.f36805d0;
        y00 y00Var = (y00) arrayList.get(i10);
        int i13 = i10 + 1;
        if (i13 < arrayList.size() && (i11 = ((y00) arrayList.get(i13)).f14046a) != 3 && i11 != 6) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i12 == 7) {
            ((a10) view).e(y00Var.f38864m, z10);
        } else if (i12 != 6 && i12 != 3) {
            if (i12 != 0 && i12 == 8) {
                o00 o00Var = (o00) view;
                o00Var.f35374a.setText(LocaleController.getString(R.string.CreateNewInviteLink));
                if (o00Var.f35376c != z10) {
                    o00Var.f35376c = z10;
                    o00Var.setWillNotDraw(!z10);
                }
            }
        } else {
            org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
            if (i12 == 6) {
                f9Var.setFixedSize(0);
                f9Var.setText(y00Var.d);
                return;
            }
            f9Var.setFixedSize(12);
            f9Var.setText("");
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View f9Var;
        int i11;
        t00 t00Var = this.d;
        if (i10 == 8) {
            f9Var = new o00(t00Var.getContext());
            f9Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17998h5, false));
        } else if (i10 == 7) {
            Context context = t00Var.getContext();
            i11 = ((org.telegram.ui.ActionBar.h3) t00Var).currentAccount;
            f9Var = new q00(this, context, i11, t00Var.X.f14645id);
            f9Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17998h5, false));
        } else if (i10 != 6 && i10 != 3) {
            f9Var = new s00(t00Var, t00Var.getContext());
        } else {
            f9Var = new org.telegram.ui.Cells.f9(t00Var.getContext());
            f9Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17872a7, false));
        }
        return new s4.c1(f9Var);
    }
}

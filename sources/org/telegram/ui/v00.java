package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class v00 extends pg.b {
    public final x00 d;

    public v00(x00 x00Var) {
        this.d = x00Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f44841f;
        if (i10 != 8 && i10 != 7) {
            return false;
        }
        return true;
    }

    public final s4.g0 F() {
        return this.d.d.getAdapter();
    }

    @Override
    public final int h() {
        return this.d.f41709d0.size();
    }

    @Override
    public final int j(int i10) {
        return ((c10) this.d.f41709d0.get(i10)).f43203a;
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
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        int i11;
        int i12 = b1Var.f44841f;
        View view = b1Var.f44838a;
        ArrayList arrayList = this.d.f41709d0;
        c10 c10Var = (c10) arrayList.get(i10);
        int i13 = i10 + 1;
        if (i13 < arrayList.size() && (i11 = ((c10) arrayList.get(i13)).f43203a) != 3 && i11 != 6) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i12 == 7) {
            ((e10) view).e(c10Var.f34671m, z10);
        } else if (i12 != 6 && i12 != 3) {
            if (i12 != 0 && i12 == 8) {
                s00 s00Var = (s00) view;
                s00Var.f39908a.setText(LocaleController.getString(R.string.CreateNewInviteLink));
                if (s00Var.f39910c != z10) {
                    s00Var.f39910c = z10;
                    s00Var.setWillNotDraw(!z10);
                }
            }
        } else {
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            if (i12 == 6) {
                e9Var.setFixedSize(0);
                e9Var.setText(c10Var.d);
                return;
            }
            e9Var.setFixedSize(12);
            e9Var.setText("");
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View e9Var;
        int i11;
        x00 x00Var = this.d;
        if (i10 == 8) {
            e9Var = new s00(x00Var.getContext());
            e9Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19972h5, false));
        } else if (i10 == 7) {
            Context context = x00Var.getContext();
            i11 = ((org.telegram.ui.ActionBar.e3) x00Var).currentAccount;
            e9Var = new u00(this, context, i11, x00Var.X.f16708id);
            e9Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19972h5, false));
        } else if (i10 != 6 && i10 != 3) {
            e9Var = new w00(x00Var, x00Var.getContext());
        } else {
            e9Var = new org.telegram.ui.Cells.e9(x00Var.getContext());
            e9Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19843a7, false));
        }
        return new s4.b1(e9Var);
    }
}

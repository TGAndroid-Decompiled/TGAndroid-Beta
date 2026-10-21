package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class yz extends pg.b {
    public final a00 d;

    public yz(a00 a00Var) {
        this.d = a00Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f45920f;
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
        return this.d.f35239d0.size();
    }

    @Override
    public final int j(int i10) {
        return ((e00) this.d.f35239d0.get(i10)).f44296a;
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
        int i12 = b1Var.f45920f;
        View view = b1Var.f45917a;
        ArrayList arrayList = this.d.f35239d0;
        e00 e00Var = (e00) arrayList.get(i10);
        int i13 = i10 + 1;
        if (i13 < arrayList.size() && (i11 = ((e00) arrayList.get(i13)).f44296a) != 3 && i11 != 6) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i12 == 7) {
            ((g00) view).e(e00Var.f36480m, z10);
        } else if (i12 != 6 && i12 != 3) {
            if (i12 != 0 && i12 == 8) {
                vz vzVar = (vz) view;
                vzVar.f42415a.setText(LocaleController.getString(R.string.CreateNewInviteLink));
                if (vzVar.f42417c != z10) {
                    vzVar.f42417c = z10;
                    vzVar.setWillNotDraw(!z10);
                }
            }
        } else {
            org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
            if (i12 == 6) {
                d9Var.setFixedSize(0);
                d9Var.setText(e00Var.d);
                return;
            }
            d9Var.setFixedSize(12);
            d9Var.setText("");
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View d9Var;
        int i11;
        a00 a00Var = this.d;
        if (i10 == 8) {
            d9Var = new vz(a00Var.getContext());
            d9Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21061h5, false));
        } else if (i10 == 7) {
            Context context = a00Var.getContext();
            i11 = ((org.telegram.ui.ActionBar.f3) a00Var).currentAccount;
            d9Var = new xz(this, context, i11, a00Var.X.f17799id);
            d9Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21061h5, false));
        } else if (i10 != 6 && i10 != 3) {
            d9Var = new zz(a00Var, a00Var.getContext());
        } else {
            d9Var = new org.telegram.ui.Cells.d9(a00Var.getContext());
            d9Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20932a7, false));
        }
        return new s4.b1(d9Var);
    }
}
